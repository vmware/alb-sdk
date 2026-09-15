// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UpgradeSystemParamsClient is a client for avi UpgradeSystemParams resource
type UpgradeSystemParamsClient struct {
	aviSession *session.AviSession
}

// NewUpgradeSystemParamsClient creates a new client for UpgradeSystemParams resource
func NewUpgradeSystemParamsClient(aviSession *session.AviSession) *UpgradeSystemParamsClient {
	return &UpgradeSystemParamsClient{aviSession: aviSession}
}

func (client *UpgradeSystemParamsClient) getAPIPath(uuid string) string {
	path := "api/upgradesystemparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UpgradeSystemParams objects
func (client *UpgradeSystemParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UpgradeSystemParams, error) {
	var plist []*models.UpgradeSystemParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UpgradeSystemParams by uuid
func (client *UpgradeSystemParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UpgradeSystemParams, error) {
	var obj *models.UpgradeSystemParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UpgradeSystemParams by name
func (client *UpgradeSystemParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UpgradeSystemParams, error) {
	var obj *models.UpgradeSystemParams
	err := client.aviSession.GetObjectByName("upgradesystemparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UpgradeSystemParams by filters like name, cloud, tenant
// Api creates UpgradeSystemParams object with every call.
func (client *UpgradeSystemParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.UpgradeSystemParams, error) {
	var obj *models.UpgradeSystemParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("upgradesystemparams", newOptions...)
	return obj, err
}

// Create a new UpgradeSystemParams object
func (client *UpgradeSystemParamsClient) Create(obj *models.UpgradeSystemParams, options ...session.ApiOptionsParams) (*models.UpgradeSystemParams, error) {
	var robj *models.UpgradeSystemParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UpgradeSystemParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UpgradeSystemParams
// or it should be json compatible of form map[string]interface{}
func (client *UpgradeSystemParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UpgradeSystemParams, error) {
	var robj *models.UpgradeSystemParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UpgradeSystemParams object with a given UUID
func (client *UpgradeSystemParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UpgradeSystemParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
