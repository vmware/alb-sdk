// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APISchemaClient is a client for avi APISchema resource
type APISchemaClient struct {
	aviSession *session.AviSession
}

// NewAPISchemaClient creates a new client for APISchema resource
func NewAPISchemaClient(aviSession *session.AviSession) *APISchemaClient {
	return &APISchemaClient{aviSession: aviSession}
}

func (client *APISchemaClient) getAPIPath(uuid string) string {
	path := "api/apischema"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APISchema objects
func (client *APISchemaClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APISchema, error) {
	var plist []*models.APISchema
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APISchema by uuid
func (client *APISchemaClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var obj *models.APISchema
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APISchema by name
func (client *APISchemaClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var obj *models.APISchema
	err := client.aviSession.GetObjectByName("apischema", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APISchema by filters like name, cloud, tenant
// Api creates APISchema object with every call.
func (client *APISchemaClient) GetObject(options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var obj *models.APISchema
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apischema", newOptions...)
	return obj, err
}

// Create a new APISchema object
func (client *APISchemaClient) Create(obj *models.APISchema, options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var robj *models.APISchema
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing APISchema object
func (client *APISchemaClient) Update(obj *models.APISchema, options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var robj *models.APISchema
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing APISchema object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APISchema
// or it should be json compatible of form map[string]interface{}
func (client *APISchemaClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APISchema, error) {
	var robj *models.APISchema
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APISchema object with a given UUID
func (client *APISchemaClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing APISchema object with a given name
func (client *APISchemaClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *APISchemaClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
