// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ReportProfileClient is a client for avi ReportProfile resource
type ReportProfileClient struct {
	aviSession *session.AviSession
}

// NewReportProfileClient creates a new client for ReportProfile resource
func NewReportProfileClient(aviSession *session.AviSession) *ReportProfileClient {
	return &ReportProfileClient{aviSession: aviSession}
}

func (client *ReportProfileClient) getAPIPath(uuid string) string {
	path := "api/reportprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of ReportProfile objects
func (client *ReportProfileClient) GetAll(options ...session.ApiOptionsParams) ([]*models.ReportProfile, error) {
	var plist []*models.ReportProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing ReportProfile by uuid
func (client *ReportProfileClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var obj *models.ReportProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing ReportProfile by name
func (client *ReportProfileClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var obj *models.ReportProfile
	err := client.aviSession.GetObjectByName("reportprofile", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing ReportProfile by filters like name, cloud, tenant
// Api creates ReportProfile object with every call.
func (client *ReportProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var obj *models.ReportProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("reportprofile", newOptions...)
	return obj, err
}

// Create a new ReportProfile object
func (client *ReportProfileClient) Create(obj *models.ReportProfile, options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var robj *models.ReportProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing ReportProfile object
func (client *ReportProfileClient) Update(obj *models.ReportProfile, options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var robj *models.ReportProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing ReportProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.ReportProfile
// or it should be json compatible of form map[string]interface{}
func (client *ReportProfileClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.ReportProfile, error) {
	var robj *models.ReportProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing ReportProfile object with a given UUID
func (client *ReportProfileClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing ReportProfile object with a given name
func (client *ReportProfileClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ReportProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
