// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package main

import (
	"crypto/tls"
	"fmt"
	"net/http"
	"os"
	"reflect"
	"strings"
	"testing"

	"time"

	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/session"
)

// getSessionDetails uses reflection to access private session fields
func getSessionDetails(aviSession *session.AviSession) (sessionID, csrfToken string) {
	// Use reflection to access private fields
	v := reflect.ValueOf(aviSession).Elem()
	sessionID = v.FieldByName("sessionid").String()
	csrfToken = v.FieldByName("csrfToken").String()
	return sessionID, csrfToken
}

func TestInvalidSession(t *testing.T) {
	fmt.Println("=== 401 Error Message Test ===")
	fmt.Println("This test will make API calls in a loop.")
	fmt.Println("You can manually call logout externally to trigger a 401 error.")
	fmt.Println()

	// Create session with DisableControllerStatusCheck to test transparent error passing
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")),
		session.DisableControllerStatusCheckOnFailure(true),
	)
	if err != nil {
		fmt.Println("❌ Couldn't create session:", err)
		t.Fail()
	}

	cv, err := aviClient.AviSession.GetControllerVersion()
	if err != nil {
		fmt.Println("❌ Couldn't get controller version:", err)
		t.Fail()
	}
	fmt.Printf("✓ Avi Controller Version: %v\n", cv)

	// Print session details using reflection to access private fields
	fmt.Println("\n=== Session Details ===")
	sessionID, csrfToken := getSessionDetails(aviClient.AviSession)
	fmt.Println()

	// Provide curl command for manual logout
	fmt.Println("=== Manual Logout Command ===")
	fmt.Println("To trigger a 401 error, run this command in another terminal:")
	fmt.Println()

	fmt.Println("\nStarting test loop...")
	fmt.Println("=" + strings.Repeat("=", 60))

	for i := 1; i <= 5; i++ {
		fmt.Printf("\n[Iteration %d] Making API call at %s\n", i, time.Now().Format("15:04:05"))

		// Try to get a pool
		pool, err := aviClient.ServiceEngineGroup.GetByName("Default-Group")

		if err != nil {
			fmt.Printf("❌ Error fetching pool: %v\n", err)

			// Check if error message contains detailed controller response
			errStr := err.Error()
			if strings.Contains(errStr, "Authentication credentials were not provided") {
				fmt.Println("✓ PASS: Error message contains 'Authentication credentials were not provided'")
			} else if strings.Contains(errStr, "error from Controller:") {
				fmt.Println("✓ PASS: Error message contains detailed controller response")
			} else if strings.Contains(errStr, "HTTP code: 401") {
				if strings.Contains(errStr, "error from Controller:") || strings.Contains(errStr, "detail:") {
					fmt.Println("✓ PASS: 401 error with detailed message")
				} else {
					fmt.Println("⚠ PARTIAL: 401 error but message might be missing details")
				}
			}

			// Print full error for inspection
			fmt.Println("\nFull error message:")
			fmt.Println(errStr)

			// Continue loop to retry
			fmt.Println("\nWaiting 5 seconds before retry...")
			time.Sleep(5 * time.Second)
			continue
		}

		fmt.Printf("✓ Successfully fetched pool: %s\n", *pool.Name)

		// Wait between iterations
		fmt.Printf("Waiting 3 seconds before next call... (Iteration %d/100)\n", i)
		time.Sleep(3 * time.Second)

		if i == 3 {
			if sessionID != "" && csrfToken != "" {
				// Construct the URL for logout
				logoutURL := "https://" + os.Getenv("AVI_CONTROLLER") + "/logout"

				// Create a new HTTP client with insecure skip verify
				tr := &http.Transport{
					TLSClientConfig: &tls.Config{InsecureSkipVerify: true},
				}
				client := &http.Client{Transport: tr}

				// Create a new POST request
				req, err := http.NewRequest("POST", logoutURL, nil)
				if err != nil {
					fmt.Printf("Error creating logout request: %v\n", err)
				} else {
					// Set headers
					req.Header.Set("X-CSRFToken", csrfToken)
					req.Header.Set("Referer", "https://"+os.Getenv("AVI_CONTROLLER")+"/")
					req.Header.Set("Cookie", fmt.Sprintf("sessionid=%s; csrftoken=%s; avi-sessionid=%s", sessionID, csrfToken, sessionID))

				}
				fmt.Printf("CSRF Token:  %s\n", csrfToken)
				_, err = client.Do(req)
				if err != nil {
					t.Fail()
				}
			}
		}
	}

	fmt.Println("\n=== Test Complete ===")
}
