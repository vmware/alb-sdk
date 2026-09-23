// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ImageRawInventoryResponseClient is a client for avi ImageRawInventoryResponse resource
type ImageRawInventoryResponseClient struct {
	aviSession *session.AviSession
}

// NewImageRawInventoryResponseClient creates a new client for ImageRawInventoryResponse resource
func NewImageRawInventoryResponseClient(aviSession *session.AviSession) *ImageRawInventoryResponseClient {
	return &ImageRawInventoryResponseClient{aviSession: aviSession}
}

func (client *ImageRawInventoryResponseClient) getAPIPath(uuid string) string {
	path := "api/imagerawinventoryresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ImageRawInventoryResponse objects
func (client *ImageRawInventoryResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ImageRawInventoryResponse, error) {
	var plist []*models.ImageRawInventoryResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ImageRawInventoryResponse by uuid
func (client *ImageRawInventoryResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ImageRawInventoryResponse, error) {
	var obj *models.ImageRawInventoryResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ImageRawInventoryResponse by name
func (client *ImageRawInventoryResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ImageRawInventoryResponse, error) {
	var obj *models.ImageRawInventoryResponse
	err := client.aviSession.GetObjectByName("imagerawinventoryresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ImageRawInventoryResponse by filters like name, cloud, tenant
// Api creates ImageRawInventoryResponse object with every call.
func (client *ImageRawInventoryResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.ImageRawInventoryResponse, error) {
	var obj *models.ImageRawInventoryResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("imagerawinventoryresponse", newOptions...)
	return obj, err
}

// Create a new ImageRawInventoryResponse object
func (client *ImageRawInventoryResponseClient) Create(obj *models.ImageRawInventoryResponse, options ...session.ApiOptionsParams) (*models.ImageRawInventoryResponse, error) {
	var robj *models.ImageRawInventoryResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ImageRawInventoryResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ImageRawInventoryResponse
// or it should be json compatible of form map[string]interface{}
func (client *ImageRawInventoryResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ImageRawInventoryResponse, error) {
	var robj *models.ImageRawInventoryResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ImageRawInventoryResponse object with a given UUID
func (client *ImageRawInventoryResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ImageRawInventoryResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
