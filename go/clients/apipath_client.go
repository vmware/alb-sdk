// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APIPathClient is a client for avi APIPath resource
type APIPathClient struct {
	aviSession *session.AviSession
}

// NewAPIPathClient creates a new client for APIPath resource
func NewAPIPathClient(aviSession *session.AviSession) *APIPathClient {
	return &APIPathClient{aviSession: aviSession}
}

func (client *APIPathClient) getAPIPath(uuid string) string {
	path := "api/apipath"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APIPath objects
func (client *APIPathClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APIPath, error) {
	var plist []*models.APIPath
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APIPath by uuid
func (client *APIPathClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var obj *models.APIPath
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APIPath by name
func (client *APIPathClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var obj *models.APIPath
	err := client.aviSession.GetObjectByName("apipath", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APIPath by filters like name, cloud, tenant
// Api creates APIPath object with every call.
func (client *APIPathClient) GetObject(options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var obj *models.APIPath
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apipath", newOptions...)
	return obj, err
}

// Create a new APIPath object
func (client *APIPathClient) Create(obj *models.APIPath, options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var robj *models.APIPath
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing APIPath object
func (client *APIPathClient) Update(obj *models.APIPath, options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var robj *models.APIPath
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing APIPath object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APIPath
// or it should be json compatible of form map[string]interface{}
func (client *APIPathClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APIPath, error) {
	var robj *models.APIPath
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APIPath object with a given UUID
func (client *APIPathClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing APIPath object with a given name
func (client *APIPathClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *APIPathClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
