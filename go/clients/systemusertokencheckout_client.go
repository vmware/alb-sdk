// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SystemUserTokenCheckoutClient is a client for avi SystemUserTokenCheckout resource
type SystemUserTokenCheckoutClient struct {
	aviSession *session.AviSession
}

// NewSystemUserTokenCheckoutClient creates a new client for SystemUserTokenCheckout resource
func NewSystemUserTokenCheckoutClient(aviSession *session.AviSession) *SystemUserTokenCheckoutClient {
	return &SystemUserTokenCheckoutClient{aviSession: aviSession}
}

func (client *SystemUserTokenCheckoutClient) getAPIPath(uuid string) string {
	path := "api/systemusertokencheckout"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SystemUserTokenCheckout objects
func (client *SystemUserTokenCheckoutClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SystemUserTokenCheckout, error) {
	var plist []*models.SystemUserTokenCheckout
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SystemUserTokenCheckout by uuid
func (client *SystemUserTokenCheckoutClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SystemUserTokenCheckout, error) {
	var obj *models.SystemUserTokenCheckout
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SystemUserTokenCheckout by name
func (client *SystemUserTokenCheckoutClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SystemUserTokenCheckout, error) {
	var obj *models.SystemUserTokenCheckout
	err := client.aviSession.GetObjectByName("systemusertokencheckout", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SystemUserTokenCheckout by filters like name, cloud, tenant
// Api creates SystemUserTokenCheckout object with every call.
func (client *SystemUserTokenCheckoutClient) GetObject(options ...session.ApiOptionsParams) (*models.SystemUserTokenCheckout, error) {
	var obj *models.SystemUserTokenCheckout
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("systemusertokencheckout", newOptions...)
	return obj, err
}

// Create a new SystemUserTokenCheckout object
func (client *SystemUserTokenCheckoutClient) Create(obj *models.SystemUserTokenCheckout, options ...session.ApiOptionsParams) (*models.SystemUserTokenCheckout, error) {
	var robj *models.SystemUserTokenCheckout
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SystemUserTokenCheckout object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SystemUserTokenCheckout
// or it should be json compatible of form map[string]interface{}
func (client *SystemUserTokenCheckoutClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SystemUserTokenCheckout, error) {
	var robj *models.SystemUserTokenCheckout
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SystemUserTokenCheckout object with a given UUID
func (client *SystemUserTokenCheckoutClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SystemUserTokenCheckoutClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
