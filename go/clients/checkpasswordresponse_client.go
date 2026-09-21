// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// CheckPasswordResponseClient is a client for avi CheckPasswordResponse resource
type CheckPasswordResponseClient struct {
	aviSession *session.AviSession
}

// NewCheckPasswordResponseClient creates a new client for CheckPasswordResponse resource
func NewCheckPasswordResponseClient(aviSession *session.AviSession) *CheckPasswordResponseClient {
	return &CheckPasswordResponseClient{aviSession: aviSession}
}

func (client *CheckPasswordResponseClient) getAPIPath(uuid string) string {
	path := "api/checkpasswordresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of CheckPasswordResponse objects
func (client *CheckPasswordResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.CheckPasswordResponse, error) {
	var plist []*models.CheckPasswordResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing CheckPasswordResponse by uuid
func (client *CheckPasswordResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.CheckPasswordResponse, error) {
	var obj *models.CheckPasswordResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing CheckPasswordResponse by name
func (client *CheckPasswordResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.CheckPasswordResponse, error) {
	var obj *models.CheckPasswordResponse
	err := client.aviSession.GetObjectByName("checkpasswordresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing CheckPasswordResponse by filters like name, cloud, tenant
// Api creates CheckPasswordResponse object with every call.
func (client *CheckPasswordResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.CheckPasswordResponse, error) {
	var obj *models.CheckPasswordResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("checkpasswordresponse", newOptions...)
	return obj, err
}

// Create a new CheckPasswordResponse object
func (client *CheckPasswordResponseClient) Create(obj *models.CheckPasswordResponse, options ...session.ApiOptionsParams) (*models.CheckPasswordResponse, error) {
	var robj *models.CheckPasswordResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing CheckPasswordResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.CheckPasswordResponse
// or it should be json compatible of form map[string]interface{}
func (client *CheckPasswordResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.CheckPasswordResponse, error) {
	var robj *models.CheckPasswordResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing CheckPasswordResponse object with a given UUID
func (client *CheckPasswordResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *CheckPasswordResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
