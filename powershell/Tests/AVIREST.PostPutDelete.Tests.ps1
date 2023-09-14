using Module ..\AVIRest.psd1

BeforeAll {
    BeforeAll {
        $secret = 'simulatedproductionadmin' # Requires MS Secret Management module

        $errorActionPreference = 'Stop'
        Try {
            $aviModuleManifest = Get-ChildItem AVIRest.psd1 -Recurse
            Import-Module $aviModuleManifest.FullName -Force -Verbose
            $credential = get-secret $secret
            $secretInfo = get-secretinfo $secret
            Connect-AVIRest -Server $secretInfo.Metadata.Server -Credential $credential
        }
        Catch {
            Throw 'Could not setup E2E test environment'
        }
    }
}

Describe 'AVI REST API' {
    Context "Clone Object Test" {
        It "Clone/POST an object" {
            $internalGroup = Get-AVIRestIpaddrgroup -Name Internal
            $clonedIPGroup = Copy-AVIRestObject $internalGroup
            $script:clonedIPGroup = New-AVIRestIpaddrgroup -Ipaddrgroup $clonedIPGroup -Confirm:$false
            {$clonedIPGroup} | Should -Not -Throw
            $clonedIPGroup | Should -Not -BeNullOrEmpty
            $clonedIPGroup.Name | Should -Match 'Cloned'
        }
        It "Set/PUT an object" {
            $newName = 'NewName'
            $script:clonedIPGroup.Name = $newName
            $script:editedIPGroup = Set-AVIRestIpaddrgroup -Ipaddrgroup $clonedIPGroup -Confirm:$false
            {$editedIPGroup} | Should -Not -Throw
            $editedIPGroup.Name | Should -Be $newName
        }
        It "Remove/DELETE an object" {
            if ($editedIPGroup.count -ne 1) {Throw 'Please check IP Group'}
            $removedIPGroup = Remove-AVIRestIpaddrgroup -Ipaddrgroup $editedIPGroup -Confirm:$false
            {$removedIPGroup} | Should -Not -Throw
            $removedIPGroup | Should -BeNullOrEmpty
        }
    }
}