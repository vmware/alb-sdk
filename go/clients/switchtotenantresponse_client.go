// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SwitchToTenantResponseClient is a client for avi SwitchToTenantResponse resource
type SwitchToTenantResponseClient struct {
	aviSession *session.AviSession
}

// NewSwitchToTenantResponseClient creates a new client for SwitchToTenantResponse resource
func NewSwitchToTenantResponseClient(aviSession *session.AviSession) *SwitchToTenantResponseClient {
	return &SwitchToTenantResponseClient{aviSession: aviSession}
}

func (client *SwitchToTenantResponseClient) getAPIPath(uuid string) string {
	path := "api/switchtotenantresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SwitchToTenantResponse objects
func (client *SwitchToTenantResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SwitchToTenantResponse, error) {
	var plist []*models.SwitchToTenantResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SwitchToTenantResponse by uuid
func (client *SwitchToTenantResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SwitchToTenantResponse, error) {
	var obj *models.SwitchToTenantResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SwitchToTenantResponse by name
func (client *SwitchToTenantResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SwitchToTenantResponse, error) {
	var obj *models.SwitchToTenantResponse
	err := client.aviSession.GetObjectByName("switchtotenantresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SwitchToTenantResponse by filters like name, cloud, tenant
// Api creates SwitchToTenantResponse object with every call.
func (client *SwitchToTenantResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.SwitchToTenantResponse, error) {
	var obj *models.SwitchToTenantResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("switchtotenantresponse", newOptions...)
	return obj, err
}

// Create a new SwitchToTenantResponse object
func (client *SwitchToTenantResponseClient) Create(obj *models.SwitchToTenantResponse, options ...session.ApiOptionsParams) (*models.SwitchToTenantResponse, error) {
	var robj *models.SwitchToTenantResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SwitchToTenantResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SwitchToTenantResponse
// or it should be json compatible of form map[string]interface{}
func (client *SwitchToTenantResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SwitchToTenantResponse, error) {
	var robj *models.SwitchToTenantResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SwitchToTenantResponse object with a given UUID
func (client *SwitchToTenantResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SwitchToTenantResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
