// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ControllerInventoryResponseClient is a client for avi ControllerInventoryResponse resource
type ControllerInventoryResponseClient struct {
	aviSession *session.AviSession
}

// NewControllerInventoryResponseClient creates a new client for ControllerInventoryResponse resource
func NewControllerInventoryResponseClient(aviSession *session.AviSession) *ControllerInventoryResponseClient {
	return &ControllerInventoryResponseClient{aviSession: aviSession}
}

func (client *ControllerInventoryResponseClient) getAPIPath(uuid string) string {
	path := "api/controllerinventoryresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ControllerInventoryResponse objects
func (client *ControllerInventoryResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ControllerInventoryResponse, error) {
	var plist []*models.ControllerInventoryResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ControllerInventoryResponse by uuid
func (client *ControllerInventoryResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ControllerInventoryResponse, error) {
	var obj *models.ControllerInventoryResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ControllerInventoryResponse by name
func (client *ControllerInventoryResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ControllerInventoryResponse, error) {
	var obj *models.ControllerInventoryResponse
	err := client.aviSession.GetObjectByName("controllerinventoryresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ControllerInventoryResponse by filters like name, cloud, tenant
// Api creates ControllerInventoryResponse object with every call.
func (client *ControllerInventoryResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.ControllerInventoryResponse, error) {
	var obj *models.ControllerInventoryResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("controllerinventoryresponse", newOptions...)
	return obj, err
}

// Create a new ControllerInventoryResponse object
func (client *ControllerInventoryResponseClient) Create(obj *models.ControllerInventoryResponse, options ...session.ApiOptionsParams) (*models.ControllerInventoryResponse, error) {
	var robj *models.ControllerInventoryResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ControllerInventoryResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ControllerInventoryResponse
// or it should be json compatible of form map[string]interface{}
func (client *ControllerInventoryResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ControllerInventoryResponse, error) {
	var robj *models.ControllerInventoryResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ControllerInventoryResponse object with a given UUID
func (client *ControllerInventoryResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ControllerInventoryResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
