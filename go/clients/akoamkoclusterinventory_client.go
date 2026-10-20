// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// AkoAmkoClusterInventoryClient is a client for avi AkoAmkoClusterInventory resource
type AkoAmkoClusterInventoryClient struct {
	aviSession *session.AviSession
}

// NewAkoAmkoClusterInventoryClient creates a new client for AkoAmkoClusterInventory resource
func NewAkoAmkoClusterInventoryClient(aviSession *session.AviSession) *AkoAmkoClusterInventoryClient {
	return &AkoAmkoClusterInventoryClient{aviSession: aviSession}
}

func (client *AkoAmkoClusterInventoryClient) getAPIPath(uuid string) string {
	path := "api/akoamkoclusterinventory"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of AkoAmkoClusterInventory objects
func (client *AkoAmkoClusterInventoryClient) GetAll(options ...session.ApiOptionsParams) ([]*models.AkoAmkoClusterInventory, error) {
	var plist []*models.AkoAmkoClusterInventory
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing AkoAmkoClusterInventory by uuid
func (client *AkoAmkoClusterInventoryClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.AkoAmkoClusterInventory, error) {
	var obj *models.AkoAmkoClusterInventory
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing AkoAmkoClusterInventory by name
func (client *AkoAmkoClusterInventoryClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.AkoAmkoClusterInventory, error) {
	var obj *models.AkoAmkoClusterInventory
	err := client.aviSession.GetObjectByName("akoamkoclusterinventory", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing AkoAmkoClusterInventory by filters like name, cloud, tenant
// Api creates AkoAmkoClusterInventory object with every call.
func (client *AkoAmkoClusterInventoryClient) GetObject(options ...session.ApiOptionsParams) (*models.AkoAmkoClusterInventory, error) {
	var obj *models.AkoAmkoClusterInventory
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("akoamkoclusterinventory", newOptions...)
	return obj, err
}

// Create a new AkoAmkoClusterInventory object
func (client *AkoAmkoClusterInventoryClient) Create(obj *models.AkoAmkoClusterInventory, options ...session.ApiOptionsParams) (*models.AkoAmkoClusterInventory, error) {
	var robj *models.AkoAmkoClusterInventory
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing AkoAmkoClusterInventory object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.AkoAmkoClusterInventory
// or it should be json compatible of form map[string]interface{}
func (client *AkoAmkoClusterInventoryClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.AkoAmkoClusterInventory, error) {
	var robj *models.AkoAmkoClusterInventory
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing AkoAmkoClusterInventory object with a given UUID
func (client *AkoAmkoClusterInventoryClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *AkoAmkoClusterInventoryClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
