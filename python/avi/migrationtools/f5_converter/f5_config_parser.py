import re
import sys
import xlsxwriter
from openpyxl import load_workbook
import os
import pandas

irule_list=[]

class iRuleDiscovery():
    def __init__(self,bigip_config,tenant):
       self.f5_config=bigip_config 
       self.tenant=tenant
       self.vs_pattern = '(?<=/'+re.escape(self.tenant)+'/)(.*)(?={)'
       self.pattern = '(?<=ltm rule /'+re.escape(self.tenant)+'/)(.*)(?= {)'
       self.irule_discovery_data={}
       
    def get_irule_discovery(self,output_dir,report_name):
        '''
        Irule discovery 
        '''
        self.list_irules()
        print("Total iRules in config: %d" %num_lines)
        self.irule_mapped_vs()
        self.add_data_to_excel(output_dir,report_name)
        
    def list_irules(self):
        global num_lines
        num_lines=0
        config = open(self.f5_config, 'r')
        lines = config.readlines()

        for line in lines:
            match = re.search(self.pattern, line)
            if match:
                new_line = match.group()
                num_lines += 1
                irule_list.append(match.group())
        config.close()

    def vs_list(self):
        config = open(self.f5_config, 'r')
        data = str(config.read())
        global vs_list
        vs_list = re.split("ltm virtual ", data)
        config.close()
        return vs_list
        
    def irule_mapped_vs(self):
        self.list_irules()
        self.irule_count=len(irule_list)
        if self.irule_count == 0:
            print("There are no Irules Configured")
            return
        else:
            self.vs_list()
        i = 0
       
        while i <= len(irule_list):
            j = 1
            irule_name=irule_list[i]
            self.irule_discovery_data[irule_name]=[]
            while j <= len(vs_list):
                if irule_name in vs_list[j]:
                    vs_name = re.search(self.vs_pattern , vs_list[j])
                    if vs_name:
                        vs_name = vs_name.group()
                        self.irule_discovery_data[irule_name].append(vs_name)                        
                j = j+1
                if j >= len(vs_list):
                    break
            i = i+1
            if i >= len(irule_list):
                break
      
    def add_data_to_excel(self,output_dir,report_name):
        report_path = output_dir + os.path.sep + "%s-ConversionStatus.xlsx" % \
                                                 report_name
        
        data=dict(
            Irule=[],
            Vs=[]
        )
        
        row=1
        for irule,vs in self.irule_discovery_data.items():
            data["Irule"].append(irule)
            data["Vs"].append(vs)
            
        df = pandas.DataFrame(data)
        main_book = load_workbook(report_path)
        main_writer = pandas.ExcelWriter(report_path, engine="openpyxl",mode='a')
        main_writer._book = main_book
       
        df.to_excel(main_writer, "Irule Discovery")
        main_writer.close()
         





