// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UpgradeControllerParamsClient is a client for avi UpgradeControllerParams resource
type UpgradeControllerParamsClient struct {
	aviSession *session.AviSession
}

// NewUpgradeControllerParamsClient creates a new client for UpgradeControllerParams resource
func NewUpgradeControllerParamsClient(aviSession *session.AviSession) *UpgradeControllerParamsClient {
	return &UpgradeControllerParamsClient{aviSession: aviSession}
}

func (client *UpgradeControllerParamsClient) getAPIPath(uuid string) string {
	path := "api/upgradecontrollerparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UpgradeControllerParams objects
func (client *UpgradeControllerParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UpgradeControllerParams, error) {
	var plist []*models.UpgradeControllerParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UpgradeControllerParams by uuid
func (client *UpgradeControllerParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UpgradeControllerParams, error) {
	var obj *models.UpgradeControllerParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UpgradeControllerParams by name
func (client *UpgradeControllerParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UpgradeControllerParams, error) {
	var obj *models.UpgradeControllerParams
	err := client.aviSession.GetObjectByName("upgradecontrollerparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UpgradeControllerParams by filters like name, cloud, tenant
// Api creates UpgradeControllerParams object with every call.
func (client *UpgradeControllerParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.UpgradeControllerParams, error) {
	var obj *models.UpgradeControllerParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("upgradecontrollerparams", newOptions...)
	return obj, err
}

// Create a new UpgradeControllerParams object
func (client *UpgradeControllerParamsClient) Create(obj *models.UpgradeControllerParams, options ...session.ApiOptionsParams) (*models.UpgradeControllerParams, error) {
	var robj *models.UpgradeControllerParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UpgradeControllerParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UpgradeControllerParams
// or it should be json compatible of form map[string]interface{}
func (client *UpgradeControllerParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UpgradeControllerParams, error) {
	var robj *models.UpgradeControllerParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UpgradeControllerParams object with a given UUID
func (client *UpgradeControllerParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UpgradeControllerParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
