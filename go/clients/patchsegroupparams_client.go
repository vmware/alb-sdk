// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PatchSeGroupParamsClient is a client for avi PatchSeGroupParams resource
type PatchSeGroupParamsClient struct {
	aviSession *session.AviSession
}

// NewPatchSeGroupParamsClient creates a new client for PatchSeGroupParams resource
func NewPatchSeGroupParamsClient(aviSession *session.AviSession) *PatchSeGroupParamsClient {
	return &PatchSeGroupParamsClient{aviSession: aviSession}
}

func (client *PatchSeGroupParamsClient) getAPIPath(uuid string) string {
	path := "api/patchsegroupparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PatchSeGroupParams objects
func (client *PatchSeGroupParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PatchSeGroupParams, error) {
	var plist []*models.PatchSeGroupParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PatchSeGroupParams by uuid
func (client *PatchSeGroupParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PatchSeGroupParams, error) {
	var obj *models.PatchSeGroupParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PatchSeGroupParams by name
func (client *PatchSeGroupParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PatchSeGroupParams, error) {
	var obj *models.PatchSeGroupParams
	err := client.aviSession.GetObjectByName("patchsegroupparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PatchSeGroupParams by filters like name, cloud, tenant
// Api creates PatchSeGroupParams object with every call.
func (client *PatchSeGroupParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.PatchSeGroupParams, error) {
	var obj *models.PatchSeGroupParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("patchsegroupparams", newOptions...)
	return obj, err
}

// Create a new PatchSeGroupParams object
func (client *PatchSeGroupParamsClient) Create(obj *models.PatchSeGroupParams, options ...session.ApiOptionsParams) (*models.PatchSeGroupParams, error) {
	var robj *models.PatchSeGroupParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing PatchSeGroupParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PatchSeGroupParams
// or it should be json compatible of form map[string]interface{}
func (client *PatchSeGroupParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PatchSeGroupParams, error) {
	var robj *models.PatchSeGroupParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PatchSeGroupParams object with a given UUID
func (client *PatchSeGroupParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *PatchSeGroupParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
