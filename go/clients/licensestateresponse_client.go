// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LicenseStateResponseClient is a client for avi LicenseStateResponse resource
type LicenseStateResponseClient struct {
	aviSession *session.AviSession
}

// NewLicenseStateResponseClient creates a new client for LicenseStateResponse resource
func NewLicenseStateResponseClient(aviSession *session.AviSession) *LicenseStateResponseClient {
	return &LicenseStateResponseClient{aviSession: aviSession}
}

func (client *LicenseStateResponseClient) getAPIPath(uuid string) string {
	path := "api/licensestateresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LicenseStateResponse objects
func (client *LicenseStateResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LicenseStateResponse, error) {
	var plist []*models.LicenseStateResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LicenseStateResponse by uuid
func (client *LicenseStateResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LicenseStateResponse, error) {
	var obj *models.LicenseStateResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LicenseStateResponse by name
func (client *LicenseStateResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LicenseStateResponse, error) {
	var obj *models.LicenseStateResponse
	err := client.aviSession.GetObjectByName("licensestateresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LicenseStateResponse by filters like name, cloud, tenant
// Api creates LicenseStateResponse object with every call.
func (client *LicenseStateResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.LicenseStateResponse, error) {
	var obj *models.LicenseStateResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("licensestateresponse", newOptions...)
	return obj, err
}

// Create a new LicenseStateResponse object
func (client *LicenseStateResponseClient) Create(obj *models.LicenseStateResponse, options ...session.ApiOptionsParams) (*models.LicenseStateResponse, error) {
	var robj *models.LicenseStateResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing LicenseStateResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LicenseStateResponse
// or it should be json compatible of form map[string]interface{}
func (client *LicenseStateResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LicenseStateResponse, error) {
	var robj *models.LicenseStateResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LicenseStateResponse object with a given UUID
func (client *LicenseStateResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *LicenseStateResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
