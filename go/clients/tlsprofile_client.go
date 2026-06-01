// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TLSProfileClient is a client for avi TLSProfile resource
type TLSProfileClient struct {
	aviSession *session.AviSession
}

// NewTLSProfileClient creates a new client for TLSProfile resource
func NewTLSProfileClient(aviSession *session.AviSession) *TLSProfileClient {
	return &TLSProfileClient{aviSession: aviSession}
}

func (client *TLSProfileClient) getAPIPath(uuid string) string {
	path := "api/tlsprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TLSProfile objects
func (client *TLSProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TLSProfile, error) {
	var plist []*models.TLSProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TLSProfile by uuid
func (client *TLSProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var obj *models.TLSProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TLSProfile by name
func (client *TLSProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var obj *models.TLSProfile
	err := client.aviSession.GetObjectByName("tlsprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TLSProfile by filters like name, cloud, tenant
// Api creates TLSProfile object with every call.
func (client *TLSProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var obj *models.TLSProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("tlsprofile", newOptions...)
	return obj, err
}

// Create a new TLSProfile object
func (client *TLSProfileClient) Create(obj *models.TLSProfile, options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var robj *models.TLSProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TLSProfile object
func (client *TLSProfileClient) Update(obj *models.TLSProfile, options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var robj *models.TLSProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TLSProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TLSProfile
// or it should be json compatible of form map[string]interface{}
func (client *TLSProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TLSProfile, error) {
	var robj *models.TLSProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TLSProfile object with a given UUID
func (client *TLSProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TLSProfile object with a given name
func (client *TLSProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TLSProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
