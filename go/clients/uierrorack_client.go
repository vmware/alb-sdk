// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UIErrorAckClient is a client for avi UIErrorAck resource
type UIErrorAckClient struct {
	aviSession *session.AviSession
}

// NewUIErrorAckClient creates a new client for UIErrorAck resource
func NewUIErrorAckClient(aviSession *session.AviSession) *UIErrorAckClient {
	return &UIErrorAckClient{aviSession: aviSession}
}

func (client *UIErrorAckClient) getAPIPath(uuid string) string {
	path := "api/uierrorack"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UIErrorAck objects
func (client *UIErrorAckClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UIErrorAck, error) {
	var plist []*models.UIErrorAck
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UIErrorAck by uuid
func (client *UIErrorAckClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UIErrorAck, error) {
	var obj *models.UIErrorAck
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UIErrorAck by name
func (client *UIErrorAckClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UIErrorAck, error) {
	var obj *models.UIErrorAck
	err := client.aviSession.GetObjectByName("uierrorack", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UIErrorAck by filters like name, cloud, tenant
// Api creates UIErrorAck object with every call.
func (client *UIErrorAckClient) GetObject(options ...session.ApiOptionsParams) (*models.UIErrorAck, error) {
	var obj *models.UIErrorAck
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("uierrorack", newOptions...)
	return obj, err
}

// Create a new UIErrorAck object
func (client *UIErrorAckClient) Create(obj *models.UIErrorAck, options ...session.ApiOptionsParams) (*models.UIErrorAck, error) {
	var robj *models.UIErrorAck
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UIErrorAck object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UIErrorAck
// or it should be json compatible of form map[string]interface{}
func (client *UIErrorAckClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UIErrorAck, error) {
	var robj *models.UIErrorAck
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UIErrorAck object with a given UUID
func (client *UIErrorAckClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UIErrorAckClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
