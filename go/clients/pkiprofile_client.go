// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// PKIProfileClient is a client for avi PKIProfile resource
type PKIProfileClient struct {
	aviSession *session.AviSession
}

// NewPKIProfileClient creates a new client for PKIProfile resource
func NewPKIProfileClient(aviSession *session.AviSession) *PKIProfileClient {
	return &PKIProfileClient{aviSession: aviSession}
}

func (client *PKIProfileClient) getAPIPath(uuid string) string {
	path := "api/pkiprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of PKIProfile objects
func (client *PKIProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.PKIProfile, error) {
	var plist []*models.PKIProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing PKIProfile by uuid
func (client *PKIProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var obj *models.PKIProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing PKIProfile by name
func (client *PKIProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var obj *models.PKIProfile
	err := client.aviSession.GetObjectByName("pkiprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing PKIProfile by filters like name, cloud, tenant
// Api creates PKIProfile object with every call.
func (client *PKIProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var obj *models.PKIProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("pkiprofile", newOptions...)
	return obj, err
}

// Create a new PKIProfile object
func (client *PKIProfileClient) Create(obj *models.PKIProfile, options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var robj *models.PKIProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing PKIProfile object
func (client *PKIProfileClient) Update(obj *models.PKIProfile, options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var robj *models.PKIProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing PKIProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.PKIProfile
// or it should be json compatible of form map[string]interface{}
func (client *PKIProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.PKIProfile, error) {
	var robj *models.PKIProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing PKIProfile object with a given UUID
func (client *PKIProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing PKIProfile object with a given name
func (client *PKIProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *PKIProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
