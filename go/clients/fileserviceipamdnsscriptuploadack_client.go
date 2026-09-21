// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// FileServiceIPAMDNSScriptUploadAckClient is a client for avi FileServiceIPAMDNSScriptUploadAck resource
type FileServiceIPAMDNSScriptUploadAckClient struct {
	aviSession *session.AviSession
}

// NewFileServiceIPAMDNSScriptUploadAckClient creates a new client for FileServiceIPAMDNSScriptUploadAck resource
func NewFileServiceIPAMDNSScriptUploadAckClient(aviSession *session.AviSession) *FileServiceIPAMDNSScriptUploadAckClient {
	return &FileServiceIPAMDNSScriptUploadAckClient{aviSession: aviSession}
}

func (client *FileServiceIPAMDNSScriptUploadAckClient) getAPIPath(uuid string) string {
	path := "api/fileserviceipamdnsscriptuploadack"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of FileServiceIPAMDNSScriptUploadAck objects
func (client *FileServiceIPAMDNSScriptUploadAckClient) GetAll(options ...session.ApiOptionsParams) ([]*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var plist []*models.FileServiceIPAMDNSScriptUploadAck
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing FileServiceIPAMDNSScriptUploadAck by uuid
func (client *FileServiceIPAMDNSScriptUploadAckClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var obj *models.FileServiceIPAMDNSScriptUploadAck
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing FileServiceIPAMDNSScriptUploadAck by name
func (client *FileServiceIPAMDNSScriptUploadAckClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var obj *models.FileServiceIPAMDNSScriptUploadAck
	err := client.aviSession.GetObjectByName("fileserviceipamdnsscriptuploadack", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing FileServiceIPAMDNSScriptUploadAck by filters like name, cloud, tenant
// Api creates FileServiceIPAMDNSScriptUploadAck object with every call.
func (client *FileServiceIPAMDNSScriptUploadAckClient) GetObject(options ...session.ApiOptionsParams) (*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var obj *models.FileServiceIPAMDNSScriptUploadAck
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("fileserviceipamdnsscriptuploadack", newOptions...)
	return obj, err
}

// Create a new FileServiceIPAMDNSScriptUploadAck object
func (client *FileServiceIPAMDNSScriptUploadAckClient) Create(obj *models.FileServiceIPAMDNSScriptUploadAck, options ...session.ApiOptionsParams) (*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var robj *models.FileServiceIPAMDNSScriptUploadAck
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing FileServiceIPAMDNSScriptUploadAck object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.FileServiceIPAMDNSScriptUploadAck
// or it should be json compatible of form map[string]interface{}
func (client *FileServiceIPAMDNSScriptUploadAckClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.FileServiceIPAMDNSScriptUploadAck, error) {
	var robj *models.FileServiceIPAMDNSScriptUploadAck
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing FileServiceIPAMDNSScriptUploadAck object with a given UUID
func (client *FileServiceIPAMDNSScriptUploadAckClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *FileServiceIPAMDNSScriptUploadAckClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
