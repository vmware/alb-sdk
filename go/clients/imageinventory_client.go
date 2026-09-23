// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ImageInventoryClient is a client for avi ImageInventory resource
type ImageInventoryClient struct {
	aviSession *session.AviSession
}

// NewImageInventoryClient creates a new client for ImageInventory resource
func NewImageInventoryClient(aviSession *session.AviSession) *ImageInventoryClient {
	return &ImageInventoryClient{aviSession: aviSession}
}

func (client *ImageInventoryClient) getAPIPath(uuid string) string {
	path := "api/imageinventory"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ImageInventory objects
func (client *ImageInventoryClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ImageInventory, error) {
	var plist []*models.ImageInventory
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ImageInventory by uuid
func (client *ImageInventoryClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ImageInventory, error) {
	var obj *models.ImageInventory
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ImageInventory by name
func (client *ImageInventoryClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ImageInventory, error) {
	var obj *models.ImageInventory
	err := client.aviSession.GetObjectByName("imageinventory", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ImageInventory by filters like name, cloud, tenant
// Api creates ImageInventory object with every call.
func (client *ImageInventoryClient) GetObject(options ...session.ApiOptionsParams) (*models.ImageInventory, error) {
	var obj *models.ImageInventory
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("imageinventory", newOptions...)
	return obj, err
}

// Create a new ImageInventory object
func (client *ImageInventoryClient) Create(obj *models.ImageInventory, options ...session.ApiOptionsParams) (*models.ImageInventory, error) {
	var robj *models.ImageInventory
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ImageInventory object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ImageInventory
// or it should be json compatible of form map[string]interface{}
func (client *ImageInventoryClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ImageInventory, error) {
	var robj *models.ImageInventory
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ImageInventory object with a given UUID
func (client *ImageInventoryClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ImageInventoryClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
