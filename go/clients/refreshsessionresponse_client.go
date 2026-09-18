// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RefreshSessionResponseClient is a client for avi RefreshSessionResponse resource
type RefreshSessionResponseClient struct {
	aviSession *session.AviSession
}

// NewRefreshSessionResponseClient creates a new client for RefreshSessionResponse resource
func NewRefreshSessionResponseClient(aviSession *session.AviSession) *RefreshSessionResponseClient {
	return &RefreshSessionResponseClient{aviSession: aviSession}
}

func (client *RefreshSessionResponseClient) getAPIPath(uuid string) string {
	path := "api/refreshsessionresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RefreshSessionResponse objects
func (client *RefreshSessionResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RefreshSessionResponse, error) {
	var plist []*models.RefreshSessionResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RefreshSessionResponse by uuid
func (client *RefreshSessionResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RefreshSessionResponse, error) {
	var obj *models.RefreshSessionResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RefreshSessionResponse by name
func (client *RefreshSessionResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RefreshSessionResponse, error) {
	var obj *models.RefreshSessionResponse
	err := client.aviSession.GetObjectByName("refreshsessionresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RefreshSessionResponse by filters like name, cloud, tenant
// Api creates RefreshSessionResponse object with every call.
func (client *RefreshSessionResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.RefreshSessionResponse, error) {
	var obj *models.RefreshSessionResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("refreshsessionresponse", newOptions...)
	return obj, err
}

// Create a new RefreshSessionResponse object
func (client *RefreshSessionResponseClient) Create(obj *models.RefreshSessionResponse, options ...session.ApiOptionsParams) (*models.RefreshSessionResponse, error) {
	var robj *models.RefreshSessionResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing RefreshSessionResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RefreshSessionResponse
// or it should be json compatible of form map[string]interface{}
func (client *RefreshSessionResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RefreshSessionResponse, error) {
	var robj *models.RefreshSessionResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RefreshSessionResponse object with a given UUID
func (client *RefreshSessionResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *RefreshSessionResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
