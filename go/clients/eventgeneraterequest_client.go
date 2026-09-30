// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// EventGenerateRequestClient is a client for avi EventGenerateRequest resource
type EventGenerateRequestClient struct {
	aviSession *session.AviSession
}

// NewEventGenerateRequestClient creates a new client for EventGenerateRequest resource
func NewEventGenerateRequestClient(aviSession *session.AviSession) *EventGenerateRequestClient {
	return &EventGenerateRequestClient{aviSession: aviSession}
}

func (client *EventGenerateRequestClient) getAPIPath(uuid string) string {
	path := "api/eventgeneraterequest"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of EventGenerateRequest objects
func (client *EventGenerateRequestClient) GetAll(options ...session.ApiOptionsParams) ([]*models.EventGenerateRequest, error) {
	var plist []*models.EventGenerateRequest
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing EventGenerateRequest by uuid
func (client *EventGenerateRequestClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.EventGenerateRequest, error) {
	var obj *models.EventGenerateRequest
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing EventGenerateRequest by name
func (client *EventGenerateRequestClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.EventGenerateRequest, error) {
	var obj *models.EventGenerateRequest
	err := client.aviSession.GetObjectByName("eventgeneraterequest", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing EventGenerateRequest by filters like name, cloud, tenant
// Api creates EventGenerateRequest object with every call.
func (client *EventGenerateRequestClient) GetObject(options ...session.ApiOptionsParams) (*models.EventGenerateRequest, error) {
	var obj *models.EventGenerateRequest
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("eventgeneraterequest", newOptions...)
	return obj, err
}

// Create a new EventGenerateRequest object
func (client *EventGenerateRequestClient) Create(obj *models.EventGenerateRequest, options ...session.ApiOptionsParams) (*models.EventGenerateRequest, error) {
	var robj *models.EventGenerateRequest
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing EventGenerateRequest object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.EventGenerateRequest
// or it should be json compatible of form map[string]interface{}
func (client *EventGenerateRequestClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.EventGenerateRequest, error) {
	var robj *models.EventGenerateRequest
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing EventGenerateRequest object with a given UUID
func (client *EventGenerateRequestClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *EventGenerateRequestClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
