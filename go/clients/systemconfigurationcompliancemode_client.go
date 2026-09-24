// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SystemConfigurationComplianceModeClient is a client for avi SystemConfigurationComplianceMode resource
type SystemConfigurationComplianceModeClient struct {
	aviSession *session.AviSession
}

// NewSystemConfigurationComplianceModeClient creates a new client for SystemConfigurationComplianceMode resource
func NewSystemConfigurationComplianceModeClient(aviSession *session.AviSession) *SystemConfigurationComplianceModeClient {
	return &SystemConfigurationComplianceModeClient{aviSession: aviSession}
}

func (client *SystemConfigurationComplianceModeClient) getAPIPath(uuid string) string {
	path := "api/systemconfigurationcompliancemode"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SystemConfigurationComplianceMode objects
func (client *SystemConfigurationComplianceModeClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SystemConfigurationComplianceMode, error) {
	var plist []*models.SystemConfigurationComplianceMode
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SystemConfigurationComplianceMode by uuid
func (client *SystemConfigurationComplianceModeClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SystemConfigurationComplianceMode, error) {
	var obj *models.SystemConfigurationComplianceMode
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SystemConfigurationComplianceMode by name
func (client *SystemConfigurationComplianceModeClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SystemConfigurationComplianceMode, error) {
	var obj *models.SystemConfigurationComplianceMode
	err := client.aviSession.GetObjectByName("systemconfigurationcompliancemode", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SystemConfigurationComplianceMode by filters like name, cloud, tenant
// Api creates SystemConfigurationComplianceMode object with every call.
func (client *SystemConfigurationComplianceModeClient) GetObject(options ...session.ApiOptionsParams) (*models.SystemConfigurationComplianceMode, error) {
	var obj *models.SystemConfigurationComplianceMode
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("systemconfigurationcompliancemode", newOptions...)
	return obj, err
}

// Create a new SystemConfigurationComplianceMode object
func (client *SystemConfigurationComplianceModeClient) Create(obj *models.SystemConfigurationComplianceMode, options ...session.ApiOptionsParams) (*models.SystemConfigurationComplianceMode, error) {
	var robj *models.SystemConfigurationComplianceMode
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SystemConfigurationComplianceMode object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SystemConfigurationComplianceMode
// or it should be json compatible of form map[string]interface{}
func (client *SystemConfigurationComplianceModeClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SystemConfigurationComplianceMode, error) {
	var robj *models.SystemConfigurationComplianceMode
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SystemConfigurationComplianceMode object with a given UUID
func (client *SystemConfigurationComplianceModeClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SystemConfigurationComplianceModeClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
