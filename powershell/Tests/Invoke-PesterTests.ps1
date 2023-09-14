$pesterFileList = Get-ChildItem *.Tests.ps1 -Recurse | Sort Name
$pesterFileList | Foreach {Invoke-Pester $_.FullName -Output Detailed}