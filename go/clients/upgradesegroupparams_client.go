// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UpgradeSeGroupParamsClient is a client for avi UpgradeSeGroupParams resource
type UpgradeSeGroupParamsClient struct {
	aviSession *session.AviSession
}

// NewUpgradeSeGroupParamsClient creates a new client for UpgradeSeGroupParams resource
func NewUpgradeSeGroupParamsClient(aviSession *session.AviSession) *UpgradeSeGroupParamsClient {
	return &UpgradeSeGroupParamsClient{aviSession: aviSession}
}

func (client *UpgradeSeGroupParamsClient) getAPIPath(uuid string) string {
	path := "api/upgradesegroupparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UpgradeSeGroupParams objects
func (client *UpgradeSeGroupParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UpgradeSeGroupParams, error) {
	var plist []*models.UpgradeSeGroupParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UpgradeSeGroupParams by uuid
func (client *UpgradeSeGroupParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UpgradeSeGroupParams, error) {
	var obj *models.UpgradeSeGroupParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UpgradeSeGroupParams by name
func (client *UpgradeSeGroupParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UpgradeSeGroupParams, error) {
	var obj *models.UpgradeSeGroupParams
	err := client.aviSession.GetObjectByName("upgradesegroupparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UpgradeSeGroupParams by filters like name, cloud, tenant
// Api creates UpgradeSeGroupParams object with every call.
func (client *UpgradeSeGroupParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.UpgradeSeGroupParams, error) {
	var obj *models.UpgradeSeGroupParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("upgradesegroupparams", newOptions...)
	return obj, err
}

// Create a new UpgradeSeGroupParams object
func (client *UpgradeSeGroupParamsClient) Create(obj *models.UpgradeSeGroupParams, options ...session.ApiOptionsParams) (*models.UpgradeSeGroupParams, error) {
	var robj *models.UpgradeSeGroupParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UpgradeSeGroupParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UpgradeSeGroupParams
// or it should be json compatible of form map[string]interface{}
func (client *UpgradeSeGroupParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UpgradeSeGroupParams, error) {
	var robj *models.UpgradeSeGroupParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UpgradeSeGroupParams object with a given UUID
func (client *UpgradeSeGroupParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UpgradeSeGroupParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
