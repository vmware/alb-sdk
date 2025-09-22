// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PasswordPolicyClient is a client for avi PasswordPolicy resource
type PasswordPolicyClient struct {
	aviSession *session.AviSession
}

// NewPasswordPolicyClient creates a new client for PasswordPolicy resource
func NewPasswordPolicyClient(aviSession *session.AviSession) *PasswordPolicyClient {
	return &PasswordPolicyClient{aviSession: aviSession}
}

func (client *PasswordPolicyClient) getAPIPath(uuid string) string {
	path := "api/passwordpolicy"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PasswordPolicy objects
func (client *PasswordPolicyClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PasswordPolicy, error) {
	var plist []*models.PasswordPolicy
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PasswordPolicy by uuid
func (client *PasswordPolicyClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var obj *models.PasswordPolicy
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PasswordPolicy by name
func (client *PasswordPolicyClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var obj *models.PasswordPolicy
	err := client.aviSession.GetObjectByName("passwordpolicy", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PasswordPolicy by filters like name, cloud, tenant
// Api creates PasswordPolicy object with every call.
func (client *PasswordPolicyClient) GetObject(options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var obj *models.PasswordPolicy
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("passwordpolicy", newOptions...)
	return obj, err
}

// Create a new PasswordPolicy object
func (client *PasswordPolicyClient) Create(obj *models.PasswordPolicy, options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var robj *models.PasswordPolicy
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing PasswordPolicy object
func (client *PasswordPolicyClient) Update(obj *models.PasswordPolicy, options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var robj *models.PasswordPolicy
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing PasswordPolicy object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PasswordPolicy
// or it should be json compatible of form map[string]interface{}
func (client *PasswordPolicyClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PasswordPolicy, error) {
	var robj *models.PasswordPolicy
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PasswordPolicy object with a given UUID
func (client *PasswordPolicyClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing PasswordPolicy object with a given name
func (client *PasswordPolicyClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *PasswordPolicyClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
