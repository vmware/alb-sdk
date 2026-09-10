// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackPatchSystemParamsClient is a client for avi RollbackPatchSystemParams resource
type RollbackPatchSystemParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackPatchSystemParamsClient creates a new client for RollbackPatchSystemParams resource
func NewRollbackPatchSystemParamsClient(aviSession *session.AviSession) *RollbackPatchSystemParamsClient {
	return &RollbackPatchSystemParamsClient{aviSession: aviSession}
}

func (client *RollbackPatchSystemParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbackpatchsystemparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackPatchSystemParams objects
func (client *RollbackPatchSystemParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackPatchSystemParams, error) {
	var plist []*models.RollbackPatchSystemParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackPatchSystemParams by uuid
func (client *RollbackPatchSystemParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackPatchSystemParams, error) {
	var obj *models.RollbackPatchSystemParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackPatchSystemParams by name
func (client *RollbackPatchSystemParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackPatchSystemParams, error) {
	var obj *models.RollbackPatchSystemParams
	err := client.aviSession.GetObjectByName("rollbackpatchsystemparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackPatchSystemParams by filters like name, cloud, tenant
// Api creates RollbackPatchSystemParams object with every call.
func (client *RollbackPatchSystemParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackPatchSystemParams, error) {
	var obj *models.RollbackPatchSystemParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbackpatchsystemparams", newOptions...)
	return obj, err
}

// Create a new RollbackPatchSystemParams object
func (client *RollbackPatchSystemParamsClient) Create(obj *models.RollbackPatchSystemParams, options ...session.ApiOptionsParams) (*models.RollbackPatchSystemParams, error) {
	var robj *models.RollbackPatchSystemParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackPatchSystemParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackPatchSystemParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackPatchSystemParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackPatchSystemParams, error) {
	var robj *models.RollbackPatchSystemParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackPatchSystemParams object with a given UUID
func (client *RollbackPatchSystemParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackPatchSystemParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
