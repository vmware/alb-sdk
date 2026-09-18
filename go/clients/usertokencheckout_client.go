// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// UserTokenCheckoutClient is a client for avi UserTokenCheckout resource
type UserTokenCheckoutClient struct {
	aviSession *session.AviSession
}

// NewUserTokenCheckoutClient creates a new client for UserTokenCheckout resource
func NewUserTokenCheckoutClient(aviSession *session.AviSession) *UserTokenCheckoutClient {
	return &UserTokenCheckoutClient{aviSession: aviSession}
}

func (client *UserTokenCheckoutClient) getAPIPath(uuid string) string {
	path := "api/usertokencheckout"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of UserTokenCheckout objects
func (client *UserTokenCheckoutClient) GetAll(options ...session.ApiOptionsParams) ([]*models.UserTokenCheckout, error) {
	var plist []*models.UserTokenCheckout
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing UserTokenCheckout by uuid
func (client *UserTokenCheckoutClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.UserTokenCheckout, error) {
	var obj *models.UserTokenCheckout
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing UserTokenCheckout by name
func (client *UserTokenCheckoutClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.UserTokenCheckout, error) {
	var obj *models.UserTokenCheckout
	err := client.aviSession.GetObjectByName("usertokencheckout", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing UserTokenCheckout by filters like name, cloud, tenant
// Api creates UserTokenCheckout object with every call.
func (client *UserTokenCheckoutClient) GetObject(options ...session.ApiOptionsParams) (*models.UserTokenCheckout, error) {
	var obj *models.UserTokenCheckout
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("usertokencheckout", newOptions...)
	return obj, err
}

// Create a new UserTokenCheckout object
func (client *UserTokenCheckoutClient) Create(obj *models.UserTokenCheckout, options ...session.ApiOptionsParams) (*models.UserTokenCheckout, error) {
	var robj *models.UserTokenCheckout
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing UserTokenCheckout object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.UserTokenCheckout
// or it should be json compatible of form map[string]interface{}
func (client *UserTokenCheckoutClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.UserTokenCheckout, error) {
	var robj *models.UserTokenCheckout
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing UserTokenCheckout object with a given UUID
func (client *UserTokenCheckoutClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *UserTokenCheckoutClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
