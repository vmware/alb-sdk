// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ControllerVersionClient is a client for avi ControllerVersion resource
type ControllerVersionClient struct {
	aviSession *session.AviSession
}

// NewControllerVersionClient creates a new client for ControllerVersion resource
func NewControllerVersionClient(aviSession *session.AviSession) *ControllerVersionClient {
	return &ControllerVersionClient{aviSession: aviSession}
}

func (client *ControllerVersionClient) getAPIPath(uuid string) string {
	path := "api/controllerversion"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ControllerVersion objects
func (client *ControllerVersionClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ControllerVersion, error) {
	var plist []*models.ControllerVersion
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ControllerVersion by uuid
func (client *ControllerVersionClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ControllerVersion, error) {
	var obj *models.ControllerVersion
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ControllerVersion by name
func (client *ControllerVersionClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ControllerVersion, error) {
	var obj *models.ControllerVersion
	err := client.aviSession.GetObjectByName("controllerversion", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ControllerVersion by filters like name, cloud, tenant
// Api creates ControllerVersion object with every call.
func (client *ControllerVersionClient) GetObject(options ...session.ApiOptionsParams) (*models.ControllerVersion, error) {
	var obj *models.ControllerVersion
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("controllerversion", newOptions...)
	return obj, err
}

// Create a new ControllerVersion object
func (client *ControllerVersionClient) Create(obj *models.ControllerVersion, options ...session.ApiOptionsParams) (*models.ControllerVersion, error) {
	var robj *models.ControllerVersion
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ControllerVersion object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ControllerVersion
// or it should be json compatible of form map[string]interface{}
func (client *ControllerVersionClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ControllerVersion, error) {
	var robj *models.ControllerVersion
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ControllerVersion object with a given UUID
func (client *ControllerVersionClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ControllerVersionClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
