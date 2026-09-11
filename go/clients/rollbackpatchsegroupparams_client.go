// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RollbackPatchSeGroupParamsClient is a client for avi RollbackPatchSeGroupParams resource
type RollbackPatchSeGroupParamsClient struct {
	aviSession *session.AviSession
}

// NewRollbackPatchSeGroupParamsClient creates a new client for RollbackPatchSeGroupParams resource
func NewRollbackPatchSeGroupParamsClient(aviSession *session.AviSession) *RollbackPatchSeGroupParamsClient {
	return &RollbackPatchSeGroupParamsClient{aviSession: aviSession}
}

func (client *RollbackPatchSeGroupParamsClient) getAPIPath(uuid string) string {
	path := "api/rollbackpatchsegroupparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RollbackPatchSeGroupParams objects
func (client *RollbackPatchSeGroupParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RollbackPatchSeGroupParams, error) {
	var plist []*models.RollbackPatchSeGroupParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RollbackPatchSeGroupParams by uuid
func (client *RollbackPatchSeGroupParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RollbackPatchSeGroupParams, error) {
	var obj *models.RollbackPatchSeGroupParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RollbackPatchSeGroupParams by name
func (client *RollbackPatchSeGroupParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RollbackPatchSeGroupParams, error) {
	var obj *models.RollbackPatchSeGroupParams
	err := client.aviSession.GetObjectByName("rollbackpatchsegroupparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RollbackPatchSeGroupParams by filters like name, cloud, tenant
// Api creates RollbackPatchSeGroupParams object with every call.
func (client *RollbackPatchSeGroupParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.RollbackPatchSeGroupParams, error) {
	var obj *models.RollbackPatchSeGroupParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("rollbackpatchsegroupparams", newOptions...)
	return obj, err
}

// Create a new RollbackPatchSeGroupParams object
func (client *RollbackPatchSeGroupParamsClient) Create(obj *models.RollbackPatchSeGroupParams, options ...session.ApiOptionsParams) (*models.RollbackPatchSeGroupParams, error) {
	var robj *models.RollbackPatchSeGroupParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RollbackPatchSeGroupParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RollbackPatchSeGroupParams
// or it should be json compatible of form map[string]interface{}
func (client *RollbackPatchSeGroupParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RollbackPatchSeGroupParams, error) {
	var robj *models.RollbackPatchSeGroupParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RollbackPatchSeGroupParams object with a given UUID
func (client *RollbackPatchSeGroupParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RollbackPatchSeGroupParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
