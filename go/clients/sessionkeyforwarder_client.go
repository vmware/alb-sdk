// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SessionKeyForwarderClient is a client for avi SessionKeyForwarder resource
type SessionKeyForwarderClient struct {
	aviSession *session.AviSession
}

// NewSessionKeyForwarderClient creates a new client for SessionKeyForwarder resource
func NewSessionKeyForwarderClient(aviSession *session.AviSession) *SessionKeyForwarderClient {
	return &SessionKeyForwarderClient{aviSession: aviSession}
}

func (client *SessionKeyForwarderClient) getAPIPath(uuid string) string {
	path := "api/sessionkeyforwarder"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SessionKeyForwarder objects
func (client *SessionKeyForwarderClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SessionKeyForwarder, error) {
	var plist []*models.SessionKeyForwarder
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SessionKeyForwarder by uuid
func (client *SessionKeyForwarderClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var obj *models.SessionKeyForwarder
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SessionKeyForwarder by name
func (client *SessionKeyForwarderClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var obj *models.SessionKeyForwarder
	err := client.aviSession.GetObjectByName("sessionkeyforwarder", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SessionKeyForwarder by filters like name, cloud, tenant
// Api creates SessionKeyForwarder object with every call.
func (client *SessionKeyForwarderClient) GetObject(options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var obj *models.SessionKeyForwarder
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("sessionkeyforwarder", newOptions...)
	return obj, err
}

// Create a new SessionKeyForwarder object
func (client *SessionKeyForwarderClient) Create(obj *models.SessionKeyForwarder, options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var robj *models.SessionKeyForwarder
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing SessionKeyForwarder object
func (client *SessionKeyForwarderClient) Update(obj *models.SessionKeyForwarder, options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var robj *models.SessionKeyForwarder
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing SessionKeyForwarder object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SessionKeyForwarder
// or it should be json compatible of form map[string]interface{}
func (client *SessionKeyForwarderClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SessionKeyForwarder, error) {
	var robj *models.SessionKeyForwarder
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SessionKeyForwarder object with a given UUID
func (client *SessionKeyForwarderClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing SessionKeyForwarder object with a given name
func (client *SessionKeyForwarderClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *SessionKeyForwarderClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
