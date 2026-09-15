# Examples

## Connect to an ALB
Connect via a credential
`Connect-AVIRest -Server $server -Credential $credential`

Connect via a username and password
`Connect-AVIRest -Server $server -Username $username -Password $password`

## Get object(s)
Get all objects `Get-AVIRestVsvip`

Get by Name `Get-AVIRestVsvip -Name myVIP`

Get by Uuid `Get-AVIRestVsvip -Uuid $uuid`

Return reduced quantity `Get-AVIRestVsvip -First 1`

Return reduced properties `Get-AVIRestVirtualservice -Fields name,enabled`

## Clone an object
Clone an object configuration by removing default unique fields (uuid,url,etc)

```
$myIpGroup = Get-AVIRestIpaddrgroup -Name my-ipgroup
$clonedObj = Copy-AVIRestObject $myIpGroup
```

Clone an object configuration by removing custom fields (autocomplete Excludes suggestions via TAB)

```
$sslCert = Get-AVIRestSSLKeyAndCertificate -Name 'myCert'
Copy-AVIRestObject -InputOjbect $sslCert -Excludes ocsp_error_status
```

## Create the cloned object
Create an object (from cloned data) `New-AVIRestIpaddrgroup -Ipaddrgroup $clonedObj`

## Create a new (clean slate) object
Create an empty API JSON body with any 'New-AVIRest*Object' cmdlet.

 - Complete Object (all possible [typed] properties) Eg. `New-AviRestvsvipObject`

- Minimum top-level properties Eg. `New-AviRestvsvipObject -MinRequired`

## Edit an object
Edit an object
```
$clonedGroup = Get-AVIRestIpaddrgroup -Name theClonedGroup
$clonedGroup.Name = 'New Name'
Set-AVIRestIpaddrgroup -Ipaddrgroup $clonedGroup
```

## Remove an object
Remove an object
```
$clonedGroup = Get-AVIRestIpaddrgroup -Name theClonedGroup
Remove-AVIRestIpaddrgroup -Ipaddrgroup $clonedGroup
```

## API Revision Errors
API revision drives available cmdlets
```
Get-AVIRestserviceenginepolicy
Get-AVIRestServiceenginepolicy: Requires AVI API revision [18.2.4]
```

