// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// GslbSMRuntimeClient is a client for avi GslbSMRuntime resource
type GslbSMRuntimeClient struct {
	aviSession *session.AviSession
}

// NewGslbSMRuntimeClient creates a new client for GslbSMRuntime resource
func NewGslbSMRuntimeClient(aviSession *session.AviSession) *GslbSMRuntimeClient {
	return &GslbSMRuntimeClient{aviSession: aviSession}
}

func (client *GslbSMRuntimeClient) getAPIPath(uuid string) string {
	path := "api/gslbsmruntime"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of GslbSMRuntime objects
func (client *GslbSMRuntimeClient) GetAll(options ...session.ApiOptionsParams) ([]*models.GslbSMRuntime, error) {
	var plist []*models.GslbSMRuntime
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing GslbSMRuntime by uuid
func (client *GslbSMRuntimeClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var obj *models.GslbSMRuntime
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing GslbSMRuntime by name
func (client *GslbSMRuntimeClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var obj *models.GslbSMRuntime
	err := client.aviSession.GetObjectByName("gslbsmruntime", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing GslbSMRuntime by filters like name, cloud, tenant
// Api creates GslbSMRuntime object with every call.
func (client *GslbSMRuntimeClient) GetObject(options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var obj *models.GslbSMRuntime
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("gslbsmruntime", newOptions...)
	return obj, err
}

// Create a new GslbSMRuntime object
func (client *GslbSMRuntimeClient) Create(obj *models.GslbSMRuntime, options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var robj *models.GslbSMRuntime
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing GslbSMRuntime object
func (client *GslbSMRuntimeClient) Update(obj *models.GslbSMRuntime, options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var robj *models.GslbSMRuntime
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing GslbSMRuntime object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.GslbSMRuntime
// or it should be json compatible of form map[string]interface{}
func (client *GslbSMRuntimeClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.GslbSMRuntime, error) {
	var robj *models.GslbSMRuntime
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing GslbSMRuntime object with a given UUID
func (client *GslbSMRuntimeClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing GslbSMRuntime object with a given name
func (client *GslbSMRuntimeClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *GslbSMRuntimeClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
