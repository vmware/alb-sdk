// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LocalWorkerFdsVersionClient is a client for avi LocalWorkerFdsVersion resource
type LocalWorkerFdsVersionClient struct {
	aviSession *session.AviSession
}

// NewLocalWorkerFdsVersionClient creates a new client for LocalWorkerFdsVersion resource
func NewLocalWorkerFdsVersionClient(aviSession *session.AviSession) *LocalWorkerFdsVersionClient {
	return &LocalWorkerFdsVersionClient{aviSession: aviSession}
}

func (client *LocalWorkerFdsVersionClient) getAPIPath(uuid string) string {
	path := "api/localworkerfdsversion"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LocalWorkerFdsVersion objects
func (client *LocalWorkerFdsVersionClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LocalWorkerFdsVersion, error) {
	var plist []*models.LocalWorkerFdsVersion
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LocalWorkerFdsVersion by uuid
func (client *LocalWorkerFdsVersionClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var obj *models.LocalWorkerFdsVersion
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LocalWorkerFdsVersion by name
func (client *LocalWorkerFdsVersionClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var obj *models.LocalWorkerFdsVersion
	err := client.aviSession.GetObjectByName("localworkerfdsversion", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LocalWorkerFdsVersion by filters like name, cloud, tenant
// Api creates LocalWorkerFdsVersion object with every call.
func (client *LocalWorkerFdsVersionClient) GetObject(options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var obj *models.LocalWorkerFdsVersion
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("localworkerfdsversion", newOptions...)
	return obj, err
}

// Create a new LocalWorkerFdsVersion object
func (client *LocalWorkerFdsVersionClient) Create(obj *models.LocalWorkerFdsVersion, options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var robj *models.LocalWorkerFdsVersion
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing LocalWorkerFdsVersion object
func (client *LocalWorkerFdsVersionClient) Update(obj *models.LocalWorkerFdsVersion, options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var robj *models.LocalWorkerFdsVersion
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing LocalWorkerFdsVersion object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LocalWorkerFdsVersion
// or it should be json compatible of form map[string]interface{}
func (client *LocalWorkerFdsVersionClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LocalWorkerFdsVersion, error) {
	var robj *models.LocalWorkerFdsVersion
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LocalWorkerFdsVersion object with a given UUID
func (client *LocalWorkerFdsVersionClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing LocalWorkerFdsVersion object with a given name
func (client *LocalWorkerFdsVersionClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *LocalWorkerFdsVersionClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
