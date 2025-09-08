// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ApplicationInsightsStateClient is a client for avi ApplicationInsightsState resource
type ApplicationInsightsStateClient struct {
	aviSession *session.AviSession
}

// NewApplicationInsightsStateClient creates a new client for ApplicationInsightsState resource
func NewApplicationInsightsStateClient(aviSession *session.AviSession) *ApplicationInsightsStateClient {
	return &ApplicationInsightsStateClient{aviSession: aviSession}
}

func (client *ApplicationInsightsStateClient) getAPIPath(uuid string) string {
	path := "api/applicationinsightsstate"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ApplicationInsightsState objects
func (client *ApplicationInsightsStateClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ApplicationInsightsState, error) {
	var plist []*models.ApplicationInsightsState
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ApplicationInsightsState by uuid
func (client *ApplicationInsightsStateClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var obj *models.ApplicationInsightsState
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ApplicationInsightsState by name
func (client *ApplicationInsightsStateClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var obj *models.ApplicationInsightsState
	err := client.aviSession.GetObjectByName("applicationinsightsstate", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ApplicationInsightsState by filters like name, cloud, tenant
// Api creates ApplicationInsightsState object with every call.
func (client *ApplicationInsightsStateClient) GetObject(options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var obj *models.ApplicationInsightsState
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("applicationinsightsstate", newOptions...)
	return obj, err
}

// Create a new ApplicationInsightsState object
func (client *ApplicationInsightsStateClient) Create(obj *models.ApplicationInsightsState, options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var robj *models.ApplicationInsightsState
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing ApplicationInsightsState object
func (client *ApplicationInsightsStateClient) Update(obj *models.ApplicationInsightsState, options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var robj *models.ApplicationInsightsState
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing ApplicationInsightsState object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ApplicationInsightsState
// or it should be json compatible of form map[string]interface{}
func (client *ApplicationInsightsStateClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsState, error) {
	var robj *models.ApplicationInsightsState
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ApplicationInsightsState object with a given UUID
func (client *ApplicationInsightsStateClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing ApplicationInsightsState object with a given name
func (client *ApplicationInsightsStateClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ApplicationInsightsStateClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
