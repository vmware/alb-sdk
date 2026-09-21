// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// EventLogClient is a client for avi EventLog resource
type EventLogClient struct {
	aviSession *session.AviSession
}

// NewEventLogClient creates a new client for EventLog resource
func NewEventLogClient(aviSession *session.AviSession) *EventLogClient {
	return &EventLogClient{aviSession: aviSession}
}

func (client *EventLogClient) getAPIPath(uuid string) string {
	path := "api/eventlog"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of EventLog objects
func (client *EventLogClient) GetAll(options ...session.ApiOptionsParams) ([]*models.EventLog, error) {
	var plist []*models.EventLog
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing EventLog by uuid
func (client *EventLogClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.EventLog, error) {
	var obj *models.EventLog
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing EventLog by name
func (client *EventLogClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.EventLog, error) {
	var obj *models.EventLog
	err := client.aviSession.GetObjectByName("eventlog", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing EventLog by filters like name, cloud, tenant
// Api creates EventLog object with every call.
func (client *EventLogClient) GetObject(options ...session.ApiOptionsParams) (*models.EventLog, error) {
	var obj *models.EventLog
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("eventlog", newOptions...)
	return obj, err
}

// Create a new EventLog object
func (client *EventLogClient) Create(obj *models.EventLog, options ...session.ApiOptionsParams) (*models.EventLog, error) {
	var robj *models.EventLog
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing EventLog object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.EventLog
// or it should be json compatible of form map[string]interface{}
func (client *EventLogClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.EventLog, error) {
	var robj *models.EventLog
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing EventLog object with a given UUID
func (client *EventLogClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *EventLogClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
