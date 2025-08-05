// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TechSupportProfileClient is a client for avi TechSupportProfile resource
type TechSupportProfileClient struct {
	aviSession *session.AviSession
}

// NewTechSupportProfileClient creates a new client for TechSupportProfile resource
func NewTechSupportProfileClient(aviSession *session.AviSession) *TechSupportProfileClient {
	return &TechSupportProfileClient{aviSession: aviSession}
}

func (client *TechSupportProfileClient) getAPIPath(uuid string) string {
	path := "api/techsupportprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TechSupportProfile objects
func (client *TechSupportProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TechSupportProfile, error) {
	var plist []*models.TechSupportProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TechSupportProfile by uuid
func (client *TechSupportProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var obj *models.TechSupportProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TechSupportProfile by name
func (client *TechSupportProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var obj *models.TechSupportProfile
	err := client.aviSession.GetObjectByName("techsupportprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TechSupportProfile by filters like name, cloud, tenant
// Api creates TechSupportProfile object with every call.
func (client *TechSupportProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var obj *models.TechSupportProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("techsupportprofile", newOptions...)
	return obj, err
}

// Create a new TechSupportProfile object
func (client *TechSupportProfileClient) Create(obj *models.TechSupportProfile, options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var robj *models.TechSupportProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TechSupportProfile object
func (client *TechSupportProfileClient) Update(obj *models.TechSupportProfile, options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var robj *models.TechSupportProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TechSupportProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TechSupportProfile
// or it should be json compatible of form map[string]interface{}
func (client *TechSupportProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TechSupportProfile, error) {
	var robj *models.TechSupportProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TechSupportProfile object with a given UUID
func (client *TechSupportProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TechSupportProfile object with a given name
func (client *TechSupportProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TechSupportProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
