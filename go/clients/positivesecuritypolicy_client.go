// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PositiveSecurityPolicyClient is a client for avi PositiveSecurityPolicy resource
type PositiveSecurityPolicyClient struct {
	aviSession *session.AviSession
}

// NewPositiveSecurityPolicyClient creates a new client for PositiveSecurityPolicy resource
func NewPositiveSecurityPolicyClient(aviSession *session.AviSession) *PositiveSecurityPolicyClient {
	return &PositiveSecurityPolicyClient{aviSession: aviSession}
}

func (client *PositiveSecurityPolicyClient) getAPIPath(uuid string) string {
	path := "api/positivesecuritypolicy"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PositiveSecurityPolicy objects
func (client *PositiveSecurityPolicyClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PositiveSecurityPolicy, error) {
	var plist []*models.PositiveSecurityPolicy
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PositiveSecurityPolicy by uuid
func (client *PositiveSecurityPolicyClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var obj *models.PositiveSecurityPolicy
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PositiveSecurityPolicy by name
func (client *PositiveSecurityPolicyClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var obj *models.PositiveSecurityPolicy
	err := client.aviSession.GetObjectByName("positivesecuritypolicy", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PositiveSecurityPolicy by filters like name, cloud, tenant
// Api creates PositiveSecurityPolicy object with every call.
func (client *PositiveSecurityPolicyClient) GetObject(options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var obj *models.PositiveSecurityPolicy
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("positivesecuritypolicy", newOptions...)
	return obj, err
}

// Create a new PositiveSecurityPolicy object
func (client *PositiveSecurityPolicyClient) Create(obj *models.PositiveSecurityPolicy, options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var robj *models.PositiveSecurityPolicy
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing PositiveSecurityPolicy object
func (client *PositiveSecurityPolicyClient) Update(obj *models.PositiveSecurityPolicy, options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var robj *models.PositiveSecurityPolicy
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing PositiveSecurityPolicy object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PositiveSecurityPolicy
// or it should be json compatible of form map[string]interface{}
func (client *PositiveSecurityPolicyClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PositiveSecurityPolicy, error) {
	var robj *models.PositiveSecurityPolicy
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PositiveSecurityPolicy object with a given UUID
func (client *PositiveSecurityPolicyClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing PositiveSecurityPolicy object with a given name
func (client *PositiveSecurityPolicyClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *PositiveSecurityPolicyClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
