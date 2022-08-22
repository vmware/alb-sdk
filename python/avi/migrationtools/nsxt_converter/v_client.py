# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import requests
from avi.migrationtools.nsxt_converter import base_client


class NSXVClient(base_client.NSXClient):

    def get_list_results(self, endpoint, params=None):
        """
        Query method for json API get for list (takes care of pagination)
        """
        response = self.get(endpoint, params).json()
        for _, value in response.items():
            # Only one key and value present
            if 'data' not in value:
                return []

            data = value['data']
            if 'pagingInfo' not in value:
                return data

            paging_info = value['pagingInfo']
            page_size = int(paging_info['pageSize'])
            total_count = int(paging_info['totalCount'])
            if total_count <= page_size:
                return data

            pages = int(total_count/page_size)
            if page_size * pages < total_count:
                pages += 1
            self.logger.info("Total pages to retrieve for url %s is %d" % (endpoint, pages))
            for i in range(1, pages):
                start_index = page_size * i
                if params:
                    params.update({'startindex': start_index})
                else:
                    params = {'startindex': start_index}

                response = self.get(endpoint, params=params)
                if response:
                    for _, v in response.json().items():
                        data += v['data']

            return data

class VCClient(base_client.NSXClient):

    def __init__(self, host, prefix, username=None, password=None, thumbprint=None, logger=None):
        super().__init__(host, prefix, username=username, password=password, logger=logger)
        self.thumbprint = thumbprint
