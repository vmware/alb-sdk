// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SeGroupVersionClient is a client for avi SeGroupVersion resource
type SeGroupVersionClient struct {
	aviSession *session.AviSession
}

// NewSeGroupVersionClient creates a new client for SeGroupVersion resource
func NewSeGroupVersionClient(aviSession *session.AviSession) *SeGroupVersionClient {
	return &SeGroupVersionClient{aviSession: aviSession}
}

func (client *SeGroupVersionClient) getAPIPath(uuid string) string {
	path := "api/segroupversion"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SeGroupVersion objects
func (client *SeGroupVersionClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SeGroupVersion, error) {
	var plist []*models.SeGroupVersion
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SeGroupVersion by uuid
func (client *SeGroupVersionClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SeGroupVersion, error) {
	var obj *models.SeGroupVersion
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SeGroupVersion by name
func (client *SeGroupVersionClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SeGroupVersion, error) {
	var obj *models.SeGroupVersion
	err := client.aviSession.GetObjectByName("segroupversion", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SeGroupVersion by filters like name, cloud, tenant
// Api creates SeGroupVersion object with every call.
func (client *SeGroupVersionClient) GetObject(options ...session.ApiOptionsParams) (*models.SeGroupVersion, error) {
	var obj *models.SeGroupVersion
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("segroupversion", newOptions...)
	return obj, err
}

// Create a new SeGroupVersion object
func (client *SeGroupVersionClient) Create(obj *models.SeGroupVersion, options ...session.ApiOptionsParams) (*models.SeGroupVersion, error) {
	var robj *models.SeGroupVersion
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SeGroupVersion object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SeGroupVersion
// or it should be json compatible of form map[string]interface{}
func (client *SeGroupVersionClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SeGroupVersion, error) {
	var robj *models.SeGroupVersion
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SeGroupVersion object with a given UUID
func (client *SeGroupVersionClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SeGroupVersionClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
