// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackPatchControllerParamsClient is a client for avi RollbackPatchControllerParams resource
type RollbackPatchControllerParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackPatchControllerParamsClient creates a new client for RollbackPatchControllerParams resource
func NewRollbackPatchControllerParamsClient(aviSession *session.AviSession) *RollbackPatchControllerParamsClient {
	return &RollbackPatchControllerParamsClient{aviSession: aviSession}
}

func (client *RollbackPatchControllerParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbackpatchcontrollerparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackPatchControllerParams objects
func (client *RollbackPatchControllerParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackPatchControllerParams, error) {
	var plist []*models.RollbackPatchControllerParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackPatchControllerParams by uuid
func (client *RollbackPatchControllerParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackPatchControllerParams, error) {
	var obj *models.RollbackPatchControllerParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackPatchControllerParams by name
func (client *RollbackPatchControllerParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackPatchControllerParams, error) {
	var obj *models.RollbackPatchControllerParams
	err := client.aviSession.GetObjectByName("rollbackpatchcontrollerparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackPatchControllerParams by filters like name, cloud, tenant
// Api creates RollbackPatchControllerParams object with every call.
func (client *RollbackPatchControllerParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackPatchControllerParams, error) {
	var obj *models.RollbackPatchControllerParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbackpatchcontrollerparams", newOptions...)
	return obj, err
}

// Create a new RollbackPatchControllerParams object
func (client *RollbackPatchControllerParamsClient) Create(obj *models.RollbackPatchControllerParams, options ...session.ApiOptionsParams) (*models.RollbackPatchControllerParams, error) {
	var robj *models.RollbackPatchControllerParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackPatchControllerParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackPatchControllerParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackPatchControllerParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackPatchControllerParams, error) {
	var robj *models.RollbackPatchControllerParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackPatchControllerParams object with a given UUID
func (client *RollbackPatchControllerParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackPatchControllerParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
