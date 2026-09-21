// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UserPreferencesClient is a client for avi UserPreferences resource
type UserPreferencesClient struct {
	aviSession *session.AviSession
}

// NewUserPreferencesClient creates a new client for UserPreferences resource
func NewUserPreferencesClient(aviSession *session.AviSession) *UserPreferencesClient {
	return &UserPreferencesClient{aviSession: aviSession}
}

func (client *UserPreferencesClient) getAPIPath(uuid string) string {
	path := "api/userpreferences"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UserPreferences objects
func (client *UserPreferencesClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UserPreferences, error) {
	var plist []*models.UserPreferences
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UserPreferences by uuid
func (client *UserPreferencesClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UserPreferences, error) {
	var obj *models.UserPreferences
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UserPreferences by name
func (client *UserPreferencesClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UserPreferences, error) {
	var obj *models.UserPreferences
	err := client.aviSession.GetObjectByName("userpreferences", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UserPreferences by filters like name, cloud, tenant
// Api creates UserPreferences object with every call.
func (client *UserPreferencesClient) GetObject(options ...session.ApiOptionsParams) (*models.UserPreferences, error) {
	var obj *models.UserPreferences
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("userpreferences", newOptions...)
	return obj, err
}

// Create a new UserPreferences object
func (client *UserPreferencesClient) Create(obj *models.UserPreferences, options ...session.ApiOptionsParams) (*models.UserPreferences, error) {
	var robj *models.UserPreferences
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UserPreferences object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UserPreferences
// or it should be json compatible of form map[string]interface{}
func (client *UserPreferencesClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UserPreferences, error) {
	var robj *models.UserPreferences
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UserPreferences object with a given UUID
func (client *UserPreferencesClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UserPreferencesClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
