// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// GslbHSMRuntimeClient is a client for avi GslbHSMRuntime resource
type GslbHSMRuntimeClient struct {
	aviSession *session.AviSession
}

// NewGslbHSMRuntimeClient creates a new client for GslbHSMRuntime resource
func NewGslbHSMRuntimeClient(aviSession *session.AviSession) *GslbHSMRuntimeClient {
	return &GslbHSMRuntimeClient{aviSession: aviSession}
}

func (client *GslbHSMRuntimeClient) getAPIPath(uuid string) string {
	path := "api/gslbhsmruntime"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of GslbHSMRuntime objects
func (client *GslbHSMRuntimeClient) GetAll(options ...session.ApiOptionsParams) ([]*models.GslbHSMRuntime, error) {
	var plist []*models.GslbHSMRuntime
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing GslbHSMRuntime by uuid
func (client *GslbHSMRuntimeClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var obj *models.GslbHSMRuntime
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing GslbHSMRuntime by name
func (client *GslbHSMRuntimeClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var obj *models.GslbHSMRuntime
	err := client.aviSession.GetObjectByName("gslbhsmruntime", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing GslbHSMRuntime by filters like name, cloud, tenant
// Api creates GslbHSMRuntime object with every call.
func (client *GslbHSMRuntimeClient) GetObject(options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var obj *models.GslbHSMRuntime
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("gslbhsmruntime", newOptions...)
	return obj, err
}

// Create a new GslbHSMRuntime object
func (client *GslbHSMRuntimeClient) Create(obj *models.GslbHSMRuntime, options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var robj *models.GslbHSMRuntime
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing GslbHSMRuntime object
func (client *GslbHSMRuntimeClient) Update(obj *models.GslbHSMRuntime, options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var robj *models.GslbHSMRuntime
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing GslbHSMRuntime object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.GslbHSMRuntime
// or it should be json compatible of form map[string]interface{}
func (client *GslbHSMRuntimeClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.GslbHSMRuntime, error) {
	var robj *models.GslbHSMRuntime
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing GslbHSMRuntime object with a given UUID
func (client *GslbHSMRuntimeClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing GslbHSMRuntime object with a given name
func (client *GslbHSMRuntimeClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *GslbHSMRuntimeClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
