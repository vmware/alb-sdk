// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TenantBindingClient is a client for avi TenantBinding resource
type TenantBindingClient struct {
	aviSession *session.AviSession
}

// NewTenantBindingClient creates a new client for TenantBinding resource
func NewTenantBindingClient(aviSession *session.AviSession) *TenantBindingClient {
	return &TenantBindingClient{aviSession: aviSession}
}

func (client *TenantBindingClient) getAPIPath(uuid string) string {
	path := "api/tenantbinding"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TenantBinding objects
func (client *TenantBindingClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TenantBinding, error) {
	var plist []*models.TenantBinding
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TenantBinding by uuid
func (client *TenantBindingClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var obj *models.TenantBinding
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TenantBinding by name
func (client *TenantBindingClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var obj *models.TenantBinding
	err := client.aviSession.GetObjectByName("tenantbinding", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TenantBinding by filters like name, cloud, tenant
// Api creates TenantBinding object with every call.
func (client *TenantBindingClient) GetObject(options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var obj *models.TenantBinding
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("tenantbinding", newOptions...)
	return obj, err
}

// Create a new TenantBinding object
func (client *TenantBindingClient) Create(obj *models.TenantBinding, options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var robj *models.TenantBinding
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TenantBinding object
func (client *TenantBindingClient) Update(obj *models.TenantBinding, options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var robj *models.TenantBinding
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TenantBinding object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TenantBinding
// or it should be json compatible of form map[string]interface{}
func (client *TenantBindingClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TenantBinding, error) {
	var robj *models.TenantBinding
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TenantBinding object with a given UUID
func (client *TenantBindingClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TenantBinding object with a given name
func (client *TenantBindingClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TenantBindingClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
