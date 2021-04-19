// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package test

import (
	"os"
	"testing"

	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/session"
)

func TestAviError(t *testing.T) {
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")))

	if err != nil {
		t.Log("Couldn't create session: ", err)
		t.Fail()
	}

	var resp interface{}
	// querying a non existent REST API Endpoint
	err = aviClient.AviSession.Get("/api/abcd", &resp)

	// get err as an instance of session.AviError
	aviError, ok := err.(session.AviError)
	if ok && aviError.HttpStatusCode == 404 {
		t.Logf("Error Code 404 for %s: %s\n", aviError.Verb, aviError.Url)
		return
	}

	t.Fail()
}
