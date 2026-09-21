// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// AuthTokenCreateResponseClient is a client for avi AuthTokenCreateResponse resource
type AuthTokenCreateResponseClient struct {
	aviSession *session.AviSession
}

// NewAuthTokenCreateResponseClient creates a new client for AuthTokenCreateResponse resource
func NewAuthTokenCreateResponseClient(aviSession *session.AviSession) *AuthTokenCreateResponseClient {
	return &AuthTokenCreateResponseClient{aviSession: aviSession}
}

func (client *AuthTokenCreateResponseClient) getAPIPath(uuid string) string {
	path := "api/authtokencreateresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of AuthTokenCreateResponse objects
func (client *AuthTokenCreateResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.AuthTokenCreateResponse, error) {
	var plist []*models.AuthTokenCreateResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing AuthTokenCreateResponse by uuid
func (client *AuthTokenCreateResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var obj *models.AuthTokenCreateResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing AuthTokenCreateResponse by name
func (client *AuthTokenCreateResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var obj *models.AuthTokenCreateResponse
	err := client.aviSession.GetObjectByName("authtokencreateresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing AuthTokenCreateResponse by filters like name, cloud, tenant
// Api creates AuthTokenCreateResponse object with every call.
func (client *AuthTokenCreateResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var obj *models.AuthTokenCreateResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("authtokencreateresponse", newOptions...)
	return obj, err
}

// Create a new AuthTokenCreateResponse object
func (client *AuthTokenCreateResponseClient) Create(obj *models.AuthTokenCreateResponse, options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var robj *models.AuthTokenCreateResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing AuthTokenCreateResponse object
func (client *AuthTokenCreateResponseClient) Update(obj *models.AuthTokenCreateResponse, options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var robj *models.AuthTokenCreateResponse
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing AuthTokenCreateResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.AuthTokenCreateResponse
// or it should be json compatible of form map[string]interface{}
func (client *AuthTokenCreateResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.AuthTokenCreateResponse, error) {
	var robj *models.AuthTokenCreateResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing AuthTokenCreateResponse object with a given UUID
func (client *AuthTokenCreateResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing AuthTokenCreateResponse object with a given name
func (client *AuthTokenCreateResponseClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *AuthTokenCreateResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
