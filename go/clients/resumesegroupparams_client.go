// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ResumeSeGroupParamsClient is a client for avi ResumeSeGroupParams resource
type ResumeSeGroupParamsClient struct {
	aviSession *session.AviSession
}

// NewResumeSeGroupParamsClient creates a new client for ResumeSeGroupParams resource
func NewResumeSeGroupParamsClient(aviSession *session.AviSession) *ResumeSeGroupParamsClient {
	return &ResumeSeGroupParamsClient{aviSession: aviSession}
}

func (client *ResumeSeGroupParamsClient) getAPIPath(uuid string) string {
	path := "api/resumesegroupparams"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ResumeSeGroupParams objects
func (client *ResumeSeGroupParamsClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ResumeSeGroupParams, error) {
	var plist []*models.ResumeSeGroupParams
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ResumeSeGroupParams by uuid
func (client *ResumeSeGroupParamsClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ResumeSeGroupParams, error) {
	var obj *models.ResumeSeGroupParams
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ResumeSeGroupParams by name
func (client *ResumeSeGroupParamsClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ResumeSeGroupParams, error) {
	var obj *models.ResumeSeGroupParams
	err := client.aviSession.GetObjectByName("resumesegroupparams", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ResumeSeGroupParams by filters like name, cloud, tenant
// Api creates ResumeSeGroupParams object with every call.
func (client *ResumeSeGroupParamsClient) GetObject(options ...session.ApiOptionsParams) (*models.ResumeSeGroupParams, error) {
	var obj *models.ResumeSeGroupParams
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("resumesegroupparams", newOptions...)
	return obj, err
}

// Create a new ResumeSeGroupParams object
func (client *ResumeSeGroupParamsClient) Create(obj *models.ResumeSeGroupParams, options ...session.ApiOptionsParams) (*models.ResumeSeGroupParams, error) {
	var robj *models.ResumeSeGroupParams
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing ResumeSeGroupParams object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ResumeSeGroupParams
// or it should be json compatible of form map[string]interface{}
func (client *ResumeSeGroupParamsClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ResumeSeGroupParams, error) {
	var robj *models.ResumeSeGroupParams
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ResumeSeGroupParams object with a given UUID
func (client *ResumeSeGroupParamsClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *ResumeSeGroupParamsClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
