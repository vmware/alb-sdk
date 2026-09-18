// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ConfigExportBundleInfoClient is a client for avi ConfigExportBundleInfo resource
type ConfigExportBundleInfoClient struct {
	aviSession *session.AviSession
}

// NewConfigExportBundleInfoClient creates a new client for ConfigExportBundleInfo resource
func NewConfigExportBundleInfoClient(aviSession *session.AviSession) *ConfigExportBundleInfoClient {
	return &ConfigExportBundleInfoClient{aviSession: aviSession}
}

func (client *ConfigExportBundleInfoClient) getAPIPath(uuid string) string {
	path := "api/configexportbundleinfo"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ConfigExportBundleInfo objects
func (client *ConfigExportBundleInfoClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ConfigExportBundleInfo, error) {
	var plist []*models.ConfigExportBundleInfo
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ConfigExportBundleInfo by uuid
func (client *ConfigExportBundleInfoClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ConfigExportBundleInfo, error) {
	var obj *models.ConfigExportBundleInfo
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ConfigExportBundleInfo by name
func (client *ConfigExportBundleInfoClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ConfigExportBundleInfo, error) {
	var obj *models.ConfigExportBundleInfo
	err := client.aviSession.GetObjectByName("configexportbundleinfo", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ConfigExportBundleInfo by filters like name, cloud, tenant
// Api creates ConfigExportBundleInfo object with every call.
func (client *ConfigExportBundleInfoClient) GetObject(options ...session.ApiOptionsParams) (*models.ConfigExportBundleInfo, error) {
	var obj *models.ConfigExportBundleInfo
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("configexportbundleinfo", newOptions...)
	return obj, err
}

// Create a new ConfigExportBundleInfo object
func (client *ConfigExportBundleInfoClient) Create(obj *models.ConfigExportBundleInfo, options ...session.ApiOptionsParams) (*models.ConfigExportBundleInfo, error) {
	var robj *models.ConfigExportBundleInfo
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ConfigExportBundleInfo object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ConfigExportBundleInfo
// or it should be json compatible of form map[string]interface{}
func (client *ConfigExportBundleInfoClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ConfigExportBundleInfo, error) {
	var robj *models.ConfigExportBundleInfo
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ConfigExportBundleInfo object with a given UUID
func (client *ConfigExportBundleInfoClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ConfigExportBundleInfoClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
