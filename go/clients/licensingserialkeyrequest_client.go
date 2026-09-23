// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LicensingSerialKeyRequestClient is a client for avi LicensingSerialKeyRequest resource
type LicensingSerialKeyRequestClient struct {
	aviSession *session.AviSession
}

// NewLicensingSerialKeyRequestClient creates a new client for LicensingSerialKeyRequest resource
func NewLicensingSerialKeyRequestClient(aviSession *session.AviSession) *LicensingSerialKeyRequestClient {
	return &LicensingSerialKeyRequestClient{aviSession: aviSession}
}

func (client *LicensingSerialKeyRequestClient) getAPIPath(uuid string) string {
	path := "api/licensingserialkeyrequest"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LicensingSerialKeyRequest objects
func (client *LicensingSerialKeyRequestClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LicensingSerialKeyRequest, error) {
	var plist []*models.LicensingSerialKeyRequest
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LicensingSerialKeyRequest by uuid
func (client *LicensingSerialKeyRequestClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LicensingSerialKeyRequest, error) {
	var obj *models.LicensingSerialKeyRequest
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LicensingSerialKeyRequest by name
func (client *LicensingSerialKeyRequestClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LicensingSerialKeyRequest, error) {
	var obj *models.LicensingSerialKeyRequest
	err := client.aviSession.GetObjectByName("licensingserialkeyrequest", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LicensingSerialKeyRequest by filters like name, cloud, tenant
// Api creates LicensingSerialKeyRequest object with every call.
func (client *LicensingSerialKeyRequestClient) GetObject(options ...session.ApiOptionsParams) (*models.LicensingSerialKeyRequest, error) {
	var obj *models.LicensingSerialKeyRequest
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("licensingserialkeyrequest", newOptions...)
	return obj, err
}

// Create a new LicensingSerialKeyRequest object
func (client *LicensingSerialKeyRequestClient) Create(obj *models.LicensingSerialKeyRequest, options ...session.ApiOptionsParams) (*models.LicensingSerialKeyRequest, error) {
	var robj *models.LicensingSerialKeyRequest
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing LicensingSerialKeyRequest object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LicensingSerialKeyRequest
// or it should be json compatible of form map[string]interface{}
func (client *LicensingSerialKeyRequestClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LicensingSerialKeyRequest, error) {
	var robj *models.LicensingSerialKeyRequest
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LicensingSerialKeyRequest object with a given UUID
func (client *LicensingSerialKeyRequestClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *LicensingSerialKeyRequestClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
