// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// ReportClient is a client for avi Report resource
type ReportClient struct {
	aviSession *session.AviSession
}

// NewReportClient creates a new client for Report resource
func NewReportClient(aviSession *session.AviSession) *ReportClient {
	return &ReportClient{aviSession: aviSession}
}

func (client *ReportClient) getAPIPath(uuid string) string {
	path := "api/report"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of Report objects
func (client *ReportClient) GetAll(options ...session.ApiOptionsParams) ([]*models.Report, error) {
	var plist []*models.Report
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing Report by uuid
func (client *ReportClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.Report, error) {
	var obj *models.Report
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing Report by name
func (client *ReportClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.Report, error) {
	var obj *models.Report
	err := client.aviSession.GetObjectByName("report", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing Report by filters like name, cloud, tenant
// Api creates Report object with every call.
func (client *ReportClient) GetObject(options ...session.ApiOptionsParams) (*models.Report, error) {
	var obj *models.Report
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("report", newOptions...)
	return obj, err
}

// Create a new Report object
func (client *ReportClient) Create(obj *models.Report, options ...session.ApiOptionsParams) (*models.Report, error) {
	var robj *models.Report
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing Report object
func (client *ReportClient) Update(obj *models.Report, options ...session.ApiOptionsParams) (*models.Report, error) {
	var robj *models.Report
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing Report object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.Report
// or it should be json compatible of form map[string]interface{}
func (client *ReportClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.Report, error) {
	var robj *models.Report
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing Report object with a given UUID
func (client *ReportClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing Report object with a given name
func (client *ReportClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *ReportClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
