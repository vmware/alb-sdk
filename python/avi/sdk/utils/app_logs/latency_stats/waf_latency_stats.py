#!/usr/bin/env python3

############################################################################
# ========================================================================
# Copyright 2024 VMware, Inc.  All rights reserved. VMware Confidential
# ========================================================================
###

# Copyright 2024 VMware, Inc.

import sys
import collections
import json
import statistics

import matplotlib.pyplot as plt
import numpy as np

def process_file(f):
    with open(f, encoding="utf-8") as fd:
        a = json.load(fd)
    waf_statuses = collections.defaultdict(int)
    latencies = collections.defaultdict(list)
    timings = {
        "total_time" : "TOTAL",
        "server_response_time_first_byte" : "Srv First Byte",
        "server_response_time_last_byte": "Srv  Last Byte",
        "response_time_first_byte": "Rsp First Byte",
        "response_time_last_byte": "Rsp  Last Byte",
        "app_response_time": "App  Resp Time"
    }
    phases = {
        "latency_request_header_phase": "Req  Hdr Phase",
        "latency_request_body_phase": "Req Body Phase",
        "latency_response_header_phase": "Res  Hdr Phase",
        "latency_response_body_phase": "Res Body Phase"
        }
    for e in a:
        if not isinstance(e, dict):
            continue
        for t in timings:
            v = e.get(t, None)
            if v: # avi shows '' if the value doesn't exist
                try:
                    latencies[t].append(int(v))
                except Exception as exc:
                    print(f"Failed to add '{v}' as int to {t} latencies: {exc}")
        if 'waf_log' not in e:
            continue
        w = e['waf_log']
        if not isinstance(w, dict):
            continue
        total_latency = 0
        for p in phases:
            v = int(w[p])
            if v > 0: # these don't count as then the phase didn't run at all
                latencies[p].append(v)
                total_latency += v

        waf_statuses[w["status"]] += 1
        if total_latency > 0:
            latencies["total"].append(total_latency)

    if "total" in latencies:
        phases["total"] = "WAF All Phases"

    def show(keys, latencies, banner):
        print(f"\n{banner}\n")

        for k,name in keys.items():
            lat = latencies[k]
            if 0 == len(lat):
                print(f"No data for {k}")
                continue
            m = statistics.mean(lat)
            md = statistics.median(lat)
            stdev = statistics.stdev(lat)
            mx = max(lat)
            mn = min(lat)

            print(f"{name:15s} ({len(lat)} values): median: {md:8.2f}, mean: {m:8.2f} +/- {stdev:6.0f} (min: {mn:9d}, max: {mx:9d})")

    show(phases, latencies, "Timings for WAF Phases in microseconds")
    show(timings, latencies, "Timings for APP Phases in milliseconds")

    lat_tota = latencies.get("total", [])
    if len(lat_tota) > 1:
        print("\nTen-quantiles for total WAF latency:")
        print(f"10-tiles: {statistics.quantiles(lat_tota, n=10)}")
        q_99 = statistics.quantiles(lat_tota, n=100)[-1]
        q_999 = statistics.quantiles(lat_tota, n=1000)[-1]
        print(f"\n99th percentile for total WAF latency: {q_99:8.2f}, 99.9th percentile: {q_999:8.2f}")

        # work out "Freedman–Diaconis" no. of bins:
        q25, q75 = np.percentile(lat_tota, [25, 75])
        spread = 2 * (q75 - q25) * len(lat_tota) ** (-1/3)
        bins = round((max(lat_tota) - min(lat_tota)) / spread)

        plt.hist(lat_tota, bins=bins, density=True, label=f)
        plt.legend(loc='upper right')

    if len(waf_statuses):
        print("\n WAF Status Distribution:\n")
        for k, v in waf_statuses.items():
            print(f"   {k:10s} -> {v: 6d}")



if __name__ == '__main__':
    files = ['logs.json']

    if len(sys.argv) > 1:
        files = sys.argv[1:]

    for file in files:
        try:
            print(f"\n=========\n\n Processing file '{file}'\n")
            process_file(file)
        except Exception as ex:
            print(f" ==> Failed: {ex}")
    plt.show()
