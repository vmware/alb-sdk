// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// InitialDataClient is a client for avi InitialData resource
type InitialDataClient struct {
	aviSession *session.AviSession
}

// NewInitialDataClient creates a new client for InitialData resource
func NewInitialDataClient(aviSession *session.AviSession) *InitialDataClient {
	return &InitialDataClient{aviSession: aviSession}
}

func (client *InitialDataClient) getAPIPath(uuid string) string {
	path := "api/initialdata"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of InitialData objects
func (client *InitialDataClient) GetAll(options ...session.ApiOptionsParams) ([]*models.InitialData, error) {
	var plist []*models.InitialData
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing InitialData by uuid
func (client *InitialDataClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.InitialData, error) {
	var obj *models.InitialData
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing InitialData by name
func (client *InitialDataClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.InitialData, error) {
	var obj *models.InitialData
	err := client.aviSession.GetObjectByName("initialdata", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing InitialData by filters like name, cloud, tenant
// Api creates InitialData object with every call.
func (client *InitialDataClient) GetObject(options ...session.ApiOptionsParams) (*models.InitialData, error) {
	var obj *models.InitialData
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("initialdata", newOptions...)
	return obj, err
}

// Create a new InitialData object
func (client *InitialDataClient) Create(obj *models.InitialData, options ...session.ApiOptionsParams) (*models.InitialData, error) {
	var robj *models.InitialData
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing InitialData object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.InitialData
// or it should be json compatible of form map[string]interface{}
func (client *InitialDataClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.InitialData, error) {
	var robj *models.InitialData
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing InitialData object with a given UUID
func (client *InitialDataClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *InitialDataClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
