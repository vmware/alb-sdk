// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SspInstanceClient is a client for avi SspInstance resource
type SspInstanceClient struct {
	aviSession *session.AviSession
}

// NewSspInstanceClient creates a new client for SspInstance resource
func NewSspInstanceClient(aviSession *session.AviSession) *SspInstanceClient {
	return &SspInstanceClient{aviSession: aviSession}
}

func (client *SspInstanceClient) getAPIPath(uuid string) string {
	path := "api/sspinstance"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SspInstance objects
func (client *SspInstanceClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SspInstance, error) {
	var plist []*models.SspInstance
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SspInstance by uuid
func (client *SspInstanceClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var obj *models.SspInstance
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SspInstance by name
func (client *SspInstanceClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var obj *models.SspInstance
	err := client.aviSession.GetObjectByName("sspinstance", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SspInstance by filters like name, cloud, tenant
// Api creates SspInstance object with every call.
func (client *SspInstanceClient) GetObject(options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var obj *models.SspInstance
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("sspinstance", newOptions...)
	return obj, err
}

// Create a new SspInstance object
func (client *SspInstanceClient) Create(obj *models.SspInstance, options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var robj *models.SspInstance
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing SspInstance object
func (client *SspInstanceClient) Update(obj *models.SspInstance, options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var robj *models.SspInstance
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing SspInstance object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SspInstance
// or it should be json compatible of form map[string]interface{}
func (client *SspInstanceClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SspInstance, error) {
	var robj *models.SspInstance
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SspInstance object with a given UUID
func (client *SspInstanceClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing SspInstance object with a given name
func (client *SspInstanceClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *SspInstanceClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
