// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TrustedHostProfileClient is a client for avi TrustedHostProfile resource
type TrustedHostProfileClient struct {
	aviSession *session.AviSession
}

// NewTrustedHostProfileClient creates a new client for TrustedHostProfile resource
func NewTrustedHostProfileClient(aviSession *session.AviSession) *TrustedHostProfileClient {
	return &TrustedHostProfileClient{aviSession: aviSession}
}

func (client *TrustedHostProfileClient) getAPIPath(uuid string) string {
	path := "api/trustedhostprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TrustedHostProfile objects
func (client *TrustedHostProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TrustedHostProfile, error) {
	var plist []*models.TrustedHostProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TrustedHostProfile by uuid
func (client *TrustedHostProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var obj *models.TrustedHostProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TrustedHostProfile by name
func (client *TrustedHostProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var obj *models.TrustedHostProfile
	err := client.aviSession.GetObjectByName("trustedhostprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TrustedHostProfile by filters like name, cloud, tenant
// Api creates TrustedHostProfile object with every call.
func (client *TrustedHostProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var obj *models.TrustedHostProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("trustedhostprofile", newOptions...)
	return obj, err
}

// Create a new TrustedHostProfile object
func (client *TrustedHostProfileClient) Create(obj *models.TrustedHostProfile, options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var robj *models.TrustedHostProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TrustedHostProfile object
func (client *TrustedHostProfileClient) Update(obj *models.TrustedHostProfile, options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var robj *models.TrustedHostProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TrustedHostProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TrustedHostProfile
// or it should be json compatible of form map[string]interface{}
func (client *TrustedHostProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TrustedHostProfile, error) {
	var robj *models.TrustedHostProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TrustedHostProfile object with a given UUID
func (client *TrustedHostProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TrustedHostProfile object with a given name
func (client *TrustedHostProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TrustedHostProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
