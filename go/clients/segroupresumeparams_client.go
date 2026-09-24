// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// SeGroupResumeParamsClient is a client for avi SeGroupResumeParams resource
type SeGroupResumeParamsClient struct {
	aviSession *session.AviSession
}

// NewSeGroupResumeParamsClient creates a new client for SeGroupResumeParams resource
func NewSeGroupResumeParamsClient(aviSession *session.AviSession) *SeGroupResumeParamsClient {
	return &SeGroupResumeParamsClient{aviSession: aviSession}
}

func (client *SeGroupResumeParamsClient) getAPIPath(uuid string) string {
	path := "api/segroupresumeparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SeGroupResumeParams objects
func (client *SeGroupResumeParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.SeGroupResumeParams, error) {
	var plist []*models.SeGroupResumeParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing SeGroupResumeParams by uuid
func (client *SeGroupResumeParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.SeGroupResumeParams, error) {
	var obj *models.SeGroupResumeParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing SeGroupResumeParams by name
func (client *SeGroupResumeParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.SeGroupResumeParams, error) {
	var obj *models.SeGroupResumeParams
	err := client.aviSession.GetObjectByName("segroupresumeparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing SeGroupResumeParams by filters like name, cloud, tenant
// Api creates SeGroupResumeParams object with every call.
func (client *SeGroupResumeParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.SeGroupResumeParams, error) {
	var obj *models.SeGroupResumeParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("segroupresumeparams", newOptions...)
	return obj, err
}

// Create a new SeGroupResumeParams object
func (client *SeGroupResumeParamsClient) Create(obj *models.SeGroupResumeParams, options ...session.ApiOptionsParams) (*models.SeGroupResumeParams, error) {
	var robj *models.SeGroupResumeParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing SeGroupResumeParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SeGroupResumeParams
// or it should be json compatible of form map[string]interface{}
func (client *SeGroupResumeParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.SeGroupResumeParams, error) {
	var robj *models.SeGroupResumeParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing SeGroupResumeParams object with a given UUID
func (client *SeGroupResumeParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *SeGroupResumeParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
