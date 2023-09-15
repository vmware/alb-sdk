using namespace System.Collections
using namespace System.Collections.Generic
using namespace System.Management.Automation
using namespace System.Management.Automation.Language

Class DynamicParameterConfig {
    [string]$Name
    [type]$Type
    [bool]$Mandatory

    DynamicParameterConfig ($Name, $Type, $Mandatory) {
        $this.Name = $Name
        $this.Type = $Type
        $this.Mandatory = $Mandatory
    }
}
# Private
Function Invoke-AVIRestParameters {
    Param(
        [Parameter(Mandatory = $false)]
        $ContentType = 'application/json',
        [Parameter(Mandatory = $false)]
        $TimeOutSec = 180,
        [Parameter(Mandatory = $false)]
        $NoProxy = $true,
        [Parameter(Mandatory = $false)]
        $StatusCodeVariable = 'statusCode',
        [Parameter(Mandatory = $false)]
        $SkipHttpErrorCheck = $true,
        [Parameter(Mandatory = $false)]
        $SkipHeaderValidation = $true,
        [Parameter(Mandatory = $false)]
        $SkipCertificateCheck = $true,
        [Parameter(Mandatory = $false)]
        $HttpVersion = '2.0'
    )
    @{
        ContentType = $ContentType
        TimeoutSec = $TimeoutSec
        NoProxy = $NoProxy
        StatusCodeVariable = $StatusCodeVariable
        SkipHttpErrorCheck = $SkipHttpErrorCheck
        SkipHeaderValidation = $SkipHeaderValidation
        SkipCertificateCheck = $SkipCertificateCheck
        HttpVersion = $HttpVersion
        ResponseHeadersVariable = 'responseHeader'
    }
}
Function Get-AVIRestToken {
    [CmdletBinding()]
    Param (
        [Parameter(
            Mandatory=$true,
            Position=0)]
        [ValidateNotNullOrEmpty()]
        [string]$Server,
        [Parameter(Mandatory=$true)]
        [ValidateNotNullOrEmpty()]
        [hashtable]$Body,
        [Parameter(Mandatory=$false)]
        [string]$APIRev
    )
    Process {
        $endpoint = '/login'
        $uriRequest = [System.UriBuilder]::new("https",$Server,443,$endpoint)
        $loginJSON = $Body | ConvertTo-Json -Compress
        $loginSplat = @{
            Method = 'POST'
            URI = $uriRequest.URI
            Body = $loginJSON
            SessionVariable = 'session'
        }
        switch ($AVIStdParams.Keys) {  # need for reconnect
            'URI' {$AVIStdParams.Remove('URI')}
            'Body' {$AVIStdParams.Remove('Body')}
        }
        Write-Verbose "$($uriRequest.URI)"
        $global:AVIReply = $null
        $global:AVIReply = Invoke-RestMethod @loginSplat @AVIStdParams
        if ($statusCode -eq 200) {
            $global:AVIServer = $Server
            $global:AVIRev = $APIRev
            $setCookieList = $responseHeader.'Set-Cookie'
            $cookie = $setCookieList[0]
            foreach ($cookie in $setCookieList){
                $splitCookie = $cookie -split '=|; ',5
                $key = ${splitCookie}?[0]
                switch ($key) {
                    'csrftoken' {
                        $session.Headers.'X-CSRFToken' = ${splitCookie}?[1]
                    }
                    default {
                        $session.Headers.$key = ${splitCookie}?[1]
                    }
                }
                $expkey = '{0}-{1}' -f $key,${splitCookie}?[2]
                $session.Headers.$expkey = ${splitCookie}?[3]
            }
            $session.Headers.'x-avi-version' = $global:AVIReply.version.Version
            $session.Headers.Referer = 'https://' + $global:AVIServer
            $AVISessionParam.WebSession = $session
        }
        else {
            Write-Warning "HTTP status [$statuscode]"
        }
        Write-Verbose "$AVIServer"
        $global:AVIReply
    }
}
Function Invoke-AVIRest {
    [CmdletBinding()]
    Param (
        [Parameter(Mandatory=$true)]
        [ValidateSet('GET','PUT','PATCH','POST','DELETE')]
        $Method,
        [Parameter(Mandatory=$true)]
        [ValidateNotNullOrEmpty()]
        [string]$EndPoint,
        [Parameter(Mandatory=$false)]
        [ValidateNotNullOrEmpty()]
        [ValidateScript({Test-JSON $_})]
        [string]$Body,
        [Parameter(Mandatory=$false)]
        [ValidateNotNullOrEmpty()]
        [hashtable]$Query,
        [Parameter(Mandatory=$false)]
        [ValidateNotNullOrEmpty()]
        [string]$APIRev,
        [Parameter(Mandatory=$false)]
        [ValidateNotNullOrEmpty()]
        [string]$OutputType
    )
    $ErrorActionPreference = 'Stop'
    Try {
        # Check connection
        if ($null -eq $AVISessionParam.WebSession -or $null -eq $AVIServer) {
            Return 'Not connected to AVI API'
        }
        $global:AVIStdParams = Invoke-AVIRestParameters

        # Check expiration
        if ((Get-Date).AddMinutes(+5) -ge [datetime]$AVISessionParam.WebSession.Headers.'sessionid-expires') {
            $AVISessionParam.WebSession = Update-AVIRestToken
        }

        $allResults = [List[PSObject]]::New()
        if ($Method -eq 'GET') {
            $queryParam = $query ? $query.clone() : @{}
            if ($null -ne $query.page_size -and $query.page_size -le 200) {
                $queryParam.page_size = $query.page_size}
            else {
                $queryParam.page_size = 200
                $queryParam.page = 1
                $useTotal = $true
            }
        }
        :pagination do {
            $uriRequest = [System.UriBuilder]::new("https",$AVIServer,443,$endpoint)
            if ($Method -eq 'GET' -and $null -eq $global:AVIReply.next) {
                $queryString = [System.Web.HttpUtility]::ParseQueryString([String]::Empty)
                foreach ($key in $queryParam.Keys) {$queryString.Add($key, $queryParam.$key)}
                $uriRequest.Query = $queryString.ToString()
            }
            $AVIStdParams.URI = if ($null -ne $global:AVIReply.next) {$global:AVIReply.next}
            else {$uriRequest.Uri}
            Write-Verbose "Calling [$method] on URI: $($AVIStdParams.URI.OriginalString)"
            If ($null -ne $body) {$AVIStdParams.Body = $body}
            else {
                if ($AVIStdParams.ContainsKey('Body')) {$AVIStdParams.Remove('Body')}
            }

            $global:AVIReply,$statusCode = $null
            $global:AVIReply = Invoke-RestMethod -Method $Method @AVIStdParams @AVISessionParam
            $global:AVIResponseHeader = $responseHeader
            switch -Regex ($statusCode) {
                '20[0-2]' {
                    if ($global:AVIReply.GetType().Name -eq 'String' -and [string]::IsNullOrEmpty($global:AVIReply)) {
                        break pagination
                    }
                    if ($null -ne $global:AVIReply.results) {
                        $global:AVIReply.results | Foreach {$allResults.Add($_)}
                    }
                    else {
                        $global:AVIReply | Foreach {$allResults.Add($_)}
                    }
                    if ($null -eq $global:AVIReply.next -or $global:AVIReply.count -eq 0) {break pagination} # some don't have any
                    # Pagination
                    # $queryParam.skip = $queryParam.skip + $queryParam.limit
                    $paginationComplete = $useTotal ? $global:AVIReply.count : $allResults.count
                    # continue pagination
                }
                204 {
                    $global:AVIReply
                    break pagination
                }
                Default {
                    [PSCustomObject]@{
                        HTTP_Response = [System.Net.HttpStatusCode]$statusCode
                        API_ErrorMesg = $global:AVIReply
                        HTTP_StatusCode = $statusCode
                    }
                    break pagination
                }
            }
        }
        until ($allResults.count -eq $paginationComplete)
        if ($null -ne $PSBoundParameters.OutputType) {
            $allResults | Foreach {$_.PSObject.TypeNames.Insert(0,$PSBoundParameters.OutputType)}
        }
        $allResults | Foreach {$_}
    }
    Catch {
        $PSCmdlet.ThrowTerminatingError($PSItem)
    }
}
Function Add-AVIRestParams ($splat, $Parameters, $ParameterSetName) {
    switch -Wildcard ($ParameterSetName) {
        # RESERVERED Parameterset Names - Should be filter by default to support paging (if needed)
        'Body' {
            $splat.Body = @{}
            switch -Regex ($Parameters.Keys) {
                'Ids' {$splat.Body.Add('ids',@($Parameters.Ids))}
                'Name' {$splat.Body.Add('names',@($Parameters.Name))}
                'Type' {$splat.Body.Add('types',@($Parameters.Type))}
            }
            $splat.Body =  $splat.Body | ConvertTo-JSON -Compress -Depth 3
            Return
        }
        'Uuid' {
            $queryParams = 'JoinResource|Fields|First|Skip|Created'
            if ($Parameters.Keys -match $queryParams) {
                $splat.Query  = @{}
                switch -Regex ($Parameters.Keys) {
                    'JoinResource' {$splat.Query.Add('join_subresources',$Parameters.JoinResource)}
                    'Fields' {$splat.Query.Add('fields',$Parameters.Fields)}
                    'First' {
                        $splat.Query.Add('page',1)
                        $splat.Query.Add('page_size',$Parameters.First)
                    }
                    'Skip' {$splat.Query.Add('skip',$Parameters.Skip)}
                }
            }
            break
        } 
        'Query' {
            $splat.Query  = $Parameters.Query
            break
        }
        'Filter*' {
            $queryParams = 'Uuid|Name|Fields|First|Skip|Created'
            if ($Parameters.Keys -match $queryParams) {
                $splat.Query  = @{}
                switch -Regex ($Parameters.Keys) {
                    # 'Uuid' {$splat.Query.Add('idFilter',$Parameters.Id)}
                    'Name' {$splat.Query.Add('name',$Parameters.Name)}
                    'Fields' {$splat.Query.Add('fields',$Parameters.Type)}
                    'First' {
                        $splat.Query.Add('page',1)
                        $splat.Query.Add('page_size',$Parameters.First)
                    }
                    'Skip' {$splat.Query.Add('skip',$Parameters.Skip)}
                    # 'CreatedAfter' {$splat.Query.Add('createdAfterFilter',$Parameters.CreatedAfter.ToString('r'))} # http datetime format
                    # 'CreatedBefore' {$splat.Query.Add('createdBeforeFilter',$Parameters.CreatedBefore.ToString('r'))} # http datetime format
                }
            }
            break
        }
    }
}
Function New-RuntimeDefinedParameter {
    Param (
        [Parameter(Mandatory=$true)]
        [string[]]$ParameterSetName,
        [Parameter(Mandatory=$true,
            HelpMessage = 'Provide a hashtable where key is the dynamic parameter and value is the type')]
        [DynamicParameterConfig]$DynamicParameterConfig,
        [ValidateNotNullorEmpty()]
        [Parameter(Mandatory=$false)]
        [pscustomobject]$StringArgumentCompleter
    )
    $attributeCollectionMandatory = [ObjectModel.Collection[System.Attribute]]::new()
    Foreach ($paramset in $ParameterSetName) {
        $attributeCollectionMandatory.Add(
            [ParameterAttribute]@{
                ParameterSetName = $paramset
                Mandatory = $ParamConfig.Mandatory
            }
        )
        Switch ($PSBoundParameters.Keys) {
            StringArgumentCompleter {
                $attributeCollectionMandatory.Add([ArgumentCompletionsAttribute]::new($StringArgumentCompleter))
            }
        }
    }
    [RuntimeDefinedParameter]::new(
        $ParamConfig.Name, $ParamConfig.Type, $attributeCollectionMandatory
    )
}
Function Out-RuntimeDefinedParameterDict {
    Param (
        [Parameter(Mandatory=$true,ValueFromPipeline = $true)]
        [RuntimeDefinedParameter[]]$RuntimeDef
    )
    Begin {
        $paramDictionary = [RuntimeDefinedParameterDictionary]::new()
    }
    Process {
        $RuntimeDef | Foreach {$paramDictionary.Add($_.Name, $_)}
    }
    End {
        return $paramDictionary
    }
}
Function Get-AVIFunctionTemplate ($method,$template,$jsonData) {
    $title = $jsonData.info.title
    $apiName = Get-ApiPathName $method.ApiPath
    $apiPath = $method.ApiPath -replace '{uuid}','${uuid}'
    $template -replace '\{0\}',$apiName -replace '\{1\}',$apiPath -replace '\{3\}',$apiVersion -replace '\{4\}',$title
}
Function Get-ApiPathName ($ApiPath) {
    $pathSegments = $apiPath -split '^/|/|{uuid}|-|/$' | Where {-not [string]::IsNullOrEmpty($_)}
    $segmentList = foreach ($segment in $pathSegments) {
        $segment.Substring(0,1).ToUpper() +  $segment.Substring(1)
    }
    $segmentList -join ''
}
Function New-AVISwaggerJsonObj {
    Param(
        [switch]$MinRequired,
        [hashtable]$Definitions,
        [string]$Path,
        [switch]$Nested
    )
    $PropertyDef = $Definitions.$Path.properties
    $RequiredPropertyDef =  $Definitions.$Path.required
    $propertyList = [ordered]@{}
    if ($PSBoundParameters.minRequired.isPresent -and -not $PSBoundParameters.Nested.isPresent) {
        foreach ($key in $PropertyDef.Keys) {
            if ($RequiredPropertyDef -contains $key) {
                $propertyList.Add($key,$PropertyDef.$key)
            }
        }
    }
    else {$propertyList = $PropertyDef}

    $obj = [ordered]@{}
    foreach ($key in $propertyList.Keys | Sort) {
        $value = $propertyList.$key
        if ($value.readOnly -eq $true) {continue}
        if ($null -ne $value.type) {
            switch ($value.type) {
                string {
                    [string]$obj.$key = $value.default ? $value.default : ''
                }
                boolean {
                    [bool]$obj.$key = $value.default ? $value.default : $null
                }
                integer {
                    [int]$obj.$key = $value.default ? $value.default : $null
                }
                array {
                    $obj.$key = [List[object]]::New()
                    if ($null -ne $value.items) {
                        $ref,$nestedObj = $null
                        $ref = $value.items.'$ref' -replace [regex]::Escape('#/definitions/')
                        $nestedObj = New-AVISwaggerJsonObj -Definitions $Definitions -Path $ref -Nested
                        $obj.$key.Add($nestedObj)
                    }
                }
                default {
                    
                }
            }
        }
        else {
            $obj.$key = @{}
            $ref,$nestedObj = $null
            $ref = $value.'$ref' -replace [regex]::Escape('#/definitions/')
            # $refPropertyDef = $Definitions.$ref.properties
            # if ($PSBoundParameters.minRequired.isPresent) {
            #     $nestedObj = New-AVISwaggerJsonObj -Definitions $Definitions -Path $ref -MinRequired -Nested
            # }
            # else {
            #     $nestedObj = New-AVISwaggerJsonObj -Definitions $Definitions -Path $ref -Nested
            # }
            $nestedObj = New-AVISwaggerJsonObj -Definitions $Definitions -Path $ref -Nested
            $obj.$key = $nestedObj
        }
    }
    if ($PSBoundParameters.Nested.isPresent) {
        [pscustomobject]$obj
    }
    else {
        [pscustomobject]$obj | ConvertTo-JSON -Depth 100
    }
}
Function New-AviRestFunctionExport ($method,$methodList,$templateFunction,$jsonData,$ExportList) {
    # $method = $methodList[-1]
    foreach ($methodObj in $methodList) {
        # New
        $resetFunctionTemplate = $templateFunction.psobject.Copy()
        $functionTemplate = Get-AVIFunctionTemplate $methodObj $resetFunctionTemplate $jsonData
        $functionTemplate
        $apiName = Get-ApiPathName $method.ApiPath
        $exportName = "$method-AVIRest$apiName"
        $ExportList.Add($exportName)
    }
}
Function New-AviRestFunctionParamExport ($methodList,$templateFunction,$jsonData,$ExportList) {
    # $method = $methodList[-1]
    foreach ($method in $methodList) {
        # New Object
        $apiName = Get-ApiPathName $method.ApiPath
        $endpoint = $method.ApiPath -split '/',-2 | Select -Last 1
        $endpoint = $endpoint -replace '-'
        $definitionList = $jsonData.definitions
        $endpointKey = $null
        $endpointKey = Switch ($definitionList.keys) {
            {$_ -match $endpoint} {$_}
        }
        if ($null -ne $endpointKey) {
            $fullObj = New-AVISwaggerJsonObj -Definitions $definitionList -Path $endpointKey
            $minObj = New-AVISwaggerJsonObj -Definitions $definitionList -Path $endpointKey -MinRequired
            $resetTemplateFunction = $templateFunction.psobject.Copy()
            $objectFunction = $resetTemplateFunction -replace '\{0\}',$apiName -replace '\{1\}',$minObj -replace '\{2\}',$fullObj -replace '\{3\}',$apiVersion -replace '\{4\}',$title
            $exportName = "New-AVIRest{0}Object" -f $apiName
            $ExportList.Add($exportName)
            $objectFunction
        }
    }
}

$dynamicExportList = [List[string]]::New()
Try {
    # Templates
    $templateFunctionGET = Get-Content .\Templates\GET.pst1 -Raw -EA Stop
    $templateFunctionPUT = Get-Content .\Templates\PUT.pst1 -Raw 
    $templateFunctionDELETE = Get-Content .\Templates\DELETE.pst1 -Raw 
    $templateFunctionPOST = Get-Content .\Templates\POST.pst1 -Raw
    $templateFunctionPOSTuuid = Get-Content .\Templates\POSTUuid.pst1 -Raw
    $templateObject = Get-Content .\Templates\NEWObj.pst1 -Raw
    $swaggerLocation = '..\Swagger','.\Swagger' | Where {(Test-Path $_) -eq $true}
    $jsonFileList = Get-ChildItem "$swaggerLocation\*.json" -Exclude 'package.json'

    $jsonFileData = $jsonFileList | Foreach {
        Get-Content $_ -Raw | ConvertFrom-JSON -Depth 100 -AsHashtable
    }
    [string[]]$global:AVIapiRevsionList = $jsonFileData | Group {$_.info.version} -NoElement | Select -ExpandProperty Name
    
    # $jsonData = $jsonFileData[0]
    $jsonData = $jsonFileData | Where {$_.info.title -match 'ipaddr'}
    Foreach ($jsonData in $jsonFileData) {
        $title = $jsonData.info.title
        Write-Verbose "Loading swagger endpoint [$title]"
        [string]$apiVersion = $jsonData.info.version
        $keyList = $jsonData.paths.Keys
        $key = $keyList[0]
        $methodList = foreach ($key in $keyList) {
            $methodLookup = $jsonData.paths.$Key
            foreach ($method in $methodLookup.Keys) {
                [pscustomobject]@{
                    Method = $method
                    ApiPath = $key
                }
            }
        }
        $methodLookup = $methodList | Group Method -AsHashTable -AsString

        # Methods
        $get,$put,$delete,$new = $null
        ## Get
        $get = $methodLookup.get
        if ($null -ne $get) {
            $primaryKey,$uuidList,$resourceList,$joinResources = $null
            $primaryKey = $get[0].ApiPath # the primary endpoint
            $uuidList = $get.ApiPath | Where {$_ -match '{uuid}'}
            if ($null -ne $uuidList) {
                $resourceList = $uuidList[1..$uuidList.count] | Foreach {$_ -replace "$primaryKey/{uuid}/|/$"}
            }
            if ($null -ne $resourceList) {
                $joinResources = '{0}' -f ($resourceList -split '\r\n' -join ',')
            }

            $apiPath = $get.ApiPath[0]
            $apiName = Get-ApiPathName $get[0].ApiPath
            $functionGET = $templateFunctionGET -replace '\{0\}',$apiPath -replace '\{1\}',$joinResources -replace '\{2\}',$apiName -replace '\{3\}',$apiVersion -replace '\{4\}',$title
            Invoke-Expression -Command $functionGET
            $exportName = "Get-AVIRest$apiName"
            $dynamicExportList.Add($exportName)
        }

        ## PUT
        $putList = $methodLookup.put
        # $put = $putList[0]
        foreach ($put in $putList) {
            $functionTemplate = Get-AVIFunctionTemplate $put $templateFunctionPUT $jsonData
            Invoke-Expression -Command $functionTemplate
            $apiName = Get-ApiPathName $put.ApiPath
            $exportName = "Set-AVIRest$apiName"
            $dynamicExportList.Add($exportName)
        }

        ## POST
        $postList = $methodLookup.post
        ### no id POSTs
        $noIdpostList,$noIdpostFunctionList = $null
        $noIdpostList = $postList | Where {$_.ApiPath -notmatch 'uuid'}

        foreach ($post in $noIdpostList) {
            $functionTemplate = Get-AVIFunctionTemplate $post $templateFunctionPOST $jsonData
            Invoke-Expression -Command $functionTemplate
            $apiName = Get-ApiPathName $post.ApiPath
            $exportName = "New-AVIRest$apiName"
            $dynamicExportList.Add($exportName)
        }
        # $noIdpostFunctionList = New-AviRestFunctionExport New $noIdpostList $templateFunctionPOST $jsonData $dynamicExportList
        # Foreach ($noIdFunction in $noIdpostFunctionList) {
        #     Invoke-Expression -Command $noIdFunction
        # }
        $noIdpostFunctionParamList = New-AviRestFunctionParamExport $noIdpostList $templateObject $jsonData $dynamicExportList
        Foreach ($noIdFunctionParam in $noIdpostFunctionParamList ) {
            Invoke-Expression -Command $noIdFunctionParam
        }

        ### Id POSTs
        $idpostList,$idpostFunctionList = $null
        $idpostList = $postList | Where {$_.ApiPath -match 'uuid'}

        foreach ($post in $idpostList) {
            $functionTemplate = Get-AVIFunctionTemplate $post $templateFunctionPOSTuuid $jsonData
            Invoke-Expression -Command $functionTemplate
            $apiName = Get-ApiPathName $post.ApiPath
            $exportName = "Invoke-AVIRest$apiName"
            $dynamicExportList.Add($exportName)
        }
        # $idpostFunctionList = New-AviRestFunctionExport Invoke $idpostList $templateFunctionPOSTuuid $jsonData $dynamicExportList
        # Foreach ($idFunction in $idpostFunctionList) {
        #     Invoke-Expression -Command $idFunction
        # }
        $idpostFunctionParamList = New-AviRestFunctionParamExport $idpostList $templateObject $jsonData $dynamicExportList
        Foreach ($idFunctionParam in $idpostFunctionParamList) {
            Invoke-Expression -Command $idFunctionParam
        }

        ## Delete
        $deleteList = $methodLookup.delete
        foreach ($delete in $deleteList) {
            $functionTemplate = Get-AVIFunctionTemplate $delete $templateFunctionDELETE $jsonData
            Invoke-Expression -Command $functionTemplate
            $apiName = Get-ApiPathName $delete.ApiPath
            $exportName = "Remove-AVIRest$apiName"
            $dynamicExportList.Add($exportName)
        }

        # New Obj # this needs work to add body and body-less versions
        # $path,$pathCase = $null
        # $path = $keyList[0] -replace '/'
        # $pathCase = $jsonData.definitions.keys | Where {$_ -eq $path}
        # if ($null -eq $pathCase) {continue}

        # $definitionList = $jsonData.definitions
        # $fullObj = New-AVISwaggerJsonObj -Definitions $definitionList -Path $pathCase
        # $minObj = New-AVISwaggerJsonObj -Definitions $definitionList -Path $pathCase -MinRequired
        # $objectFunction = $templateObject -replace '\{0\}',$pathCase -replace '\{1\}',$minObj -replace '\{2\}',$fullObj -replace '\{3\}',$apiVersion -replace '\{4\}',$title
        # Invoke-Expression -Command $objectFunction
        # $exportName = "New-AVIRest{0}Object" -f $pathCase
        # $dynamicExportList.Add($exportName)
    }
}
Catch {
    Throw $error[0]
}

# Public
Function Connect-AVIRest {
    [CmdletBinding(DefaultParameterSetName = 'Username')]
    Param (
        [Parameter(
            Mandatory=$true,
            Position=0)]
        [Parameter(ParameterSetName = 'Username')]
        [Parameter(ParameterSetName = 'Credential')]
        [ValidateNotNullOrEmpty()]
        [string]$Server,
        [Parameter(
            Mandatory=$true,
            ParameterSetName = 'Username')]
        [ValidateNotNullOrEmpty()]
        [string]$Username,
        [Parameter(
            Mandatory=$true,
            ParameterSetName = 'Username')]
        [ValidateNotNullOrEmpty()]
        [Securestring]$Password,
        [Parameter(
            Mandatory=$true,
            Position=1,
            ParameterSetName = 'Credential')]
        [ValidateNotNullOrEmpty()]
        [PSCredential]$Credential
    )
    # DynamicParam {
    #     $RuntimeDefList = [List[RuntimeDefinedParameter]]::New()
    #     $paramConfig = [DynamicParameterConfig]::New('APIRev', [string[]], $true)
    #     $runtimeParamConfig = @{
    #         ParameterSetName = 'Username','Credential'
    #         DynamicParameterConfig = $paramConfig
    #         StringArgumentCompleter = $global:AVIapiRevsionList
    #     }
    #     $RuntimeDefList.Add((New-RuntimeDefinedParameter @runtimeParamConfig))
    #     $RuntimeDefList | Out-RuntimeDefinedParameterDict
    # }
    Process {
        $global:AVIStdParams = Invoke-AVIRestParameters
        $global:AVISessionParam = [hashtable]::Synchronized(@{
            WebSession = $null
        })
        Switch ($PSCmdlet.ParameterSetName) {
            'Credential' {
                $Username = $Credential.UserName
                [string]$pswd = $Credential.GetNetworkCredential().Password
            }
            'Username' {
                [string]$pswd = $Password | ConvertFrom-SecureString $Password -AsPlainText
            }
        }
        $Body = @{
            'username' = $Username # case sensitive property !!!!!!!!!
            'password' = $pswd # case sensitive property !!!!!!!!!!!!
        }
        $global:AVILbServerInfo = Get-AVIRestToken -Server $Server -Body $Body -APIRev $APIRev
        $global:AVILbServerInfo
    }
}
Function Disconnect-AVIRest {
    $endpoint = "/logout"
    $method = 'POST'
    Invoke-AVIRest -Method $method -Endpoint $endpoint -EA SilentlyContinue
    $global:AVISessionParam.WebSession = $null
    $global:AVIServer = $null
}
Function Get-AVIRestRef {
    [CmdletBinding(
    DefaultParameterSetName = 'Ref',
    SupportsPaging=$true)]
    Param (
        [Parameter(
            Position=0,
            Mandatory=$true,
            ParameterSetName = 'Ref',
            ValueFromPipeline = $true)]
        [ValidateNotNullOrEmpty()]
        [pscustomobject]$AviLbObject,
        [Switch]$RefOnly
    )
    $refList = $AviLbObject | Get-Member -MemberType NoteProperty | Where Name -match '_ref(s)*$' | Select -ExpandProperty Name
    If ($null -eq $refList) {return $Object}
    # $refProperty = $refList[0]
    $propertyList = [List[string]]::New($refList.count)
    :refList foreach ($refProperty in $refList) {
        $refUrl = $AviLbObject.$refProperty
        $splat = @{
            Method = 'GET'
            Endpoint = ($refUrl -split '(/api)' | Select -Skip 1) -join ''
        }
        $refReply = $null
        $refReply = Invoke-AVIRest @splat
        if ($null -eq $refReply -or $null -ne $refReply.API_ErrorMesg) {
            continue refList
        }
        $propertyName = $null
        $propertyName = $refProperty -replace '_ref'
        $propertyList.Add($propertyName)
        $AviLbObject | Add-Member -MemberType NoteProperty -Name $propertyName -Value $refReply -Force
    }
    if ($PSBoundParameters.RefOnly.isPresent) {
        # $joinProperty = $propertyList -join ','
        $AviLbObject | Select $propertyList | Foreach {$_.PSObject.TypeNames.Insert(0,'AVIRestRef')}
    }
    else {
        $AviLbObject | Foreach {$_.PSObject.TypeNames.Insert(0,'AVIRestRef')}
    }
}
Function Get-AVIRestRefObject {
    [CmdletBinding(
    DefaultParameterSetName = 'Ref',
    SupportsPaging=$true)]
    Param (
        [Parameter(
            Mandatory=$true,
            Position=0,
            ValueFromPipeline = $true)]
        [ValidateNotNullOrEmpty()]
        [PSTypeName('AVIRestRef')]$Ref,
        [Switch]$RefOnly
    )
    $refList = $AviLbObject | Get-Member -MemberType NoteProperty | Where Name -match '_ref(s)*$' | Select -ExpandProperty Name
    If ($null -eq $refList) {return $Object}
    # $refProperty = $refList[0]
    $propertyList = [List[string]]::New($refList.count)
    :refList foreach ($refProperty in $refList) {
        $refUrl = $AviLbObject.$refProperty
        $splat = @{
            Method = 'GET'
            Endpoint = ($refUrl -split '(/api)' | Select -Skip 1) -join ''
        }
        $refReply = $null
        $refReply = Invoke-AVIRest @splat
        if ($null -eq $refReply -or $null -ne $refReply.API_ErrorMesg) {
            continue refList
        }
        $propertyName = $null
        $propertyName = $refProperty -replace '_ref'
        $propertyList.Add($propertyName)
        $AviLbObject | Add-Member -MemberType NoteProperty -Name $propertyName -Value $refReply -Force
    }
    if ($PSBoundParameters.RefOnly.isPresent) {
        # $joinProperty = $propertyList -join ','
        $AviLbObject | Select $propertyList
    }
    else {
        $AviLbObject
    }
}
Function Copy-AVIRestObject {
    [CmdletBinding(DefaultParameterSetName = 'Default')]
    Param(
        [Parameter(
            Position = 0,
            Mandatory=$true,
            ValueFromPipeline=$false,
            ParameterSetName = 'Default')]
        [ValidateNotNullOrEmpty()]
        $InputObject
    )
    DynamicParam {
        $RuntimeDefList = [List[RuntimeDefinedParameter]]::New()
        $paramConfig = [DynamicParameterConfig]::New('Excludes', [string[]], $false)
        [string[]]$completionList = $InputObject | Get-Member -MemberType NoteProperty | Select-Object -ExpandProperty Name -EA SilentlyContinue
        $runtimeParamConfig = @{
            ParameterSetName = 'Default'
            DynamicParameterConfig = $paramConfig
            StringArgumentCompleter = $completionList ? $completionList : ''
        }
        $RuntimeDefList.Add((New-RuntimeDefinedParameter @runtimeParamConfig))
        $RuntimeDefList | Out-RuntimeDefinedParameterDict
    }
    Begin {
    }
    Process {
        $defaultExcludes = 'uuid','url','_last_modified'
        [string[]]$excludeProperty = $defaultExcludes + $Excludes
        $psTypeName = $InputObject.{pstypenames}?[0]
        $result = $InputObject | Select-Object * -ExcludeProperty $excludeProperty -EA SilentlyContinue
        If ($null -ne $InputObject.Name) {
            $result.name = $InputObject.Name + '-Cloned'
        }
        If ($null -ne $psTypeName) {
            $result.PSObject.TypeNames.Insert(0,$psTypeName)
        }
        $result
    }
}

$staticExportList = 'Connect-AVIRest','Disconnect-AVIRest','Get-AVIRestRef','Copy-AVIRestObject'
$exportList = $staticExportList + $dynamicExportList
Export-ModuleMember $exportList 

