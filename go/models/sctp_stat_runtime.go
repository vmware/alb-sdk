// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SctpStatRuntime sctp stat runtime
// swagger:model SctpStatRuntime
type SctpStatRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsAborted *uint64 `json:"sctps_aborted,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsActiveestab *uint64 `json:"sctps_activeestab,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsBadsid *uint32 `json:"sctps_badsid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsBadsum *uint64 `json:"sctps_badsum,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsBadvtag *uint32 `json:"sctps_badvtag,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsCachedChk *uint64 `json:"sctps_cached_chk,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsCachedStrmoq *uint32 `json:"sctps_cached_strmoq,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsChecksumerrors *uint64 `json:"sctps_checksumerrors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsCmtRandry *uint32 `json:"sctps_cmt_randry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsCollisionestab *uint64 `json:"sctps_collisionestab,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsCurrestab *uint64 `json:"sctps_currestab,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsDatadropchklmt *uint64 `json:"sctps_datadropchklmt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsDatadroprwnd *uint64 `json:"sctps_datadroprwnd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsEcnereducedcwnd *uint32 `json:"sctps_ecnereducedcwnd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsFastretransinrtt *uint32 `json:"sctps_fastretransinrtt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsFragusrmsgs *uint64 `json:"sctps_fragusrmsgs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsFwdtsnMapOver *uint32 `json:"sctps_fwdtsn_map_over,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsHdrops *uint64 `json:"sctps_hdrops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsIfnomemqueued *uint32 `json:"sctps_ifnomemqueued,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsIncontrolchunks *uint64 `json:"sctps_incontrolchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsInorderchunks *uint64 `json:"sctps_inorderchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsInpackets *uint64 `json:"sctps_inpackets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsInunorderchunks *uint32 `json:"sctps_inunorderchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsLeftAbandon *uint64 `json:"sctps_left_abandon,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsLowlevelerr *uint64 `json:"sctps_lowlevelerr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsLowlevelerrusr *uint64 `json:"sctps_lowlevelerrusr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsMarkedretrans *uint32 `json:"sctps_markedretrans,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsMaxburstqueued *uint32 `json:"sctps_maxburstqueued,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsNaglequeued *uint32 `json:"sctps_naglequeued,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsNaglesent *uint32 `json:"sctps_naglesent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsNomem *uint32 `json:"sctps_nomem,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsNoport *uint32 `json:"sctps_noport,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsOutcontrolchunks *uint64 `json:"sctps_outcontrolchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsOutoftheblue *uint64 `json:"sctps_outoftheblue,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsOutorderchunks *uint64 `json:"sctps_outorderchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsOutpackets *uint64 `json:"sctps_outpackets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsOutunorderchunks *uint64 `json:"sctps_outunorderchunks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPassiveestab *uint64 `json:"sctps_passiveestab,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpbadd *uint32 `json:"sctps_pdrpbadd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpbwrpt *uint32 `json:"sctps_pdrpbwrpt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpcrupt *uint32 `json:"sctps_pdrpcrupt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpdiwnp *uint32 `json:"sctps_pdrpdiwnp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpdizrw *uint32 `json:"sctps_pdrpdizrw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpdnfnd *uint32 `json:"sctps_pdrpdnfnd,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpfehos *uint32 `json:"sctps_pdrpfehos,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpfmbox *uint32 `json:"sctps_pdrpfmbox,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpmark *uint32 `json:"sctps_pdrpmark,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpmbct *uint32 `json:"sctps_pdrpmbct,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpmbda *uint32 `json:"sctps_pdrpmbda,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrpnedat *uint32 `json:"sctps_pdrpnedat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrppdbrk *uint32 `json:"sctps_pdrppdbrk,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPdrptsnnf *uint32 `json:"sctps_pdrptsnnf,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsPrimaryRandry *uint32 `json:"sctps_primary_randry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsProtocolDrainCalls *uint64 `json:"sctps_protocol_drain_calls,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsProtocolDrainsDone *uint64 `json:"sctps_protocol_drains_done,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsQueueUpdEcne *uint32 `json:"sctps_queue_upd_ecne,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsReadPeeks *uint32 `json:"sctps_read_peeks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsReasmusrmsgs *uint64 `json:"sctps_reasmusrmsgs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvSpare *uint32 `json:"sctps_recv_spare,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvauth *uint64 `json:"sctps_recvauth,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvauthfailed *uint32 `json:"sctps_recvauthfailed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvauthmissing *uint64 `json:"sctps_recvauthmissing,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvbytes *uint32 `json:"sctps_recvbytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvdata *uint64 `json:"sctps_recvdata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvdatagrams *uint64 `json:"sctps_recvdatagrams,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvdupdata *uint64 `json:"sctps_recvdupdata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvecne *uint64 `json:"sctps_recvecne,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvexpress *uint32 `json:"sctps_recvexpress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvexpressm *uint32 `json:"sctps_recvexpressm,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvheartbeat *uint64 `json:"sctps_recvheartbeat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvheartbeatack *uint64 `json:"sctps_recvheartbeatack,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvhwcrc *uint32 `json:"sctps_recvhwcrc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvivalhmacid *uint32 `json:"sctps_recvivalhmacid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvivalkeyid *uint32 `json:"sctps_recvivalkeyid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvpackets *uint64 `json:"sctps_recvpackets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvpktwithdata *uint64 `json:"sctps_recvpktwithdata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvsacks *uint64 `json:"sctps_recvsacks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRecvswcrc *uint32 `json:"sctps_recvswcrc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsRestartestab *uint64 `json:"sctps_restartestab,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendBurstAvoid *uint32 `json:"sctps_send_burst_avoid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendCwndAvoid *uint32 `json:"sctps_send_cwnd_avoid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendSpare *uint64 `json:"sctps_send_spare,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendauth *uint64 `json:"sctps_sendauth,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendbytes *uint32 `json:"sctps_sendbytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSenddata *uint64 `json:"sctps_senddata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendecne *uint64 `json:"sctps_sendecne,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSenderragain *uint32 `json:"sctps_senderragain,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSenderrmsgsize *uint32 `json:"sctps_senderrmsgsize,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSenderrors *uint64 `json:"sctps_senderrors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendfastretrans *uint64 `json:"sctps_sendfastretrans,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendheartbeat *uint64 `json:"sctps_sendheartbeat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendhwcrc *uint64 `json:"sctps_sendhwcrc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendmultfastretrans *uint64 `json:"sctps_sendmultfastretrans,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendpackets *uint64 `json:"sctps_sendpackets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendretransdata *uint64 `json:"sctps_sendretransdata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendsWithAbort *uint64 `json:"sctps_sends_with_abort,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendsWithEOF *uint64 `json:"sctps_sends_with_eof,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendsWithFlags *uint32 `json:"sctps_sends_with_flags,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendsWithUnord *uint64 `json:"sctps_sends_with_unord,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendsacks *uint64 `json:"sctps_sendsacks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSendswcrc *uint64 `json:"sctps_sendswcrc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsShutdown *uint64 `json:"sctps_shutdown,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsSlowpathSack *uint32 `json:"sctps_slowpath_sack,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoasconf *uint64 `json:"sctps_timoasconf,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoassockill *uint64 `json:"sctps_timoassockill,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoautoclose *uint64 `json:"sctps_timoautoclose,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimocookie *uint64 `json:"sctps_timocookie,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimodata *uint64 `json:"sctps_timodata,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimodelprim *uint64 `json:"sctps_timodelprim,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoearlyfr *uint64 `json:"sctps_timoearlyfr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoheartbeat *uint64 `json:"sctps_timoheartbeat,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoinit *uint32 `json:"sctps_timoinit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoinpkill *uint64 `json:"sctps_timoinpkill,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoiterator *uint64 `json:"sctps_timoiterator,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimopathmtu *uint32 `json:"sctps_timopathmtu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimosack *uint64 `json:"sctps_timosack,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimosecret *uint32 `json:"sctps_timosecret,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoshutdown *uint64 `json:"sctps_timoshutdown,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoshutdownack *uint64 `json:"sctps_timoshutdownack,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimoshutdownguard *uint64 `json:"sctps_timoshutdownguard,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimostrmrst *uint64 `json:"sctps_timostrmrst,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsTimowindowprobe *uint64 `json:"sctps_timowindowprobe,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsVtagbogus *uint32 `json:"sctps_vtagbogus,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsVtagexpress *uint32 `json:"sctps_vtagexpress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsWindowprobed *uint64 `json:"sctps_windowprobed,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SctpsWuSacksSent *uint64 `json:"sctps_wu_sacks_sent,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
