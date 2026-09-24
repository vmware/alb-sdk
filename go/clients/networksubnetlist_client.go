// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// NetworkSubnetListClient is a client for avi NetworkSubnetList resource
type NetworkSubnetListClient struct {
	aviSession *session.AviSession
}

// NewNetworkSubnetListClient creates a new client for NetworkSubnetList resource
func NewNetworkSubnetListClient(aviSession *session.AviSession) *NetworkSubnetListClient {
	return &NetworkSubnetListClient{aviSession: aviSession}
}

func (client *NetworkSubnetListClient) getAPIPath(uuid string) string {
	path := "api/networksubnetlist"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of NetworkSubnetList objects
func (client *NetworkSubnetListClient) GetAll(options ...session.ApiOptionsParams) ([]*models.NetworkSubnetList, error) {
	var plist []*models.NetworkSubnetList
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing NetworkSubnetList by uuid
func (client *NetworkSubnetListClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.NetworkSubnetList, error) {
	var obj *models.NetworkSubnetList
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing NetworkSubnetList by name
func (client *NetworkSubnetListClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.NetworkSubnetList, error) {
	var obj *models.NetworkSubnetList
	err := client.aviSession.GetObjectByName("networksubnetlist", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing NetworkSubnetList by filters like name, cloud, tenant
// Api creates NetworkSubnetList object with every call.
func (client *NetworkSubnetListClient) GetObject(options ...session.ApiOptionsParams) (*models.NetworkSubnetList, error) {
	var obj *models.NetworkSubnetList
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("networksubnetlist", newOptions...)
	return obj, err
}

// Create a new NetworkSubnetList object
func (client *NetworkSubnetListClient) Create(obj *models.NetworkSubnetList, options ...session.ApiOptionsParams) (*models.NetworkSubnetList, error) {
	var robj *models.NetworkSubnetList
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing NetworkSubnetList object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.NetworkSubnetList
// or it should be json compatible of form map[string]interface{}
func (client *NetworkSubnetListClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.NetworkSubnetList, error) {
	var robj *models.NetworkSubnetList
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing NetworkSubnetList object with a given UUID
func (client *NetworkSubnetListClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *NetworkSubnetListClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
