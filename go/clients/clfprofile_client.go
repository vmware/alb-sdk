// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ClfProfileClient is a client for avi ClfProfile resource
type ClfProfileClient struct {
	aviSession *session.AviSession
}

// NewClfProfileClient creates a new client for ClfProfile resource
func NewClfProfileClient(aviSession *session.AviSession) *ClfProfileClient {
	return &ClfProfileClient{aviSession: aviSession}
}

func (client *ClfProfileClient) getAPIPath(uuid string) string {
	path := "api/clfprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ClfProfile objects
func (client *ClfProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ClfProfile, error) {
	var plist []*models.ClfProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ClfProfile by uuid
func (client *ClfProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var obj *models.ClfProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ClfProfile by name
func (client *ClfProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var obj *models.ClfProfile
	err := client.aviSession.GetObjectByName("clfprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ClfProfile by filters like name, cloud, tenant
// Api creates ClfProfile object with every call.
func (client *ClfProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var obj *models.ClfProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("clfprofile", newOptions...)
	return obj, err
}

// Create a new ClfProfile object
func (client *ClfProfileClient) Create(obj *models.ClfProfile, options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var robj *models.ClfProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing ClfProfile object
func (client *ClfProfileClient) Update(obj *models.ClfProfile, options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var robj *models.ClfProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing ClfProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ClfProfile
// or it should be json compatible of form map[string]interface{}
func (client *ClfProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ClfProfile, error) {
	var robj *models.ClfProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ClfProfile object with a given UUID
func (client *ClfProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing ClfProfile object with a given name
func (client *ClfProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ClfProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
