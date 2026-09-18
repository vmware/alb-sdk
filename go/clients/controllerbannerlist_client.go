// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ControllerBannerListClient is a client for avi ControllerBannerList resource
type ControllerBannerListClient struct {
	aviSession *session.AviSession
}

// NewControllerBannerListClient creates a new client for ControllerBannerList resource
func NewControllerBannerListClient(aviSession *session.AviSession) *ControllerBannerListClient {
	return &ControllerBannerListClient{aviSession: aviSession}
}

func (client *ControllerBannerListClient) getAPIPath(uuid string) string {
	path := "api/controllerbannerlist"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ControllerBannerList objects
func (client *ControllerBannerListClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ControllerBannerList, error) {
	var plist []*models.ControllerBannerList
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ControllerBannerList by uuid
func (client *ControllerBannerListClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ControllerBannerList, error) {
	var obj *models.ControllerBannerList
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ControllerBannerList by name
func (client *ControllerBannerListClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ControllerBannerList, error) {
	var obj *models.ControllerBannerList
	err := client.aviSession.GetObjectByName("controllerbannerlist", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ControllerBannerList by filters like name, cloud, tenant
// Api creates ControllerBannerList object with every call.
func (client *ControllerBannerListClient) GetObject(options ...session.ApiOptionsParams) (*models.ControllerBannerList, error) {
	var obj *models.ControllerBannerList
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("controllerbannerlist", newOptions...)
	return obj, err
}

// Create a new ControllerBannerList object
func (client *ControllerBannerListClient) Create(obj *models.ControllerBannerList, options ...session.ApiOptionsParams) (*models.ControllerBannerList, error) {
	var robj *models.ControllerBannerList
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ControllerBannerList object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ControllerBannerList
// or it should be json compatible of form map[string]interface{}
func (client *ControllerBannerListClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ControllerBannerList, error) {
	var robj *models.ControllerBannerList
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ControllerBannerList object with a given UUID
func (client *ControllerBannerListClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ControllerBannerListClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
