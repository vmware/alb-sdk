// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackSeGroupParamsClient is a client for avi RollbackSeGroupParams resource
type RollbackSeGroupParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackSeGroupParamsClient creates a new client for RollbackSeGroupParams resource
func NewRollbackSeGroupParamsClient(aviSession *session.AviSession) *RollbackSeGroupParamsClient {
	return &RollbackSeGroupParamsClient{aviSession: aviSession}
}

func (client *RollbackSeGroupParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbacksegroupparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackSeGroupParams objects
func (client *RollbackSeGroupParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackSeGroupParams, error) {
	var plist []*models.RollbackSeGroupParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackSeGroupParams by uuid
func (client *RollbackSeGroupParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackSeGroupParams, error) {
	var obj *models.RollbackSeGroupParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackSeGroupParams by name
func (client *RollbackSeGroupParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackSeGroupParams, error) {
	var obj *models.RollbackSeGroupParams
	err := client.aviSession.GetObjectByName("rollbacksegroupparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackSeGroupParams by filters like name, cloud, tenant
// Api creates RollbackSeGroupParams object with every call.
func (client *RollbackSeGroupParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackSeGroupParams, error) {
	var obj *models.RollbackSeGroupParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbacksegroupparams", newOptions...)
	return obj, err
}

// Create a new RollbackSeGroupParams object
func (client *RollbackSeGroupParamsClient) Create(obj *models.RollbackSeGroupParams, options ...session.ApiOptionsParams) (*models.RollbackSeGroupParams, error) {
	var robj *models.RollbackSeGroupParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackSeGroupParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackSeGroupParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackSeGroupParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackSeGroupParams, error) {
	var robj *models.RollbackSeGroupParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackSeGroupParams object with a given UUID
func (client *RollbackSeGroupParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackSeGroupParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
