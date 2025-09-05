// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ApplicationInsightsPolicyClient is a client for avi ApplicationInsightsPolicy resource
type ApplicationInsightsPolicyClient struct {
	aviSession *session.AviSession
}

// NewApplicationInsightsPolicyClient creates a new client for ApplicationInsightsPolicy resource
func NewApplicationInsightsPolicyClient(aviSession *session.AviSession) *ApplicationInsightsPolicyClient {
	return &ApplicationInsightsPolicyClient{aviSession: aviSession}
}

func (client *ApplicationInsightsPolicyClient) getAPIPath(uuid string) string {
	path := "api/applicationinsightspolicy"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ApplicationInsightsPolicy objects
func (client *ApplicationInsightsPolicyClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ApplicationInsightsPolicy, error) {
	var plist []*models.ApplicationInsightsPolicy
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ApplicationInsightsPolicy by uuid
func (client *ApplicationInsightsPolicyClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var obj *models.ApplicationInsightsPolicy
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ApplicationInsightsPolicy by name
func (client *ApplicationInsightsPolicyClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var obj *models.ApplicationInsightsPolicy
	err := client.aviSession.GetObjectByName("applicationinsightspolicy", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ApplicationInsightsPolicy by filters like name, cloud, tenant
// Api creates ApplicationInsightsPolicy object with every call.
func (client *ApplicationInsightsPolicyClient) GetObject(options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var obj *models.ApplicationInsightsPolicy
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("applicationinsightspolicy", newOptions...)
	return obj, err
}

// Create a new ApplicationInsightsPolicy object
func (client *ApplicationInsightsPolicyClient) Create(obj *models.ApplicationInsightsPolicy, options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var robj *models.ApplicationInsightsPolicy
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing ApplicationInsightsPolicy object
func (client *ApplicationInsightsPolicyClient) Update(obj *models.ApplicationInsightsPolicy, options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var robj *models.ApplicationInsightsPolicy
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing ApplicationInsightsPolicy object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ApplicationInsightsPolicy
// or it should be json compatible of form map[string]interface{}
func (client *ApplicationInsightsPolicyClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ApplicationInsightsPolicy, error) {
	var robj *models.ApplicationInsightsPolicy
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ApplicationInsightsPolicy object with a given UUID
func (client *ApplicationInsightsPolicyClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing ApplicationInsightsPolicy object with a given name
func (client *ApplicationInsightsPolicyClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ApplicationInsightsPolicyClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
