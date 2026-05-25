// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LabelProfileClient is a client for avi LabelProfile resource
type LabelProfileClient struct {
	aviSession *session.AviSession
}

// NewLabelProfileClient creates a new client for LabelProfile resource
func NewLabelProfileClient(aviSession *session.AviSession) *LabelProfileClient {
	return &LabelProfileClient{aviSession: aviSession}
}

func (client *LabelProfileClient) getAPIPath(uuid string) string {
	path := "api/labelprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LabelProfile objects
func (client *LabelProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LabelProfile, error) {
	var plist []*models.LabelProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LabelProfile by uuid
func (client *LabelProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var obj *models.LabelProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LabelProfile by name
func (client *LabelProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var obj *models.LabelProfile
	err := client.aviSession.GetObjectByName("labelprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LabelProfile by filters like name, cloud, tenant
// Api creates LabelProfile object with every call.
func (client *LabelProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var obj *models.LabelProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("labelprofile", newOptions...)
	return obj, err
}

// Create a new LabelProfile object
func (client *LabelProfileClient) Create(obj *models.LabelProfile, options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var robj *models.LabelProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing LabelProfile object
func (client *LabelProfileClient) Update(obj *models.LabelProfile, options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var robj *models.LabelProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing LabelProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LabelProfile
// or it should be json compatible of form map[string]interface{}
func (client *LabelProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LabelProfile, error) {
	var robj *models.LabelProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LabelProfile object with a given UUID
func (client *LabelProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing LabelProfile object with a given name
func (client *LabelProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *LabelProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
