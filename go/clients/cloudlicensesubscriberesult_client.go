// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// CloudLicenseSubscribeResultClient is a client for avi CloudLicenseSubscribeResult resource
type CloudLicenseSubscribeResultClient struct {
	aviSession *session.AviSession
}

// NewCloudLicenseSubscribeResultClient creates a new client for CloudLicenseSubscribeResult resource
func NewCloudLicenseSubscribeResultClient(aviSession *session.AviSession) *CloudLicenseSubscribeResultClient {
	return &CloudLicenseSubscribeResultClient{aviSession: aviSession}
}

func (client *CloudLicenseSubscribeResultClient) getAPIPath(uuid string) string {
	path := "api/cloudlicensesubscriberesult"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of CloudLicenseSubscribeResult objects
func (client *CloudLicenseSubscribeResultClient) GetAll(options ...session.ApiOptionsParams) ([]*models.CloudLicenseSubscribeResult, error) {
	var plist []*models.CloudLicenseSubscribeResult
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing CloudLicenseSubscribeResult by uuid
func (client *CloudLicenseSubscribeResultClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.CloudLicenseSubscribeResult, error) {
	var obj *models.CloudLicenseSubscribeResult
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing CloudLicenseSubscribeResult by name
func (client *CloudLicenseSubscribeResultClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.CloudLicenseSubscribeResult, error) {
	var obj *models.CloudLicenseSubscribeResult
	err := client.aviSession.GetObjectByName("cloudlicensesubscriberesult", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing CloudLicenseSubscribeResult by filters like name, cloud, tenant
// Api creates CloudLicenseSubscribeResult object with every call.
func (client *CloudLicenseSubscribeResultClient) GetObject(options ...session.ApiOptionsParams) (*models.CloudLicenseSubscribeResult, error) {
	var obj *models.CloudLicenseSubscribeResult
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("cloudlicensesubscriberesult", newOptions...)
	return obj, err
}

// Create a new CloudLicenseSubscribeResult object
func (client *CloudLicenseSubscribeResultClient) Create(obj *models.CloudLicenseSubscribeResult, options ...session.ApiOptionsParams) (*models.CloudLicenseSubscribeResult, error) {
	var robj *models.CloudLicenseSubscribeResult
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing CloudLicenseSubscribeResult object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.CloudLicenseSubscribeResult
// or it should be json compatible of form map[string]interface{}
func (client *CloudLicenseSubscribeResultClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.CloudLicenseSubscribeResult, error) {
	var robj *models.CloudLicenseSubscribeResult
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing CloudLicenseSubscribeResult object with a given UUID
func (client *CloudLicenseSubscribeResultClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *CloudLicenseSubscribeResultClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
