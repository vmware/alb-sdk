// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// GslbFileServiceUploadAckClient is a client for avi GslbFileServiceUploadAck resource
type GslbFileServiceUploadAckClient struct {
	aviSession *session.AviSession
}

// NewGslbFileServiceUploadAckClient creates a new client for GslbFileServiceUploadAck resource
func NewGslbFileServiceUploadAckClient(aviSession *session.AviSession) *GslbFileServiceUploadAckClient {
	return &GslbFileServiceUploadAckClient{aviSession: aviSession}
}

func (client *GslbFileServiceUploadAckClient) getAPIPath(uuid string) string {
	path := "api/gslbfileserviceuploadack"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of GslbFileServiceUploadAck objects
func (client *GslbFileServiceUploadAckClient) GetAll(options ...session.ApiOptionsParams) ([]*models.GslbFileServiceUploadAck, error) {
	var plist []*models.GslbFileServiceUploadAck
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing GslbFileServiceUploadAck by uuid
func (client *GslbFileServiceUploadAckClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.GslbFileServiceUploadAck, error) {
	var obj *models.GslbFileServiceUploadAck
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing GslbFileServiceUploadAck by name
func (client *GslbFileServiceUploadAckClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.GslbFileServiceUploadAck, error) {
	var obj *models.GslbFileServiceUploadAck
	err := client.aviSession.GetObjectByName("gslbfileserviceuploadack", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing GslbFileServiceUploadAck by filters like name, cloud, tenant
// Api creates GslbFileServiceUploadAck object with every call.
func (client *GslbFileServiceUploadAckClient) GetObject(options ...session.ApiOptionsParams) (*models.GslbFileServiceUploadAck, error) {
	var obj *models.GslbFileServiceUploadAck
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("gslbfileserviceuploadack", newOptions...)
	return obj, err
}

// Create a new GslbFileServiceUploadAck object
func (client *GslbFileServiceUploadAckClient) Create(obj *models.GslbFileServiceUploadAck, options ...session.ApiOptionsParams) (*models.GslbFileServiceUploadAck, error) {
	var robj *models.GslbFileServiceUploadAck
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing GslbFileServiceUploadAck object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.GslbFileServiceUploadAck
// or it should be json compatible of form map[string]interface{}
func (client *GslbFileServiceUploadAckClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.GslbFileServiceUploadAck, error) {
	var robj *models.GslbFileServiceUploadAck
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing GslbFileServiceUploadAck object with a given UUID
func (client *GslbFileServiceUploadAckClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *GslbFileServiceUploadAckClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
