// Copyright 2019 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0

package clients

// This file is auto-generated.

import (
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

// DefaultValuesAugmentationClient is a client for avi DefaultValuesAugmentation resource
type DefaultValuesAugmentationClient struct {
	aviSession *session.AviSession
}

// NewDefaultValuesAugmentationClient creates a new client for DefaultValuesAugmentation resource
func NewDefaultValuesAugmentationClient(aviSession *session.AviSession) *DefaultValuesAugmentationClient {
	return &DefaultValuesAugmentationClient{aviSession: aviSession}
}

func (client *DefaultValuesAugmentationClient) getAPIPath(uuid string) string {
	path := "api/defaultvaluesaugmentation"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of DefaultValuesAugmentation objects
func (client *DefaultValuesAugmentationClient) GetAll(options ...session.ApiOptionsParams) ([]*models.DefaultValuesAugmentation, error) {
	var plist []*models.DefaultValuesAugmentation
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist, options...)
	return plist, err
}

// Get an existing DefaultValuesAugmentation by uuid
func (client *DefaultValuesAugmentationClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.DefaultValuesAugmentation, error) {
	var obj *models.DefaultValuesAugmentation
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj, options...)
	return obj, err
}

// GetByName - Get an existing DefaultValuesAugmentation by name
func (client *DefaultValuesAugmentationClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.DefaultValuesAugmentation, error) {
	var obj *models.DefaultValuesAugmentation
	err := client.aviSession.GetObjectByName("defaultvaluesaugmentation", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing DefaultValuesAugmentation by filters like name, cloud, tenant
// Api creates DefaultValuesAugmentation object with every call.
func (client *DefaultValuesAugmentationClient) GetObject(options ...session.ApiOptionsParams) (*models.DefaultValuesAugmentation, error) {
	var obj *models.DefaultValuesAugmentation
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("defaultvaluesaugmentation", newOptions...)
	return obj, err
}

// Create a new DefaultValuesAugmentation object
func (client *DefaultValuesAugmentationClient) Create(obj *models.DefaultValuesAugmentation, options ...session.ApiOptionsParams) (*models.DefaultValuesAugmentation, error) {
	var robj *models.DefaultValuesAugmentation
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj, options...)
	return robj, err
}

// Patch an existing DefaultValuesAugmentation object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.DefaultValuesAugmentation
// or it should be json compatible of form map[string]interface{}
func (client *DefaultValuesAugmentationClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.DefaultValuesAugmentation, error) {
	var robj *models.DefaultValuesAugmentation
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing DefaultValuesAugmentation object with a given UUID
func (client *DefaultValuesAugmentationClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	if len(options) == 0 {
		return client.aviSession.Delete(client.getAPIPath(uuid))
	} else {
		return client.aviSession.DeleteObject(client.getAPIPath(uuid), options...)
	}
}

// GetAviSession
func (client *DefaultValuesAugmentationClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
