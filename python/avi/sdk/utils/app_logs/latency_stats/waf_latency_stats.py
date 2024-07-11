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
    phases = ["latency_request_header_phase", "latency_request_body_phase",
              "latency_response_header_phase", "latency_response_body_phase"]
    for e in a:
        if not isinstance(e, dict):
            continue
        if 'waf_log' not in e:
            continue
        w = e['waf_log']
        if not isinstance(w, dict):
            continue
        total_latency = 0
        for p in phases:
            v = int(w[p])
            if v > 0:
                latencies[p].append(v)
                total_latency += v

        waf_statuses[w["status"]] += 1
        latencies["total"].append(total_latency)

    phases.append("total")
    for p in phases:
        lat = latencies[p]
        m = statistics.mean(lat)
        md = statistics.median(lat)
        stdev = statistics.stdev(lat)
        mx = max(lat)
        mn = min(lat)

        if "_" in p:
            name = ' '.join(p.split('_')[1:3])
        else:
            name = p.upper()
        print(f"{name:15s}: median: {md:8.2f}, mean: {m:8.2f} +/- {stdev:6.0f} (min: {mn:9d}, max: {mx:9d})")

    lat_tota = latencies["total"]
    print("\nTen-quantiles for total latency:")
    print(f"10-tiles: {statistics.quantiles(lat_tota, n=10)}")
    q_99 = statistics.quantiles(lat_tota, n=100)[-1]
    q_999 = statistics.quantiles(lat_tota, n=1000)[-1]
    print(f"\n99th percentile for total latency: {q_99:8.2f}, 99.9th percentile: {q_999:8.2f}")

    print("\n WAF Status Distribution:\n")
    for k, v in waf_statuses.items():
        print(f"   {k:10s} -> {v: 6d}")

    # work out "Freedman–Diaconis" no. of bins:
    q25, q75 = np.percentile(lat_tota, [25, 75])
    spread = 2 * (q75 - q25) * len(lat_tota) ** (-1/3)
    bins = round((max(lat_tota) - min(lat_tota)) / spread)

    plt.hist(lat_tota, bins=bins, density=True, label=f)
    plt.legend(loc='upper right')


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
