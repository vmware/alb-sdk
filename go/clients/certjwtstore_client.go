// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// CertJwtStoreClient is a client for avi CertJwtStore resource
type CertJwtStoreClient struct {
	aviSession *session.AviSession
}

// NewCertJwtStoreClient creates a new client for CertJwtStore resource
func NewCertJwtStoreClient(aviSession *session.AviSession) *CertJwtStoreClient {
	return &CertJwtStoreClient{aviSession: aviSession}
}

func (client *CertJwtStoreClient) getAPIPath(uuid string) string {
	path := "api/certjwtstore"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of CertJwtStore objects
func (client *CertJwtStoreClient) GetAll(options ...session.ApiOptionsParams) ([]*models.CertJwtStore, error) {
	var plist []*models.CertJwtStore
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing CertJwtStore by uuid
func (client *CertJwtStoreClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var obj *models.CertJwtStore
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing CertJwtStore by name
func (client *CertJwtStoreClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var obj *models.CertJwtStore
	err := client.aviSession.GetObjectByName("certjwtstore", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing CertJwtStore by filters like name, cloud, tenant
// Api creates CertJwtStore object with every call.
func (client *CertJwtStoreClient) GetObject(options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var obj *models.CertJwtStore
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("certjwtstore", newOptions...)
	return obj, err
}

// Create a new CertJwtStore object
func (client *CertJwtStoreClient) Create(obj *models.CertJwtStore, options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var robj *models.CertJwtStore
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Update an existing CertJwtStore object
func (client *CertJwtStoreClient) Update(obj *models.CertJwtStore, options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var robj *models.CertJwtStore
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing CertJwtStore object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.CertJwtStore
// or it should be json compatible of form map[string]interface{}
func (client *CertJwtStoreClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.CertJwtStore, error) {
	var robj *models.CertJwtStore
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing CertJwtStore object with a given UUID
func (client *CertJwtStoreClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// DeleteByName - Delete an existing CertJwtStore object with a given name
func (client *CertJwtStoreClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *CertJwtStoreClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
