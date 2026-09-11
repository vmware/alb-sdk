// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackSystemParamsClient is a client for avi RollbackSystemParams resource
type RollbackSystemParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackSystemParamsClient creates a new client for RollbackSystemParams resource
func NewRollbackSystemParamsClient(aviSession *session.AviSession) *RollbackSystemParamsClient {
	return &RollbackSystemParamsClient{aviSession: aviSession}
}

func (client *RollbackSystemParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbacksystemparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackSystemParams objects
func (client *RollbackSystemParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackSystemParams, error) {
	var plist []*models.RollbackSystemParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackSystemParams by uuid
func (client *RollbackSystemParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackSystemParams, error) {
	var obj *models.RollbackSystemParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackSystemParams by name
func (client *RollbackSystemParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackSystemParams, error) {
	var obj *models.RollbackSystemParams
	err := client.aviSession.GetObjectByName("rollbacksystemparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackSystemParams by filters like name, cloud, tenant
// Api creates RollbackSystemParams object with every call.
func (client *RollbackSystemParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackSystemParams, error) {
	var obj *models.RollbackSystemParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbacksystemparams", newOptions...)
	return obj, err
}

// Create a new RollbackSystemParams object
func (client *RollbackSystemParamsClient) Create(obj *models.RollbackSystemParams, options ...session.ApiOptionsParams) (*models.RollbackSystemParams, error) {
	var robj *models.RollbackSystemParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackSystemParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackSystemParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackSystemParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackSystemParams, error) {
	var robj *models.RollbackSystemParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackSystemParams object with a given UUID
func (client *RollbackSystemParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackSystemParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
