// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TechSupportClient is a client for avi TechSupport resource
type TechSupportClient struct {
	aviSession *session.AviSession
}

// NewTechSupportClient creates a new client for TechSupport resource
func NewTechSupportClient(aviSession *session.AviSession) *TechSupportClient {
	return &TechSupportClient{aviSession: aviSession}
}

func (client *TechSupportClient) getAPIPath(uuid string) string {
	path := "api/techsupport"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TechSupport objects
func (client *TechSupportClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TechSupport, error) {
	var plist []*models.TechSupport
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TechSupport by uuid
func (client *TechSupportClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var obj *models.TechSupport
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TechSupport by name
func (client *TechSupportClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var obj *models.TechSupport
	err := client.aviSession.GetObjectByName("techsupport", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TechSupport by filters like name, cloud, tenant
// Api creates TechSupport object with every call.
func (client *TechSupportClient) GetObject(options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var obj *models.TechSupport
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("techsupport", newOptions...)
	return obj, err
}

// Create a new TechSupport object
func (client *TechSupportClient) Create(obj *models.TechSupport, options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var robj *models.TechSupport
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TechSupport object
func (client *TechSupportClient) Update(obj *models.TechSupport, options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var robj *models.TechSupport
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TechSupport object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TechSupport
// or it should be json compatible of form map[string]interface{}
func (client *TechSupportClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TechSupport, error) {
	var robj *models.TechSupport
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TechSupport object with a given UUID
func (client *TechSupportClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TechSupport object with a given name
func (client *TechSupportClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TechSupportClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
