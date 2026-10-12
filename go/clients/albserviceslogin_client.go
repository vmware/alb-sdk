// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ALBServicesLoginClient is a client for avi ALBServicesLogin resource
type ALBServicesLoginClient struct {
	aviSession *session.AviSession
}

// NewALBServicesLoginClient creates a new client for ALBServicesLogin resource
func NewALBServicesLoginClient(aviSession *session.AviSession) *ALBServicesLoginClient {
	return &ALBServicesLoginClient{aviSession: aviSession}
}

func (client *ALBServicesLoginClient) getAPIPath(uuid string) string {
	path := "api/albserviceslogin"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ALBServicesLogin objects
func (client *ALBServicesLoginClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ALBServicesLogin, error) {
	var plist []*models.ALBServicesLogin
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ALBServicesLogin by uuid
func (client *ALBServicesLoginClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ALBServicesLogin, error) {
	var obj *models.ALBServicesLogin
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ALBServicesLogin by name
func (client *ALBServicesLoginClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ALBServicesLogin, error) {
	var obj *models.ALBServicesLogin
	err := client.aviSession.GetObjectByName("albserviceslogin", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ALBServicesLogin by filters like name, cloud, tenant
// Api creates ALBServicesLogin object with every call.
func (client *ALBServicesLoginClient) GetObject(options ...session.ApiOptionsParams) (*models.ALBServicesLogin, error) {
	var obj *models.ALBServicesLogin
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("albserviceslogin", newOptions...)
	return obj, err
}

// Create a new ALBServicesLogin object
func (client *ALBServicesLoginClient) Create(obj *models.ALBServicesLogin, options ...session.ApiOptionsParams) (*models.ALBServicesLogin, error) {
	var robj *models.ALBServicesLogin
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ALBServicesLogin object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ALBServicesLogin
// or it should be json compatible of form map[string]interface{}
func (client *ALBServicesLoginClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ALBServicesLogin, error) {
	var robj *models.ALBServicesLogin
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ALBServicesLogin object with a given UUID
func (client *ALBServicesLoginClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ALBServicesLoginClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
