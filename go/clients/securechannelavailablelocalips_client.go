// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SecureChannelAvailableLocalIPsClient is a client for avi SecureChannelAvailableLocalIPs resource
type SecureChannelAvailableLocalIPsClient struct {
	aviSession *session.AviSession
}

// NewSecureChannelAvailableLocalIPsClient creates a new client for SecureChannelAvailableLocalIPs resource
func NewSecureChannelAvailableLocalIPsClient(aviSession *session.AviSession) *SecureChannelAvailableLocalIPsClient {
	return &SecureChannelAvailableLocalIPsClient{aviSession: aviSession}
}

func (client *SecureChannelAvailableLocalIPsClient) getAPIPath(uuid string) string {
	path := "api/securechannelavailablelocalips"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SecureChannelAvailableLocalIPs objects
func (client *SecureChannelAvailableLocalIPsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SecureChannelAvailableLocalIPs, error) {
	var plist []*models.SecureChannelAvailableLocalIPs
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SecureChannelAvailableLocalIPs by uuid
func (client *SecureChannelAvailableLocalIPsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var obj *models.SecureChannelAvailableLocalIPs
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SecureChannelAvailableLocalIPs by name
func (client *SecureChannelAvailableLocalIPsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var obj *models.SecureChannelAvailableLocalIPs
	err := client.aviSession.GetObjectByName("securechannelavailablelocalips", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SecureChannelAvailableLocalIPs by filters like name, cloud, tenant
// Api creates SecureChannelAvailableLocalIPs object with every call.
func (client *SecureChannelAvailableLocalIPsClient) GetObject(options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var obj *models.SecureChannelAvailableLocalIPs
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("securechannelavailablelocalips", newOptions...)
	return obj, err
}

// Create a new SecureChannelAvailableLocalIPs object
func (client *SecureChannelAvailableLocalIPsClient) Create(obj *models.SecureChannelAvailableLocalIPs, options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var robj *models.SecureChannelAvailableLocalIPs
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing SecureChannelAvailableLocalIPs object
func (client *SecureChannelAvailableLocalIPsClient) Update(obj *models.SecureChannelAvailableLocalIPs, options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var robj *models.SecureChannelAvailableLocalIPs
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing SecureChannelAvailableLocalIPs object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SecureChannelAvailableLocalIPs
// or it should be json compatible of form map[string]interface{}
func (client *SecureChannelAvailableLocalIPsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SecureChannelAvailableLocalIPs, error) {
	var robj *models.SecureChannelAvailableLocalIPs
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SecureChannelAvailableLocalIPs object with a given UUID
func (client *SecureChannelAvailableLocalIPsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing SecureChannelAvailableLocalIPs object with a given name
func (client *SecureChannelAvailableLocalIPsClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *SecureChannelAvailableLocalIPsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
