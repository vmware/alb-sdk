// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LicensingActionResultClient is a client for avi LicensingActionResult resource
type LicensingActionResultClient struct {
	aviSession *session.AviSession
}

// NewLicensingActionResultClient creates a new client for LicensingActionResult resource
func NewLicensingActionResultClient(aviSession *session.AviSession) *LicensingActionResultClient {
	return &LicensingActionResultClient{aviSession: aviSession}
}

func (client *LicensingActionResultClient) getAPIPath(uuid string) string {
	path := "api/licensingactionresult"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LicensingActionResult objects
func (client *LicensingActionResultClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LicensingActionResult, error) {
	var plist []*models.LicensingActionResult
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LicensingActionResult by uuid
func (client *LicensingActionResultClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LicensingActionResult, error) {
	var obj *models.LicensingActionResult
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LicensingActionResult by name
func (client *LicensingActionResultClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LicensingActionResult, error) {
	var obj *models.LicensingActionResult
	err := client.aviSession.GetObjectByName("licensingactionresult", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LicensingActionResult by filters like name, cloud, tenant
// Api creates LicensingActionResult object with every call.
func (client *LicensingActionResultClient) GetObject(options ...session.ApiOptionsParams) (*models.LicensingActionResult, error) {
	var obj *models.LicensingActionResult
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("licensingactionresult", newOptions...)
	return obj, err
}

// Create a new LicensingActionResult object
func (client *LicensingActionResultClient) Create(obj *models.LicensingActionResult, options ...session.ApiOptionsParams) (*models.LicensingActionResult, error) {
	var robj *models.LicensingActionResult
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing LicensingActionResult object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LicensingActionResult
// or it should be json compatible of form map[string]interface{}
func (client *LicensingActionResultClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LicensingActionResult, error) {
	var robj *models.LicensingActionResult
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LicensingActionResult object with a given UUID
func (client *LicensingActionResultClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *LicensingActionResultClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
