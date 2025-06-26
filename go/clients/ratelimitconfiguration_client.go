// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RateLimitConfigurationClient is a client for avi RateLimitConfiguration resource
type RateLimitConfigurationClient struct {
	aviSession *session.AviSession
}

// NewRateLimitConfigurationClient creates a new client for RateLimitConfiguration resource
func NewRateLimitConfigurationClient(aviSession *session.AviSession) *RateLimitConfigurationClient {
	return &RateLimitConfigurationClient{aviSession: aviSession}
}

func (client *RateLimitConfigurationClient) getAPIPath(uuid string) string {
	path := "api/ratelimitconfiguration"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RateLimitConfiguration objects
func (client *RateLimitConfigurationClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RateLimitConfiguration, error) {
	var plist []*models.RateLimitConfiguration
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RateLimitConfiguration by uuid
func (client *RateLimitConfigurationClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var obj *models.RateLimitConfiguration
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RateLimitConfiguration by name
func (client *RateLimitConfigurationClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var obj *models.RateLimitConfiguration
	err := client.aviSession.GetObjectByName("ratelimitconfiguration", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RateLimitConfiguration by filters like name, cloud, tenant
// Api creates RateLimitConfiguration object with every call.
func (client *RateLimitConfigurationClient) GetObject(options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var obj *models.RateLimitConfiguration
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("ratelimitconfiguration", newOptions...)
	return obj, err
}

// Create a new RateLimitConfiguration object
func (client *RateLimitConfigurationClient) Create(obj *models.RateLimitConfiguration, options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var robj *models.RateLimitConfiguration
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing RateLimitConfiguration object
func (client *RateLimitConfigurationClient) Update(obj *models.RateLimitConfiguration, options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var robj *models.RateLimitConfiguration
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing RateLimitConfiguration object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RateLimitConfiguration
// or it should be json compatible of form map[string]interface{}
func (client *RateLimitConfigurationClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RateLimitConfiguration, error) {
	var robj *models.RateLimitConfiguration
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RateLimitConfiguration object with a given UUID
func (client *RateLimitConfigurationClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing RateLimitConfiguration object with a given name
func (client *RateLimitConfigurationClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *RateLimitConfigurationClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
