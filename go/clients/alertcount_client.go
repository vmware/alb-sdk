// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// AlertCountClient is a client for avi AlertCount resource
type AlertCountClient struct {
	aviSession *session.AviSession
}

// NewAlertCountClient creates a new client for AlertCount resource
func NewAlertCountClient(aviSession *session.AviSession) *AlertCountClient {
	return &AlertCountClient{aviSession: aviSession}
}

func (client *AlertCountClient) getAPIPath(uuid string) string {
	path := "api/alertcount"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of AlertCount objects
func (client *AlertCountClient) GetAll(options ...session.ApiOptionsParams) ([]*models.AlertCount, error) {
	var plist []*models.AlertCount
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing AlertCount by uuid
func (client *AlertCountClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.AlertCount, error) {
	var obj *models.AlertCount
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing AlertCount by name
func (client *AlertCountClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.AlertCount, error) {
	var obj *models.AlertCount
	err := client.aviSession.GetObjectByName("alertcount", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing AlertCount by filters like name, cloud, tenant
// Api creates AlertCount object with every call.
func (client *AlertCountClient) GetObject(options ...session.ApiOptionsParams) (*models.AlertCount, error) {
	var obj *models.AlertCount
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("alertcount", newOptions...)
	return obj, err
}

// Create a new AlertCount object
func (client *AlertCountClient) Create(obj *models.AlertCount, options ...session.ApiOptionsParams) (*models.AlertCount, error) {
	var robj *models.AlertCount
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing AlertCount object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.AlertCount
// or it should be json compatible of form map[string]interface{}
func (client *AlertCountClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.AlertCount, error) {
	var robj *models.AlertCount
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing AlertCount object with a given UUID
func (client *AlertCountClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *AlertCountClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
