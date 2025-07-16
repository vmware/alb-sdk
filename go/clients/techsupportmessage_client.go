// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// TechSupportMessageClient is a client for avi TechSupportMessage resource
type TechSupportMessageClient struct {
	aviSession *session.AviSession
}

// NewTechSupportMessageClient creates a new client for TechSupportMessage resource
func NewTechSupportMessageClient(aviSession *session.AviSession) *TechSupportMessageClient {
	return &TechSupportMessageClient{aviSession: aviSession}
}

func (client *TechSupportMessageClient) getAPIPath(uuid string) string {
	path := "api/techsupportmessage"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of TechSupportMessage objects
func (client *TechSupportMessageClient) GetAll(options ...session.ApiOptionsParams) ([]*models.TechSupportMessage, error) {
	var plist []*models.TechSupportMessage
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing TechSupportMessage by uuid
func (client *TechSupportMessageClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var obj *models.TechSupportMessage
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing TechSupportMessage by name
func (client *TechSupportMessageClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var obj *models.TechSupportMessage
	err := client.aviSession.GetObjectByName("techsupportmessage", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing TechSupportMessage by filters like name, cloud, tenant
// Api creates TechSupportMessage object with every call.
func (client *TechSupportMessageClient) GetObject(options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var obj *models.TechSupportMessage
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("techsupportmessage", newOptions...)
	return obj, err
}

// Create a new TechSupportMessage object
func (client *TechSupportMessageClient) Create(obj *models.TechSupportMessage, options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var robj *models.TechSupportMessage
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing TechSupportMessage object
func (client *TechSupportMessageClient) Update(obj *models.TechSupportMessage, options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var robj *models.TechSupportMessage
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing TechSupportMessage object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.TechSupportMessage
// or it should be json compatible of form map[string]interface{}
func (client *TechSupportMessageClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.TechSupportMessage, error) {
	var robj *models.TechSupportMessage
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing TechSupportMessage object with a given UUID
func (client *TechSupportMessageClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing TechSupportMessage object with a given name
func (client *TechSupportMessageClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *TechSupportMessageClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
