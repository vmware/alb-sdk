# Copyright (c) 2026 Broadcom Inc. and/or its subsidiaries. All Rights Reserved. Broadcom Confidential.
# SPDX-License-Identifier: Apache License 2.0

import httpx2


class MultipartEncoder:
    """Streaming multipart/form-data body built on httpx2.

    Not a full drop-in for requests_toolbelt.MultipartEncoder: it implements
    only content_type, __iter__, and __len__, which is exactly what
    requests.PreparedRequest.prepare_body needs to stream a body with a
    Content-Length. read(), .len, to_string(), and the boundary=/encoding=
    kwargs are not supported.

    httpx2.Request is constructed against a throwaway, never-dispatched URL
    purely to borrow its multipart body/header encoding.
    """

    def __init__(self, fields):
        # httpx2 renders all data fields before all file fields, regardless
        # of dict insertion order, unlike requests_toolbelt (which preserved
        # caller order). Verified benign for every current call site.
        data = {k: v for k, v in fields.items() if not isinstance(v, (tuple, list))}
        files = {k: v for k, v in fields.items() if isinstance(v, (tuple, list))}
        request = httpx2.Request(
            'POST', 'https://multipart-encoder.invalid/', data=data, files=files)
        self.content_type = request.headers['Content-Type']
        content_length = request.headers.get('Content-Length')
        self._content_length = int(content_length) if content_length is not None else None
        self._stream = request.stream

    def __iter__(self):
        return iter(self._stream)

    def __len__(self):
        # httpx2 omits Content-Length (chunked transfer) when a file field's
        # length can't be pre-determined (non-seekable file object, pipe).
        # Raising here lets requests.utils.super_len's except clause catch it
        # and fall back to chunked transfer, same as it does for any other
        # body object without a usable __len__.
        if self._content_length is None:
            raise TypeError(
                'Content-Length unavailable for this multipart body (a file '
                'field is not seekable); falling back to chunked transfer')
        return self._content_length
