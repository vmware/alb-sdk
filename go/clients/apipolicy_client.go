// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APIPolicyClient is a client for avi APIPolicy resource
type APIPolicyClient struct {
	aviSession *session.AviSession
}

// NewAPIPolicyClient creates a new client for APIPolicy resource
func NewAPIPolicyClient(aviSession *session.AviSession) *APIPolicyClient {
	return &APIPolicyClient{aviSession: aviSession}
}

func (client *APIPolicyClient) getAPIPath(uuid string) string {
	path := "api/apipolicy"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APIPolicy objects
func (client *APIPolicyClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APIPolicy, error) {
	var plist []*models.APIPolicy
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APIPolicy by uuid
func (client *APIPolicyClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var obj *models.APIPolicy
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APIPolicy by name
func (client *APIPolicyClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var obj *models.APIPolicy
	err := client.aviSession.GetObjectByName("apipolicy", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APIPolicy by filters like name, cloud, tenant
// Api creates APIPolicy object with every call.
func (client *APIPolicyClient) GetObject(options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var obj *models.APIPolicy
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apipolicy", newOptions...)
	return obj, err
}

// Create a new APIPolicy object
func (client *APIPolicyClient) Create(obj *models.APIPolicy, options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var robj *models.APIPolicy
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing APIPolicy object
func (client *APIPolicyClient) Update(obj *models.APIPolicy, options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var robj *models.APIPolicy
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing APIPolicy object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APIPolicy
// or it should be json compatible of form map[string]interface{}
func (client *APIPolicyClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APIPolicy, error) {
	var robj *models.APIPolicy
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APIPolicy object with a given UUID
func (client *APIPolicyClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing APIPolicy object with a given name
func (client *APIPolicyClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *APIPolicyClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
