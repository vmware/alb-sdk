// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ChangelogResponseClient is a client for avi ChangelogResponse resource
type ChangelogResponseClient struct {
	aviSession *session.AviSession
}

// NewChangelogResponseClient creates a new client for ChangelogResponse resource
func NewChangelogResponseClient(aviSession *session.AviSession) *ChangelogResponseClient {
	return &ChangelogResponseClient{aviSession: aviSession}
}

func (client *ChangelogResponseClient) getAPIPath(uuid string) string {
	path := "api/changelogresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ChangelogResponse objects
func (client *ChangelogResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ChangelogResponse, error) {
	var plist []*models.ChangelogResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ChangelogResponse by uuid
func (client *ChangelogResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ChangelogResponse, error) {
	var obj *models.ChangelogResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ChangelogResponse by name
func (client *ChangelogResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ChangelogResponse, error) {
	var obj *models.ChangelogResponse
	err := client.aviSession.GetObjectByName("changelogresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ChangelogResponse by filters like name, cloud, tenant
// Api creates ChangelogResponse object with every call.
func (client *ChangelogResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.ChangelogResponse, error) {
	var obj *models.ChangelogResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("changelogresponse", newOptions...)
	return obj, err
}

// Create a new ChangelogResponse object
func (client *ChangelogResponseClient) Create(obj *models.ChangelogResponse, options ...session.ApiOptionsParams) (*models.ChangelogResponse, error) {
	var robj *models.ChangelogResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ChangelogResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ChangelogResponse
// or it should be json compatible of form map[string]interface{}
func (client *ChangelogResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ChangelogResponse, error) {
	var robj *models.ChangelogResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ChangelogResponse object with a given UUID
func (client *ChangelogResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ChangelogResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
