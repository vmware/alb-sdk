// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// APIPromotionRequestClient is a client for avi APIPromotionRequest resource
type APIPromotionRequestClient struct {
	aviSession *session.AviSession
}

// NewAPIPromotionRequestClient creates a new client for APIPromotionRequest resource
func NewAPIPromotionRequestClient(aviSession *session.AviSession) *APIPromotionRequestClient {
	return &APIPromotionRequestClient{aviSession: aviSession}
}

func (client *APIPromotionRequestClient) getAPIPath(uuid string) string {
	path := "api/apipromotionrequest"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of APIPromotionRequest objects
func (client *APIPromotionRequestClient) GetAll(options ...session.ApiOptionsParams) ([]*models.APIPromotionRequest, error) {
	var plist []*models.APIPromotionRequest
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing APIPromotionRequest by uuid
func (client *APIPromotionRequestClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.APIPromotionRequest, error) {
	var obj *models.APIPromotionRequest
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing APIPromotionRequest by name
func (client *APIPromotionRequestClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.APIPromotionRequest, error) {
	var obj *models.APIPromotionRequest
	err := client.aviSession.GetObjectByName("apipromotionrequest", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing APIPromotionRequest by filters like name, cloud, tenant
// Api creates APIPromotionRequest object with every call.
func (client *APIPromotionRequestClient) GetObject(options ...session.ApiOptionsParams) (*models.APIPromotionRequest, error) {
	var obj *models.APIPromotionRequest
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("apipromotionrequest", newOptions...)
	return obj, err
}

// Create a new APIPromotionRequest object
func (client *APIPromotionRequestClient) Create(obj *models.APIPromotionRequest, options ...session.ApiOptionsParams) (*models.APIPromotionRequest, error) {
	var robj *models.APIPromotionRequest
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing APIPromotionRequest object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.APIPromotionRequest
// or it should be json compatible of form map[string]interface{}
func (client *APIPromotionRequestClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.APIPromotionRequest, error) {
	var robj *models.APIPromotionRequest
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing APIPromotionRequest object with a given UUID
func (client *APIPromotionRequestClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *APIPromotionRequestClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
