// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// InventoryMapResponseClient is a client for avi InventoryMapResponse resource
type InventoryMapResponseClient struct {
	aviSession *session.AviSession
}

// NewInventoryMapResponseClient creates a new client for InventoryMapResponse resource
func NewInventoryMapResponseClient(aviSession *session.AviSession) *InventoryMapResponseClient {
	return &InventoryMapResponseClient{aviSession: aviSession}
}

func (client *InventoryMapResponseClient) getAPIPath(uuid string) string {
	path := "api/inventorymapresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of InventoryMapResponse objects
func (client *InventoryMapResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.InventoryMapResponse, error) {
	var plist []*models.InventoryMapResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing InventoryMapResponse by uuid
func (client *InventoryMapResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.InventoryMapResponse, error) {
	var obj *models.InventoryMapResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing InventoryMapResponse by name
func (client *InventoryMapResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.InventoryMapResponse, error) {
	var obj *models.InventoryMapResponse
	err := client.aviSession.GetObjectByName("inventorymapresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing InventoryMapResponse by filters like name, cloud, tenant
// Api creates InventoryMapResponse object with every call.
func (client *InventoryMapResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.InventoryMapResponse, error) {
	var obj *models.InventoryMapResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("inventorymapresponse", newOptions...)
	return obj, err
}

// Create a new InventoryMapResponse object
func (client *InventoryMapResponseClient) Create(obj *models.InventoryMapResponse, options ...session.ApiOptionsParams) (*models.InventoryMapResponse, error) {
	var robj *models.InventoryMapResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing InventoryMapResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.InventoryMapResponse
// or it should be json compatible of form map[string]interface{}
func (client *InventoryMapResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.InventoryMapResponse, error) {
	var robj *models.InventoryMapResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing InventoryMapResponse object with a given UUID
func (client *InventoryMapResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *InventoryMapResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
