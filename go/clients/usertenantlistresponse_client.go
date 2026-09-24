// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UserTenantListResponseClient is a client for avi UserTenantListResponse resource
type UserTenantListResponseClient struct {
	aviSession *session.AviSession
}

// NewUserTenantListResponseClient creates a new client for UserTenantListResponse resource
func NewUserTenantListResponseClient(aviSession *session.AviSession) *UserTenantListResponseClient {
	return &UserTenantListResponseClient{aviSession: aviSession}
}

func (client *UserTenantListResponseClient) getAPIPath(uuid string) string {
	path := "api/usertenantlistresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UserTenantListResponse objects
func (client *UserTenantListResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UserTenantListResponse, error) {
	var plist []*models.UserTenantListResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UserTenantListResponse by uuid
func (client *UserTenantListResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UserTenantListResponse, error) {
	var obj *models.UserTenantListResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UserTenantListResponse by name
func (client *UserTenantListResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UserTenantListResponse, error) {
	var obj *models.UserTenantListResponse
	err := client.aviSession.GetObjectByName("usertenantlistresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UserTenantListResponse by filters like name, cloud, tenant
// Api creates UserTenantListResponse object with every call.
func (client *UserTenantListResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.UserTenantListResponse, error) {
	var obj *models.UserTenantListResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("usertenantlistresponse", newOptions...)
	return obj, err
}

// Create a new UserTenantListResponse object
func (client *UserTenantListResponseClient) Create(obj *models.UserTenantListResponse, options ...session.ApiOptionsParams) (*models.UserTenantListResponse, error) {
	var robj *models.UserTenantListResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UserTenantListResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UserTenantListResponse
// or it should be json compatible of form map[string]interface{}
func (client *UserTenantListResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UserTenantListResponse, error) {
	var robj *models.UserTenantListResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UserTenantListResponse object with a given UUID
func (client *UserTenantListResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UserTenantListResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
