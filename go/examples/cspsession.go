package main

import (
	//"flag"
	"fmt"

	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

func main() {
	// Create a session and a generic client to Avi Controller using csp api token

	aviClient, err := clients.NewAviClient("10.79.169.56", "admin", session.SetCSPHost("console-stg.cloud.vmware.com"),
		session.SetInsecure, session.SetCSPToken("QOyamgKuBIt3iOf-OvCkw2DmmByRKtYSk7buSZOXOOQ_fKTB"))
	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		return
	}

	var obj interface{}
	err = aviClient.AviSession.GetObjectByName("cloud", "Default-Cloud", &obj)
	fmt.Printf("Cloud obj: %v\n", obj)

	tenantobj := models.Tenant{}
	name := "avinetworks"
	tenantobj.Name = &name
	tobj, err := aviClient.Tenant.Create(&tenantobj)
	if err != nil {
		fmt.Println("\n Tenant creation failed: ", err)
	}
	fmt.Println("\n Tenant created successfully.  ", tobj)
}
