// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// GslbSiteOpsClient is a client for avi GslbSiteOps resource
type GslbSiteOpsClient struct {
	aviSession *session.AviSession
}

// NewGslbSiteOpsClient creates a new client for GslbSiteOps resource
func NewGslbSiteOpsClient(aviSession *session.AviSession) *GslbSiteOpsClient {
	return &GslbSiteOpsClient{aviSession: aviSession}
}

func (client *GslbSiteOpsClient) getAPIPath(uuid string) string {
	path := "api/gslbsiteops"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of GslbSiteOps objects
func (client *GslbSiteOpsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.GslbSiteOps, error) {
	var plist []*models.GslbSiteOps
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing GslbSiteOps by uuid
func (client *GslbSiteOpsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var obj *models.GslbSiteOps
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing GslbSiteOps by name
func (client *GslbSiteOpsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var obj *models.GslbSiteOps
	err := client.aviSession.GetObjectByName("gslbsiteops", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing GslbSiteOps by filters like name, cloud, tenant
// Api creates GslbSiteOps object with every call.
func (client *GslbSiteOpsClient) GetObject(options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var obj *models.GslbSiteOps
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("gslbsiteops", newOptions...)
	return obj, err
}

// Create a new GslbSiteOps object
func (client *GslbSiteOpsClient) Create(obj *models.GslbSiteOps, options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var robj *models.GslbSiteOps
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing GslbSiteOps object
func (client *GslbSiteOpsClient) Update(obj *models.GslbSiteOps, options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var robj *models.GslbSiteOps
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing GslbSiteOps object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.GslbSiteOps
// or it should be json compatible of form map[string]interface{}
func (client *GslbSiteOpsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.GslbSiteOps, error) {
	var robj *models.GslbSiteOps
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing GslbSiteOps object with a given UUID
func (client *GslbSiteOpsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing GslbSiteOps object with a given name
func (client *GslbSiteOpsClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *GslbSiteOpsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
