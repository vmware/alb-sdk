// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// GslbCRMRuntimeClient is a client for avi GslbCRMRuntime resource
type GslbCRMRuntimeClient struct {
	aviSession *session.AviSession
}

// NewGslbCRMRuntimeClient creates a new client for GslbCRMRuntime resource
func NewGslbCRMRuntimeClient(aviSession *session.AviSession) *GslbCRMRuntimeClient {
	return &GslbCRMRuntimeClient{aviSession: aviSession}
}

func (client *GslbCRMRuntimeClient) getAPIPath(uuid string) string {
	path := "api/gslbcrmruntime"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of GslbCRMRuntime objects
func (client *GslbCRMRuntimeClient) GetAll(options ...session.ApiOptionsParams) ([]*models.GslbCRMRuntime, error) {
	var plist []*models.GslbCRMRuntime
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing GslbCRMRuntime by uuid
func (client *GslbCRMRuntimeClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var obj *models.GslbCRMRuntime
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing GslbCRMRuntime by name
func (client *GslbCRMRuntimeClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var obj *models.GslbCRMRuntime
	err := client.aviSession.GetObjectByName("gslbcrmruntime", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing GslbCRMRuntime by filters like name, cloud, tenant
// Api creates GslbCRMRuntime object with every call.
func (client *GslbCRMRuntimeClient) GetObject(options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var obj *models.GslbCRMRuntime
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("gslbcrmruntime", newOptions...)
	return obj, err
}

// Create a new GslbCRMRuntime object
func (client *GslbCRMRuntimeClient) Create(obj *models.GslbCRMRuntime, options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var robj *models.GslbCRMRuntime
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing GslbCRMRuntime object
func (client *GslbCRMRuntimeClient) Update(obj *models.GslbCRMRuntime, options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var robj *models.GslbCRMRuntime
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing GslbCRMRuntime object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.GslbCRMRuntime
// or it should be json compatible of form map[string]interface{}
func (client *GslbCRMRuntimeClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.GslbCRMRuntime, error) {
	var robj *models.GslbCRMRuntime
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing GslbCRMRuntime object with a given UUID
func (client *GslbCRMRuntimeClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing GslbCRMRuntime object with a given name
func (client *GslbCRMRuntimeClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *GslbCRMRuntimeClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
