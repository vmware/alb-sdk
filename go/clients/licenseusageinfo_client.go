// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// LicenseUsageInfoClient is a client for avi LicenseUsageInfo resource
type LicenseUsageInfoClient struct {
	aviSession *session.AviSession
}

// NewLicenseUsageInfoClient creates a new client for LicenseUsageInfo resource
func NewLicenseUsageInfoClient(aviSession *session.AviSession) *LicenseUsageInfoClient {
	return &LicenseUsageInfoClient{aviSession: aviSession}
}

func (client *LicenseUsageInfoClient) getAPIPath(uuid string) string {
	path := "api/licenseusageinfo"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of LicenseUsageInfo objects
func (client *LicenseUsageInfoClient) GetAll(options ...session.ApiOptionsParams) ([]*models.LicenseUsageInfo, error) {
	var plist []*models.LicenseUsageInfo
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing LicenseUsageInfo by uuid
func (client *LicenseUsageInfoClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.LicenseUsageInfo, error) {
	var obj *models.LicenseUsageInfo
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing LicenseUsageInfo by name
func (client *LicenseUsageInfoClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.LicenseUsageInfo, error) {
	var obj *models.LicenseUsageInfo
	err := client.aviSession.GetObjectByName("licenseusageinfo", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing LicenseUsageInfo by filters like name, cloud, tenant
// Api creates LicenseUsageInfo object with every call.
func (client *LicenseUsageInfoClient) GetObject(options ...session.ApiOptionsParams) (*models.LicenseUsageInfo, error) {
	var obj *models.LicenseUsageInfo
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("licenseusageinfo", newOptions...)
	return obj, err
}

// Create a new LicenseUsageInfo object
func (client *LicenseUsageInfoClient) Create(obj *models.LicenseUsageInfo, options ...session.ApiOptionsParams) (*models.LicenseUsageInfo, error) {
	var robj *models.LicenseUsageInfo
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing LicenseUsageInfo object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.LicenseUsageInfo
// or it should be json compatible of form map[string]interface{}
func (client *LicenseUsageInfoClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.LicenseUsageInfo, error) {
	var robj *models.LicenseUsageInfo
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing LicenseUsageInfo object with a given UUID
func (client *LicenseUsageInfoClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *LicenseUsageInfoClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
