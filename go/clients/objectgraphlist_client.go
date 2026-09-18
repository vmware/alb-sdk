// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ObjectGraphListClient is a client for avi ObjectGraphList resource
type ObjectGraphListClient struct {
	aviSession *session.AviSession
}

// NewObjectGraphListClient creates a new client for ObjectGraphList resource
func NewObjectGraphListClient(aviSession *session.AviSession) *ObjectGraphListClient {
	return &ObjectGraphListClient{aviSession: aviSession}
}

func (client *ObjectGraphListClient) getAPIPath(uuid string) string {
	path := "api/objectgraphlist"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ObjectGraphList objects
func (client *ObjectGraphListClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ObjectGraphList, error) {
	var plist []*models.ObjectGraphList
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ObjectGraphList by uuid
func (client *ObjectGraphListClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ObjectGraphList, error) {
	var obj *models.ObjectGraphList
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ObjectGraphList by name
func (client *ObjectGraphListClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ObjectGraphList, error) {
	var obj *models.ObjectGraphList
	err := client.aviSession.GetObjectByName("objectgraphlist", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ObjectGraphList by filters like name, cloud, tenant
// Api creates ObjectGraphList object with every call.
func (client *ObjectGraphListClient) GetObject(options ...session.ApiOptionsParams) (*models.ObjectGraphList, error) {
	var obj *models.ObjectGraphList
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("objectgraphlist", newOptions...)
	return obj, err
}

// Create a new ObjectGraphList object
func (client *ObjectGraphListClient) Create(obj *models.ObjectGraphList, options ...session.ApiOptionsParams) (*models.ObjectGraphList, error) {
	var robj *models.ObjectGraphList
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ObjectGraphList object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ObjectGraphList
// or it should be json compatible of form map[string]interface{}
func (client *ObjectGraphListClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ObjectGraphList, error) {
	var robj *models.ObjectGraphList
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ObjectGraphList object with a given UUID
func (client *ObjectGraphListClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ObjectGraphListClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
