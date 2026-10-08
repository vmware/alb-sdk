// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// IPPropertiesResponseClient is a client for avi IPPropertiesResponse resource
type IPPropertiesResponseClient struct {
	aviSession *session.AviSession
}

// NewIPPropertiesResponseClient creates a new client for IPPropertiesResponse resource
func NewIPPropertiesResponseClient(aviSession *session.AviSession) *IPPropertiesResponseClient {
	return &IPPropertiesResponseClient{aviSession: aviSession}
}

func (client *IPPropertiesResponseClient) getAPIPath(uuid string) string {
	path := "api/ippropertiesresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of IPPropertiesResponse objects
func (client *IPPropertiesResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.IPPropertiesResponse, error) {
	var plist []*models.IPPropertiesResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing IPPropertiesResponse by uuid
func (client *IPPropertiesResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.IPPropertiesResponse, error) {
	var obj *models.IPPropertiesResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing IPPropertiesResponse by name
func (client *IPPropertiesResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.IPPropertiesResponse, error) {
	var obj *models.IPPropertiesResponse
	err := client.aviSession.GetObjectByName("ippropertiesresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing IPPropertiesResponse by filters like name, cloud, tenant
// Api creates IPPropertiesResponse object with every call.
func (client *IPPropertiesResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.IPPropertiesResponse, error) {
	var obj *models.IPPropertiesResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("ippropertiesresponse", newOptions...)
	return obj, err
}

// Create a new IPPropertiesResponse object
func (client *IPPropertiesResponseClient) Create(obj *models.IPPropertiesResponse, options ...session.ApiOptionsParams) (*models.IPPropertiesResponse, error) {
	var robj *models.IPPropertiesResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing IPPropertiesResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.IPPropertiesResponse
// or it should be json compatible of form map[string]interface{}
func (client *IPPropertiesResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.IPPropertiesResponse, error) {
	var robj *models.IPPropertiesResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing IPPropertiesResponse object with a given UUID
func (client *IPPropertiesResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *IPPropertiesResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
