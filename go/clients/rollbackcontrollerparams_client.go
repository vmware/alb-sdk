// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackControllerParamsClient is a client for avi RollbackControllerParams resource
type RollbackControllerParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackControllerParamsClient creates a new client for RollbackControllerParams resource
func NewRollbackControllerParamsClient(aviSession *session.AviSession) *RollbackControllerParamsClient {
	return &RollbackControllerParamsClient{aviSession: aviSession}
}

func (client *RollbackControllerParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbackcontrollerparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackControllerParams objects
func (client *RollbackControllerParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackControllerParams, error) {
	var plist []*models.RollbackControllerParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackControllerParams by uuid
func (client *RollbackControllerParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackControllerParams, error) {
	var obj *models.RollbackControllerParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackControllerParams by name
func (client *RollbackControllerParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackControllerParams, error) {
	var obj *models.RollbackControllerParams
	err := client.aviSession.GetObjectByName("rollbackcontrollerparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackControllerParams by filters like name, cloud, tenant
// Api creates RollbackControllerParams object with every call.
func (client *RollbackControllerParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackControllerParams, error) {
	var obj *models.RollbackControllerParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbackcontrollerparams", newOptions...)
	return obj, err
}

// Create a new RollbackControllerParams object
func (client *RollbackControllerParamsClient) Create(obj *models.RollbackControllerParams, options ...session.ApiOptionsParams) (*models.RollbackControllerParams, error) {
	var robj *models.RollbackControllerParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackControllerParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackControllerParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackControllerParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackControllerParams, error) {
	var robj *models.RollbackControllerParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackControllerParams object with a given UUID
func (client *RollbackControllerParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackControllerParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
