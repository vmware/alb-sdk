// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyFileObjectDetail Api policy file object detail
// swagger:model ApiPolicyFileObjectDetail
type APIPolicyFileObjectDetail struct {

	// The uploaded OpenAPI specification file associated with this API policy. It is a reference to an object of type FileObject. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FileObjectRef *string `json:"file_object_ref,omitempty"`

	// Processing status of the uploaded file. If processing failed, the API policy keeps enforcing the last version that processed successfully. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *FileObjectState `json:"state,omitempty"`
}
