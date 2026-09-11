// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RestoreParamsClient is a client for avi RestoreParams resource
type RestoreParamsClient struct {
	aviSession *session.AviSession
}

// NewRestoreParamsClient creates a new client for RestoreParams resource
func NewRestoreParamsClient(aviSession *session.AviSession) *RestoreParamsClient {
	return &RestoreParamsClient{aviSession: aviSession}
}

func (client *RestoreParamsClient) getAPIPath(uuid string) string {
	path := "api/restoreparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RestoreParams objects
func (client *RestoreParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RestoreParams, error) {
	var plist []*models.RestoreParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RestoreParams by uuid
func (client *RestoreParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RestoreParams, error) {
	var obj *models.RestoreParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RestoreParams by name
func (client *RestoreParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RestoreParams, error) {
	var obj *models.RestoreParams
	err := client.aviSession.GetObjectByName("restoreparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RestoreParams by filters like name, cloud, tenant
// Api creates RestoreParams object with every call.
func (client *RestoreParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RestoreParams, error) {
	var obj *models.RestoreParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("restoreparams", newOptions...)
	return obj, err
}

// Create a new RestoreParams object
func (client *RestoreParamsClient) Create(obj *models.RestoreParams, options ...session.ApiOptionsParams) (*models.RestoreParams, error) {
	var robj *models.RestoreParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RestoreParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RestoreParams
// or it should be json compatible of form map[string]interface{}
func (client *RestoreParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RestoreParams, error) {
	var robj *models.RestoreParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RestoreParams object with a given UUID
func (client *RestoreParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RestoreParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
