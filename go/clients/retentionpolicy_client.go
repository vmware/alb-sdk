// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// RetentionPolicyClient is a client for avi RetentionPolicy resource
type RetentionPolicyClient struct {
	aviSession *session.AviSession
}

// NewRetentionPolicyClient creates a new client for RetentionPolicy resource
func NewRetentionPolicyClient(aviSession *session.AviSession) *RetentionPolicyClient {
	return &RetentionPolicyClient{aviSession: aviSession}
}

func (client *RetentionPolicyClient) getAPIPath(uuid string) string {
	path := "api/retentionpolicy"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of RetentionPolicy objects
func (client *RetentionPolicyClient) GetAll(options ...session.ApiOptionsParams) ([]*models.RetentionPolicy, error) {
	var plist []*models.RetentionPolicy
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing RetentionPolicy by uuid
func (client *RetentionPolicyClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var obj *models.RetentionPolicy
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing RetentionPolicy by name
func (client *RetentionPolicyClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var obj *models.RetentionPolicy
	err := client.aviSession.GetObjectByName("retentionpolicy", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing RetentionPolicy by filters like name, cloud, tenant
// Api creates RetentionPolicy object with every call.
func (client *RetentionPolicyClient) GetObject(options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var obj *models.RetentionPolicy
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("retentionpolicy", newOptions...)
	return obj, err
}

// Create a new RetentionPolicy object
func (client *RetentionPolicyClient) Create(obj *models.RetentionPolicy, options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var robj *models.RetentionPolicy
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing RetentionPolicy object
func (client *RetentionPolicyClient) Update(obj *models.RetentionPolicy, options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var robj *models.RetentionPolicy
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing RetentionPolicy object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.RetentionPolicy
// or it should be json compatible of form map[string]interface{}
func (client *RetentionPolicyClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.RetentionPolicy, error) {
	var robj *models.RetentionPolicy
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing RetentionPolicy object with a given UUID
func (client *RetentionPolicyClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing RetentionPolicy object with a given name
func (client *RetentionPolicyClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *RetentionPolicyClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
