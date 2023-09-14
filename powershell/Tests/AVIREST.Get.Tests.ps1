using Module ..\AVIRest.psd1

BeforeAll {
    $errorActionPreference = 'Stop'
    Try {
        $aviModuleManifest = Get-ChildItem AVIRest.psd1 -Recurse
        Import-Module $aviModuleManifest.FullName -Force -Verbose
        $credential = get-secret simulatedproductionadmin
        $secretInfo = get-secretinfo simulatedproductionadmin
        Connect-AVIRest -Server $secretInfo.Metadata.Server -Credential $credential
    }
    Catch {
        Throw 'Could not setup E2E test environment'
    }
}

Describe 'AVI REST API' {
    $getCmds = Get-Command -Module AVIRest -Verb GET | Select-Object -ExpandProperty Name
    Foreach ($script:cmd in $getCmds) {
        Context "$cmd Test" {
            It "Execute $cmd cmdlet" {
                {Invoke-Expression "$cmd"} | Should -Not -Throw
            }
        }
    }

    $newObjCmds = Get-Command -Module AviRest -Name 'New-AVIRest*Object' | Select-Object -ExpandProperty Name
    Foreach ($script:cmd in $newObjCmds) {
        Context "$cmd Test" {
            It "Execute $cmd cmdlet" {
                {Invoke-Expression "$cmd"}| Should -Not -BeNullOrEmpty
                $newObj = Invoke-Expression "$cmd"
                ConvertTo-JSON -InputObject $newObj -Depth 100 | Test-JSON | Should -BeTrue
            }
        }
    }
}
