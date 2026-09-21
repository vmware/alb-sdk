// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SeVersionClient is a client for avi SeVersion resource
type SeVersionClient struct {
	aviSession *session.AviSession
}

// NewSeVersionClient creates a new client for SeVersion resource
func NewSeVersionClient(aviSession *session.AviSession) *SeVersionClient {
	return &SeVersionClient{aviSession: aviSession}
}

func (client *SeVersionClient) getAPIPath(uuid string) string {
	path := "api/seversion"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SeVersion objects
func (client *SeVersionClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SeVersion, error) {
	var plist []*models.SeVersion
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SeVersion by uuid
func (client *SeVersionClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SeVersion, error) {
	var obj *models.SeVersion
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SeVersion by name
func (client *SeVersionClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SeVersion, error) {
	var obj *models.SeVersion
	err := client.aviSession.GetObjectByName("seversion", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SeVersion by filters like name, cloud, tenant
// Api creates SeVersion object with every call.
func (client *SeVersionClient) GetObject(options ...session.ApiOptionsParams) (*models.SeVersion, error) {
	var obj *models.SeVersion
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("seversion", newOptions...)
	return obj, err
}

// Create a new SeVersion object
func (client *SeVersionClient) Create(obj *models.SeVersion, options ...session.ApiOptionsParams) (*models.SeVersion, error) {
	var robj *models.SeVersion
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SeVersion object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SeVersion
// or it should be json compatible of form map[string]interface{}
func (client *SeVersionClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SeVersion, error) {
	var robj *models.SeVersion
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SeVersion object with a given UUID
func (client *SeVersionClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SeVersionClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
