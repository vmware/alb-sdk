// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// FileServiceListingClient is a client for avi FileServiceListing resource
type FileServiceListingClient struct {
	aviSession *session.AviSession
}

// NewFileServiceListingClient creates a new client for FileServiceListing resource
func NewFileServiceListingClient(aviSession *session.AviSession) *FileServiceListingClient {
	return &FileServiceListingClient{aviSession: aviSession}
}

func (client *FileServiceListingClient) getAPIPath(uuid string) string {
	path := "api/fileservicelisting"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of FileServiceListing objects
func (client *FileServiceListingClient) GetAll(options ...session.ApiOptionsParams) ([]*models.FileServiceListing, error) {
	var plist []*models.FileServiceListing
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing FileServiceListing by uuid
func (client *FileServiceListingClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.FileServiceListing, error) {
	var obj *models.FileServiceListing
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing FileServiceListing by name
func (client *FileServiceListingClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.FileServiceListing, error) {
	var obj *models.FileServiceListing
	err := client.aviSession.GetObjectByName("fileservicelisting", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing FileServiceListing by filters like name, cloud, tenant
// Api creates FileServiceListing object with every call.
func (client *FileServiceListingClient) GetObject(options ...session.ApiOptionsParams) (*models.FileServiceListing, error) {
	var obj *models.FileServiceListing
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("fileservicelisting", newOptions...)
	return obj, err
}

// Create a new FileServiceListing object
func (client *FileServiceListingClient) Create(obj *models.FileServiceListing, options ...session.ApiOptionsParams) (*models.FileServiceListing, error) {
	var robj *models.FileServiceListing
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing FileServiceListing object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.FileServiceListing
// or it should be json compatible of form map[string]interface{}
func (client *FileServiceListingClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.FileServiceListing, error) {
	var robj *models.FileServiceListing
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing FileServiceListing object with a given UUID
func (client *FileServiceListingClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *FileServiceListingClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
