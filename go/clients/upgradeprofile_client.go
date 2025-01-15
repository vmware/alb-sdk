// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UpgradeProfileClient is a client for avi UpgradeProfile resource
type UpgradeProfileClient struct {
	aviSession *session.AviSession
}

// NewUpgradeProfileClient creates a new client for UpgradeProfile resource
func NewUpgradeProfileClient(aviSession *session.AviSession) *UpgradeProfileClient {
	return &UpgradeProfileClient{aviSession: aviSession}
}

func (client *UpgradeProfileClient) getAPIPath(uuid string) string {
	path := "api/upgradeprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UpgradeProfile objects
func (client *UpgradeProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UpgradeProfile, error) {
	var plist []*models.UpgradeProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UpgradeProfile by uuid
func (client *UpgradeProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var obj *models.UpgradeProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UpgradeProfile by name
func (client *UpgradeProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var obj *models.UpgradeProfile
	err := client.aviSession.GetObjectByName("upgradeprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UpgradeProfile by filters like name, cloud, tenant
// Api creates UpgradeProfile object with every call.
func (client *UpgradeProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var obj *models.UpgradeProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("upgradeprofile", newOptions...)
	return obj, err
}

// Create a new UpgradeProfile object
func (client *UpgradeProfileClient) Create(obj *models.UpgradeProfile, options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var robj *models.UpgradeProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing UpgradeProfile object
func (client *UpgradeProfileClient) Update(obj *models.UpgradeProfile, options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var robj *models.UpgradeProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing UpgradeProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UpgradeProfile
// or it should be json compatible of form map[string]interface{}
func (client *UpgradeProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UpgradeProfile, error) {
	var robj *models.UpgradeProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UpgradeProfile object with a given UUID
func (client *UpgradeProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing UpgradeProfile object with a given name
func (client *UpgradeProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *UpgradeProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
