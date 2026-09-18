// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PoolInventoryServerListClient is a client for avi PoolInventoryServerList resource
type PoolInventoryServerListClient struct {
	aviSession *session.AviSession
}

// NewPoolInventoryServerListClient creates a new client for PoolInventoryServerList resource
func NewPoolInventoryServerListClient(aviSession *session.AviSession) *PoolInventoryServerListClient {
	return &PoolInventoryServerListClient{aviSession: aviSession}
}

func (client *PoolInventoryServerListClient) getAPIPath(uuid string) string {
	path := "api/poolinventoryserverlist"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PoolInventoryServerList objects
func (client *PoolInventoryServerListClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PoolInventoryServerList, error) {
	var plist []*models.PoolInventoryServerList
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PoolInventoryServerList by uuid
func (client *PoolInventoryServerListClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PoolInventoryServerList, error) {
	var obj *models.PoolInventoryServerList
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PoolInventoryServerList by name
func (client *PoolInventoryServerListClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PoolInventoryServerList, error) {
	var obj *models.PoolInventoryServerList
	err := client.aviSession.GetObjectByName("poolinventoryserverlist", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PoolInventoryServerList by filters like name, cloud, tenant
// Api creates PoolInventoryServerList object with every call.
func (client *PoolInventoryServerListClient) GetObject(options ...session.ApiOptionsParams) (*models.PoolInventoryServerList, error) {
	var obj *models.PoolInventoryServerList
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("poolinventoryserverlist", newOptions...)
	return obj, err
}

// Create a new PoolInventoryServerList object
func (client *PoolInventoryServerListClient) Create(obj *models.PoolInventoryServerList, options ...session.ApiOptionsParams) (*models.PoolInventoryServerList, error) {
	var robj *models.PoolInventoryServerList
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing PoolInventoryServerList object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PoolInventoryServerList
// or it should be json compatible of form map[string]interface{}
func (client *PoolInventoryServerListClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PoolInventoryServerList, error) {
	var robj *models.PoolInventoryServerList
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PoolInventoryServerList object with a given UUID
func (client *PoolInventoryServerListClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *PoolInventoryServerListClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
