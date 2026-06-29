// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ALBServicesStatusClient is a client for avi ALBServicesStatus resource
type ALBServicesStatusClient struct {
	aviSession *session.AviSession
}

// NewALBServicesStatusClient creates a new client for ALBServicesStatus resource
func NewALBServicesStatusClient(aviSession *session.AviSession) *ALBServicesStatusClient {
	return &ALBServicesStatusClient{aviSession: aviSession}
}

func (client *ALBServicesStatusClient) getAPIPath(uuid string) string {
	path := "api/albservicesstatus"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ALBServicesStatus objects
func (client *ALBServicesStatusClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ALBServicesStatus, error) {
	var plist []*models.ALBServicesStatus
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ALBServicesStatus by uuid
func (client *ALBServicesStatusClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var obj *models.ALBServicesStatus
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ALBServicesStatus by name
func (client *ALBServicesStatusClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var obj *models.ALBServicesStatus
	err := client.aviSession.GetObjectByName("albservicesstatus", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ALBServicesStatus by filters like name, cloud, tenant
// Api creates ALBServicesStatus object with every call.
func (client *ALBServicesStatusClient) GetObject(options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var obj *models.ALBServicesStatus
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("albservicesstatus", newOptions...)
	return obj, err
}

// Create a new ALBServicesStatus object
func (client *ALBServicesStatusClient) Create(obj *models.ALBServicesStatus, options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var robj *models.ALBServicesStatus
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing ALBServicesStatus object
func (client *ALBServicesStatusClient) Update(obj *models.ALBServicesStatus, options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var robj *models.ALBServicesStatus
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing ALBServicesStatus object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ALBServicesStatus
// or it should be json compatible of form map[string]interface{}
func (client *ALBServicesStatusClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ALBServicesStatus, error) {
	var robj *models.ALBServicesStatus
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ALBServicesStatus object with a given UUID
func (client *ALBServicesStatusClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing ALBServicesStatus object with a given name
func (client *ALBServicesStatusClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ALBServicesStatusClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
