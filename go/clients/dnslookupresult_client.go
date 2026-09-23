// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// DNSLookupResultClient is a client for avi DNSLookupResult resource
type DNSLookupResultClient struct {
	aviSession *session.AviSession
}

// NewDNSLookupResultClient creates a new client for DNSLookupResult resource
func NewDNSLookupResultClient(aviSession *session.AviSession) *DNSLookupResultClient {
	return &DNSLookupResultClient{aviSession: aviSession}
}

func (client *DNSLookupResultClient) getAPIPath(uuid string) string {
	path := "api/dnslookupresult"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of DNSLookupResult objects
func (client *DNSLookupResultClient) GetAll(options ...session.ApiOptionsParams) ([]*models.DNSLookupResult, error) {
	var plist []*models.DNSLookupResult
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing DNSLookupResult by uuid
func (client *DNSLookupResultClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.DNSLookupResult, error) {
	var obj *models.DNSLookupResult
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing DNSLookupResult by name
func (client *DNSLookupResultClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.DNSLookupResult, error) {
	var obj *models.DNSLookupResult
	err := client.aviSession.GetObjectByName("dnslookupresult", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing DNSLookupResult by filters like name, cloud, tenant
// Api creates DNSLookupResult object with every call.
func (client *DNSLookupResultClient) GetObject(options ...session.ApiOptionsParams) (*models.DNSLookupResult, error) {
	var obj *models.DNSLookupResult
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("dnslookupresult", newOptions...)
	return obj, err
}

// Create a new DNSLookupResult object
func (client *DNSLookupResultClient) Create(obj *models.DNSLookupResult, options ...session.ApiOptionsParams) (*models.DNSLookupResult, error) {
	var robj *models.DNSLookupResult
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing DNSLookupResult object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.DNSLookupResult
// or it should be json compatible of form map[string]interface{}
func (client *DNSLookupResultClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.DNSLookupResult, error) {
	var robj *models.DNSLookupResult
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing DNSLookupResult object with a given UUID
func (client *DNSLookupResultClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *DNSLookupResultClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
