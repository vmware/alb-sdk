// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentSharedDBStats se agent shared d b stats
// swagger:model SeAgentSharedDBStats
type SeAgentSharedDBStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisDel *int64 `json:"dp_to_redis_del,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisDelErr *int64 `json:"dp_to_redis_del_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisDelErrNotConn *int64 `json:"dp_to_redis_del_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisDelErrNotOk *int64 `json:"dp_to_redis_del_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisGet *int64 `json:"dp_to_redis_get,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisGetErr *int64 `json:"dp_to_redis_get_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisGetErrNotConn *int64 `json:"dp_to_redis_get_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisGetErrNotOk *int64 `json:"dp_to_redis_get_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetEx *int64 `json:"dp_to_redis_set_ex,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExErr *int64 `json:"dp_to_redis_set_ex_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExErrNotConn *int64 `json:"dp_to_redis_set_ex_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExErrNotOk *int64 `json:"dp_to_redis_set_ex_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExnx *int64 `json:"dp_to_redis_set_exnx,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExnxErr *int64 `json:"dp_to_redis_set_exnx_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExnxErrNotConn *int64 `json:"dp_to_redis_set_exnx_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSetExnxErrNotOk *int64 `json:"dp_to_redis_set_exnx_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSync *int64 `json:"dp_to_redis_sync,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSyncErr *int64 `json:"dp_to_redis_sync_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSyncErrNotConn *int64 `json:"dp_to_redis_sync_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpToRedisSyncErrNotOk *int64 `json:"dp_to_redis_sync_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FromRedisDelete *int64 `json:"from_redis_delete,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FromRedisExpiredDelete *int64 `json:"from_redis_expired_delete,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FromRedisFullSync *int64 `json:"from_redis_full_sync,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FromRedisUpdate *int64 `json:"from_redis_update,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	//  Enum options - SDB_CONNECTING, SDB_CONNECTED, SDB_DISCONNECTED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RedisConnState *string `json:"redis_conn_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisAllKeysGetVal *int64 `json:"to_redis_all_keys_get_val,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisAllKeysGetValErr *int64 `json:"to_redis_all_keys_get_val_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisAllKeysGetValErrNotConn *int64 `json:"to_redis_all_keys_get_val_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisAllKeysGetValErrNotOk *int64 `json:"to_redis_all_keys_get_val_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigGetPort *int64 `json:"to_redis_config_get_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigGetPortErr *int64 `json:"to_redis_config_get_port_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigGetPortErrNotConn *int64 `json:"to_redis_config_get_port_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigGetPortErrNotOk *int64 `json:"to_redis_config_get_port_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigSetKea *int64 `json:"to_redis_config_set_kea,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigSetKeaErr *int64 `json:"to_redis_config_set_kea_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigSetKeaErrNotConn *int64 `json:"to_redis_config_set_kea_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisConfigSetKeaErrNotOk *int64 `json:"to_redis_config_set_kea_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisFlushdb *int64 `json:"to_redis_flushdb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisFlushdbErr *int64 `json:"to_redis_flushdb_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisFlushdbErrNotConn *int64 `json:"to_redis_flushdb_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisFlushdbErrNotOk *int64 `json:"to_redis_flushdb_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetAllKeys *int64 `json:"to_redis_get_all_keys,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetAllKeysErr *int64 `json:"to_redis_get_all_keys_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetAllKeysErrNotConn *int64 `json:"to_redis_get_all_keys_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetAllKeysErrNotOk *int64 `json:"to_redis_get_all_keys_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetVal *int64 `json:"to_redis_get_val,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetValErr *int64 `json:"to_redis_get_val_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetValErrNotConn *int64 `json:"to_redis_get_val_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisGetValErrNotOk *int64 `json:"to_redis_get_val_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisPipelineFlush *int64 `json:"to_redis_pipeline_flush,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisPipelineFlushErr *int64 `json:"to_redis_pipeline_flush_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisPipelineFlushErrNotOk *int64 `json:"to_redis_pipeline_flush_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisPipelineSize *int64 `json:"to_redis_pipeline_size,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScan *int64 `json:"to_redis_scan,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanBatchSize *int64 `json:"to_redis_scan_batch_size,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanErr *int64 `json:"to_redis_scan_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanErrNotConn *int64 `json:"to_redis_scan_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanErrNotOk *int64 `json:"to_redis_scan_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanMgetVal *int64 `json:"to_redis_scan_mget_val,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanMgetValErr *int64 `json:"to_redis_scan_mget_val_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanMgetValErrNotConn *int64 `json:"to_redis_scan_mget_val_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisScanMgetValErrNotOk *int64 `json:"to_redis_scan_mget_val_err_not_ok,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisSelectDb *int64 `json:"to_redis_select_db,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisSelectDbErr *int64 `json:"to_redis_select_db_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisSelectDbErrNotConn *int64 `json:"to_redis_select_db_err_not_conn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToRedisSelectDbErrNotOk *int64 `json:"to_redis_select_db_err_not_ok,omitempty"`

	//  It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsRef *string `json:"vs_ref,omitempty"`
}
