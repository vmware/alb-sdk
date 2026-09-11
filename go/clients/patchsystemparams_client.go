// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PatchSystemParamsClient is a client for avi PatchSystemParams resource
type PatchSystemParamsClient struct {
	aviSession *session.AviSession
}

// NewPatchSystemParamsClient creates a new client for PatchSystemParams resource
func NewPatchSystemParamsClient(aviSession *session.AviSession) *PatchSystemParamsClient {
	return &PatchSystemParamsClient{aviSession: aviSession}
}

func (client *PatchSystemParamsClient) getAPIPath(uuid string) string {
	path := "api/patchsystemparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PatchSystemParams objects
func (client *PatchSystemParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PatchSystemParams, error) {
	var plist []*models.PatchSystemParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PatchSystemParams by uuid
func (client *PatchSystemParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PatchSystemParams, error) {
	var obj *models.PatchSystemParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PatchSystemParams by name
func (client *PatchSystemParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PatchSystemParams, error) {
	var obj *models.PatchSystemParams
	err := client.aviSession.GetObjectByName("patchsystemparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PatchSystemParams by filters like name, cloud, tenant
// Api creates PatchSystemParams object with every call.
func (client *PatchSystemParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.PatchSystemParams, error) {
	var obj *models.PatchSystemParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("patchsystemparams", newOptions...)
	return obj, err
}

// Create a new PatchSystemParams object
func (client *PatchSystemParamsClient) Create(obj *models.PatchSystemParams, options ...session.ApiOptionsParams) (*models.PatchSystemParams, error) {
	var robj *models.PatchSystemParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing PatchSystemParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PatchSystemParams
// or it should be json compatible of form map[string]interface{}
func (client *PatchSystemParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PatchSystemParams, error) {
	var robj *models.PatchSystemParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PatchSystemParams object with a given UUID
func (client *PatchSystemParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *PatchSystemParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
