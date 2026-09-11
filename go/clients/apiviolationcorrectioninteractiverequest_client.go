// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APIViolationCorrectionInteractiveRequestClient is a client for avi APIViolationCorrectionInteractiveRequest resource
type APIViolationCorrectionInteractiveRequestClient struct {
	aviSession *session.AviSession
}

// NewAPIViolationCorrectionInteractiveRequestClient creates a new client for APIViolationCorrectionInteractiveRequest resource
func NewAPIViolationCorrectionInteractiveRequestClient(aviSession *session.AviSession) *APIViolationCorrectionInteractiveRequestClient {
	return &APIViolationCorrectionInteractiveRequestClient{aviSession: aviSession}
}

func (client *APIViolationCorrectionInteractiveRequestClient) getAPIPath(uuid string) string {
	path := "api/apiviolationcorrectioninteractiverequest"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APIViolationCorrectionInteractiveRequest objects
func (client *APIViolationCorrectionInteractiveRequestClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APIViolationCorrectionInteractiveRequest, error) {
	var plist []*models.APIViolationCorrectionInteractiveRequest
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APIViolationCorrectionInteractiveRequest by uuid
func (client *APIViolationCorrectionInteractiveRequestClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APIViolationCorrectionInteractiveRequest, error) {
	var obj *models.APIViolationCorrectionInteractiveRequest
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APIViolationCorrectionInteractiveRequest by name
func (client *APIViolationCorrectionInteractiveRequestClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APIViolationCorrectionInteractiveRequest, error) {
	var obj *models.APIViolationCorrectionInteractiveRequest
	err := client.aviSession.GetObjectByName("apiviolationcorrectioninteractiverequest", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APIViolationCorrectionInteractiveRequest by filters like name, cloud, tenant
// Api creates APIViolationCorrectionInteractiveRequest object with every call.
func (client *APIViolationCorrectionInteractiveRequestClient) GetObject(options ...session.ApiOptionsParams) (*models.APIViolationCorrectionInteractiveRequest, error) {
	var obj *models.APIViolationCorrectionInteractiveRequest
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apiviolationcorrectioninteractiverequest", newOptions...)
	return obj, err
}

// Create a new APIViolationCorrectionInteractiveRequest object
func (client *APIViolationCorrectionInteractiveRequestClient) Create(obj *models.APIViolationCorrectionInteractiveRequest, options ...session.ApiOptionsParams) (*models.APIViolationCorrectionInteractiveRequest, error) {
	var robj *models.APIViolationCorrectionInteractiveRequest
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing APIViolationCorrectionInteractiveRequest object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APIViolationCorrectionInteractiveRequest
// or it should be json compatible of form map[string]interface{}
func (client *APIViolationCorrectionInteractiveRequestClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APIViolationCorrectionInteractiveRequest, error) {
	var robj *models.APIViolationCorrectionInteractiveRequest
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APIViolationCorrectionInteractiveRequest object with a given UUID
func (client *APIViolationCorrectionInteractiveRequestClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *APIViolationCorrectionInteractiveRequestClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
