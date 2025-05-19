// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package test

import (
	"fmt"
	"os"
	"testing"

	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

func TestApiClientCollections(t *testing.T) {
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")),
		session.SetInsecure)

	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		t.Fail()
	}
	cv, err := aviClient.AviSession.GetControllerVersion()
	fmt.Printf("Avi Controller Version: %v:%v\n", cv, err)

	profileData, err := aviClient.ApplicationProfile.GetAll()
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	} else {
		if len(profileData) != 11 {
			fmt.Println("\n [ERROR] Expected was 11, Got: ", len(profileData))
			t.Fail()
		}
	}

	sslProfileData, err := aviClient.SSLProfile.GetAll()
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	} else {
		if len(sslProfileData) != 3 {
			fmt.Println("\n [ERROR] Expected was 3, Got: ", len(sslProfileData))
			t.Fail()
		}
	}

	// Create 30 tenants
	tenantobj := models.Tenant{}

	for i := 1; i <= 30; i++ {
		name := fmt.Sprintf("avinetworks-%d", i)
		tenantobj.Name = &name
		_, err := aviClient.Tenant.Create(&tenantobj)
		if err != nil {
			fmt.Println("\n Tenant creation failed: ", err)
			t.Fail()
		}
	}

	tenantData, err := aviClient.Tenant.GetAll()
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	} else {
		if len(tenantData) != 31 {
			fmt.Println("\n [ERROR] Expected was 31, Got: ", len(tenantData))
			t.Fail()
		}
	}
	for i := 1; i <= 30; i++ {
		name := fmt.Sprintf("avinetworks-%d", i)
		err := aviClient.Tenant.DeleteByName(name)
		if err != nil {
			fmt.Println("\n Tenant creation failed: ", err)
			t.Fail()
		}
	}
}

func TestApiFilters(t *testing.T) {
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")),
		session.SetInsecure)

	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		t.Fail()
	}
	cv, err := aviClient.AviSession.GetControllerVersion()
	fmt.Printf("Avi Controller Version: %v:%v\n", cv, err)

	params := map[string]string{
		"page_size": "3",
		"page":      "1",
		"tenant":    "admin",
	}

	hmData, err := aviClient.HealthMonitor.GetAll(session.SetParams(params))
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	} else {
		fmt.Println("\n Health monitors : ", hmData)
		if len(hmData) != 3 {
			t.Fail()
		}
	}

	params1 := map[string]string{
		"page":   "1",
		"tenant": "admin",
	}
	data, err := aviClient.HealthMonitor.GetObject(session.SetParams(params1), session.SetName("Test-Healthmonitor"))
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	} else {
		fmt.Println("\n Health monitor object  : ", *data)
	}
}

func TestApiCollections(t *testing.T) {
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")),
		session.SetInsecure)

	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		t.Fail()
	}
	cv, err := aviClient.AviSession.GetControllerVersion()
	fmt.Printf("Avi Controller Version: %v:%v\n", cv, err)

	params := map[string]string{
		"page":      "1",
		"page_size": "1",
		"tenant":    "admin",
	}

	url := "api/healthmonitor"
	hmCollectionData, err := aviClient.AviSession.GetCollectionRaw(url, session.SetParams(params))
	if err != nil {
		fmt.Println("\n [ERROR] : ", err)
		t.Fail()
	}
	if hmCollectionData.Next != "" {
		fmt.Println("\n Health Monitor page_size=1 Next url string : ", hmCollectionData.Next)
	} else {
		fmt.Println("\n Health Monitor Next url string not found")
		t.Fail()
	}
}
