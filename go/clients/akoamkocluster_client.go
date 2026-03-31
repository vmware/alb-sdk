// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// AkoAmkoClusterClient is a client for avi AkoAmkoCluster resource
type AkoAmkoClusterClient struct {
	aviSession *session.AviSession
}

// NewAkoAmkoClusterClient creates a new client for AkoAmkoCluster resource
func NewAkoAmkoClusterClient(aviSession *session.AviSession) *AkoAmkoClusterClient {
	return &AkoAmkoClusterClient{aviSession: aviSession}
}

func (client *AkoAmkoClusterClient) getAPIPath(uuid string) string {
	path := "api/akoamkocluster"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of AkoAmkoCluster objects
func (client *AkoAmkoClusterClient) GetAll(options ...session.ApiOptionsParams) ([]*models.AkoAmkoCluster, error) {
	var plist []*models.AkoAmkoCluster
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing AkoAmkoCluster by uuid
func (client *AkoAmkoClusterClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var obj *models.AkoAmkoCluster
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing AkoAmkoCluster by name
func (client *AkoAmkoClusterClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var obj *models.AkoAmkoCluster
	err := client.aviSession.GetObjectByName("akoamkocluster", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing AkoAmkoCluster by filters like name, cloud, tenant
// Api creates AkoAmkoCluster object with every call.
func (client *AkoAmkoClusterClient) GetObject(options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var obj *models.AkoAmkoCluster
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("akoamkocluster", newOptions...)
	return obj, err
}

// Create a new AkoAmkoCluster object
func (client *AkoAmkoClusterClient) Create(obj *models.AkoAmkoCluster, options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var robj *models.AkoAmkoCluster
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing AkoAmkoCluster object
func (client *AkoAmkoClusterClient) Update(obj *models.AkoAmkoCluster, options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var robj *models.AkoAmkoCluster
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing AkoAmkoCluster object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.AkoAmkoCluster
// or it should be json compatible of form map[string]interface{}
func (client *AkoAmkoClusterClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.AkoAmkoCluster, error) {
	var robj *models.AkoAmkoCluster
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing AkoAmkoCluster object with a given UUID
func (client *AkoAmkoClusterClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing AkoAmkoCluster object with a given name
func (client *AkoAmkoClusterClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *AkoAmkoClusterClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
