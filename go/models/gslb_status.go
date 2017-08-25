package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// GslbStatus gslb status
// swagger:model GslbStatus
type GslbStatus struct {

	// details of GslbStatus.
	Details []string `json:"details,omitempty"`

	// Placeholder for description of property gslb_runtime of obj type GslbStatus field type str  type object
	GslbRuntime *GslbRuntime `json:"gslb_runtime,omitempty"`

	// Name of the object.
	Name string `json:"name,omitempty"`

	// Unique object identifier of the object.
	UUID string `json:"uuid,omitempty"`
}
