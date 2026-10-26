# Welcome to the AVI ALB REST API script module of over 700 cmdlets!

## Installation
1) Ensure you have PowerShell v7.3+ installed
2) Copy the contents of this folder to a unique module directory

    Eg. `%userprofile%Documents\PowerShell\Modules\AviRest`

## Usage
1) Review the [Examples Readme](Examples/README.MD)
2) Import the module `Import-Module AviRest`
3) Connect to an ALB
4) Review available cmdlets `Get-Command -Module AviRest`

## Why use this module?
This module is targetted at traditional PowerShell users.  If you are comfortable referencing the API guide for each command, the [AviPowerShellSDK](https://github.com/avinetworks/devops/tree/master/powershell) is available.

### Benefits of this module
 - This module provides a cmdlet for each API method and endpoint offering easy discovery using `Get-Command -Module AviRest` or TAB completion
 - Support for `Get-Help` demonstrating available parameter snippets
 - Support for dynamically building API JSON body without referencing the API guide and crafting a 100 property object using `New-AviRest*Object` where `*` is any endpoint. Use `Get-Command -Module AviRest -Name 'New-AVIRest*Object'` to find all cmdlets
 - Pipeline support with type enforcement. Aka `New-AviRestvsvip | Remove-AviRestvsvip` will work but `New-AviRestvsvip | Remove-AviRestvsGS` will not.
 - API Revision cmdlet enforcement based on connected ALB. Unsupported cmdlets will throw and error based on API revision.
 - HTTP query support on `Get-AviRest*` cmdlets including `-Name`,`-First`,`-Fields`,

