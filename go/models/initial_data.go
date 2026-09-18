// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InitialData initial data
// swagger:model InitialData
type InitialData struct {

	// Custom login banner text, present only if /var/lib/avi/etc/avi-custom-banner exists. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Banner *string `json:"banner,omitempty"`

	// Current UTC time, ISO 8601. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CurrentTime *string `json:"current_time"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EmailConfigurationIsSet *bool `json:"email_configuration_is_set"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorMessage *string `json:"error_message,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsAwsCloud *bool `json:"is_aws_cloud"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SetupFailed *bool `json:"setup_failed"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Sso *bool `json:"sso"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SsoLoggedIn *bool `json:"sso_logged_in"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UserDefinedDefaultPassword *bool `json:"user_defined_default_password"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UserInitialSetup *bool `json:"user_initial_setup"`

	// Only present when the caller has an authenticated session. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *ClusterVersionInfo `json:"version,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	WelcomeWorkflowComplete *bool `json:"welcome_workflow_complete"`
}
