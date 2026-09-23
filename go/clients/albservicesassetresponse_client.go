// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ALBServicesAssetResponseClient is a client for avi ALBServicesAssetResponse resource
type ALBServicesAssetResponseClient struct {
	aviSession *session.AviSession
}

// NewALBServicesAssetResponseClient creates a new client for ALBServicesAssetResponse resource
func NewALBServicesAssetResponseClient(aviSession *session.AviSession) *ALBServicesAssetResponseClient {
	return &ALBServicesAssetResponseClient{aviSession: aviSession}
}

func (client *ALBServicesAssetResponseClient) getAPIPath(uuid string) string {
	path := "api/albservicesassetresponse"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ALBServicesAssetResponse objects
func (client *ALBServicesAssetResponseClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ALBServicesAssetResponse, error) {
	var plist []*models.ALBServicesAssetResponse
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ALBServicesAssetResponse by uuid
func (client *ALBServicesAssetResponseClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ALBServicesAssetResponse, error) {
	var obj *models.ALBServicesAssetResponse
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ALBServicesAssetResponse by name
func (client *ALBServicesAssetResponseClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ALBServicesAssetResponse, error) {
	var obj *models.ALBServicesAssetResponse
	err := client.aviSession.GetObjectByName("albservicesassetresponse", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ALBServicesAssetResponse by filters like name, cloud, tenant
// Api creates ALBServicesAssetResponse object with every call.
func (client *ALBServicesAssetResponseClient) GetObject(options ...session.ApiOptionsParams) (*models.ALBServicesAssetResponse, error) {
	var obj *models.ALBServicesAssetResponse
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("albservicesassetresponse", newOptions...)
	return obj, err
}

// Create a new ALBServicesAssetResponse object
func (client *ALBServicesAssetResponseClient) Create(obj *models.ALBServicesAssetResponse, options ...session.ApiOptionsParams) (*models.ALBServicesAssetResponse, error) {
	var robj *models.ALBServicesAssetResponse
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ALBServicesAssetResponse object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ALBServicesAssetResponse
// or it should be json compatible of form map[string]interface{}
func (client *ALBServicesAssetResponseClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ALBServicesAssetResponse, error) {
	var robj *models.ALBServicesAssetResponse
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ALBServicesAssetResponse object with a given UUID
func (client *ALBServicesAssetResponseClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ALBServicesAssetResponseClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
