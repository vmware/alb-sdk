// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PatchControllerParamsClient is a client for avi PatchControllerParams resource
type PatchControllerParamsClient struct {
	aviSession *session.AviSession
}

// NewPatchControllerParamsClient creates a new client for PatchControllerParams resource
func NewPatchControllerParamsClient(aviSession *session.AviSession) *PatchControllerParamsClient {
	return &PatchControllerParamsClient{aviSession: aviSession}
}

func (client *PatchControllerParamsClient) getAPIPath(uuid string) string {
	path := "api/patchcontrollerparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PatchControllerParams objects
func (client *PatchControllerParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PatchControllerParams, error) {
	var plist []*models.PatchControllerParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PatchControllerParams by uuid
func (client *PatchControllerParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PatchControllerParams, error) {
	var obj *models.PatchControllerParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PatchControllerParams by name
func (client *PatchControllerParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PatchControllerParams, error) {
	var obj *models.PatchControllerParams
	err := client.aviSession.GetObjectByName("patchcontrollerparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PatchControllerParams by filters like name, cloud, tenant
// Api creates PatchControllerParams object with every call.
func (client *PatchControllerParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.PatchControllerParams, error) {
	var obj *models.PatchControllerParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("patchcontrollerparams", newOptions...)
	return obj, err
}

// Create a new PatchControllerParams object
func (client *PatchControllerParamsClient) Create(obj *models.PatchControllerParams, options ...session.ApiOptionsParams) (*models.PatchControllerParams, error) {
	var robj *models.PatchControllerParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing PatchControllerParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PatchControllerParams
// or it should be json compatible of form map[string]interface{}
func (client *PatchControllerParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PatchControllerParams, error) {
	var robj *models.PatchControllerParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PatchControllerParams object with a given UUID
func (client *PatchControllerParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *PatchControllerParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
