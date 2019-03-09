

/***************************************************************************
 *
 * AVI CONFIDENTIAL
 * __________________
 *
 * [2013] - [2019] Avi Networks Incorporated
 * All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property
 * of Avi Networks Incorporated and its suppliers, if any. The intellectual
 * and technical concepts contained herein are proprietary to Avi Networks
 * Incorporated, and its suppliers and are covered by U.S. and Foreign
 * Patents, patents in process, and are protected by trade secret or
 * copyright law, and other laws. Dissemination of this information or
 * reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Avi Networks Incorporated.
*/

package clients

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

import (
	"github.com/avinetworks/sdk/go/models"
	"github.com/avinetworks/sdk/go/session"
)

// SSLProfileClient is a client for avi SSLProfile resource
type SSLProfileClient struct {
	aviSession *session.AviSession
}

// NewSSLProfileClient creates a new client for SSLProfile resource
func NewSSLProfileClient(aviSession *session.AviSession) *SSLProfileClient {
	return &SSLProfileClient{aviSession: aviSession}
}

func (client *SSLProfileClient) getAPIPath(uuid string) string {
	path := "api/sslprofile"
	if uuid != "" {
		path += "/" + uuid
	}
	return path
}

// GetAll is a collection API to get a list of SSLProfile objects
func (client *SSLProfileClient) GetAll() ([]*models.SSLProfile, error) {
	var plist []*models.SSLProfile
	err := client.aviSession.GetCollection(client.getAPIPath(""), &plist)
	return plist, err
}

// Get an existing SSLProfile by uuid
func (client *SSLProfileClient) Get(uuid string) (*models.SSLProfile, error) {
	var obj *models.SSLProfile
	err := client.aviSession.Get(client.getAPIPath(uuid), &obj)
	return obj, err
}

// GetByName - Get an existing SSLProfile by name
func (client *SSLProfileClient) GetByName(name string) (*models.SSLProfile, error) {
	var obj *models.SSLProfile
	err := client.aviSession.GetObjectByName("sslprofile", name, &obj)
	return obj, err
}

// GetObject - Get an existing SSLProfile by filters like name, cloud, tenant
// Api creates SSLProfile object with every call.
func (client *SSLProfileClient) GetObject(options ...session.ApiOptionsParams) (*models.SSLProfile, error) {
	var obj *models.SSLProfile
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("sslprofile", newOptions...)
	return obj, err
}

// Create a new SSLProfile object
func (client *SSLProfileClient) Create(obj *models.SSLProfile) (*models.SSLProfile, error) {
	var robj *models.SSLProfile
	err := client.aviSession.Post(client.getAPIPath(""), obj, &robj)
	return robj, err
}

// Update an existing SSLProfile object
func (client *SSLProfileClient) Update(obj *models.SSLProfile) (*models.SSLProfile, error) {
	var robj *models.SSLProfile
	path := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj)
	return robj, err
}

// Patch an existing SSLProfile object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.SSLProfile
// or it should be json compatible of form map[string]interface{}
func (client *SSLProfileClient) Patch(uuid string, patch interface{}, patchOp string) (*models.SSLProfile, error) {
	var robj *models.SSLProfile
	path := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj)
	return robj, err
}

// Delete an existing SSLProfile object with a given UUID
func (client *SSLProfileClient) Delete(uuid string) error {
	return client.aviSession.Delete(client.getAPIPath(uuid))
}

// DeleteByName - Delete an existing SSLProfile object with a given name
func (client *SSLProfileClient) DeleteByName(name string) error {
	res, err := client.GetByName(name)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID)
}

// GetAviSession
func (client *SSLProfileClient) GetAviSession() *session.AviSession {
	return client.aviSession
}
