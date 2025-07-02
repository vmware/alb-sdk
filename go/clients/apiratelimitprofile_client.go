// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APIRateLimitProfileClient is a client for avi APIRateLimitProfile resource
type APIRateLimitProfileClient struct {
	aviSession *session.AviSession
}

// NewAPIRateLimitProfileClient creates a new client for APIRateLimitProfile resource
func NewAPIRateLimitProfileClient(aviSession *session.AviSession) *APIRateLimitProfileClient {
	return &APIRateLimitProfileClient{aviSession: aviSession}
}

func (client *APIRateLimitProfileClient) getAPIPath(uuid string) string {
	path := "api/apiratelimitprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APIRateLimitProfile objects
func (client *APIRateLimitProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APIRateLimitProfile, error) {
	var plist []*models.APIRateLimitProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APIRateLimitProfile by uuid
func (client *APIRateLimitProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var obj *models.APIRateLimitProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APIRateLimitProfile by name
func (client *APIRateLimitProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var obj *models.APIRateLimitProfile
	err := client.aviSession.GetObjectByName("apiratelimitprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APIRateLimitProfile by filters like name, cloud, tenant
// Api creates APIRateLimitProfile object with every call.
func (client *APIRateLimitProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var obj *models.APIRateLimitProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apiratelimitprofile", newOptions...)
	return obj, err
}

// Create a new APIRateLimitProfile object
func (client *APIRateLimitProfileClient) Create(obj *models.APIRateLimitProfile, options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var robj *models.APIRateLimitProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing APIRateLimitProfile object
func (client *APIRateLimitProfileClient) Update(obj *models.APIRateLimitProfile, options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var robj *models.APIRateLimitProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing APIRateLimitProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APIRateLimitProfile
// or it should be json compatible of form map[string]interface{}
func (client *APIRateLimitProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APIRateLimitProfile, error) {
	var robj *models.APIRateLimitProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APIRateLimitProfile object with a given UUID
func (client *APIRateLimitProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing APIRateLimitProfile object with a given name
func (client *APIRateLimitProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *APIRateLimitProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
