package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 审核实体类的基本类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Getter@Setter
abstract public class BaseAuditDomain extends BaseDomain {

	/**
	 * 申请人
	 */
	private User applier;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 审核人
	 */
	private User auditor;
	/**
	 * 审核时间
	 */
	private Date auditTime;
	/**
	 * 状态 0=审请状态/1=审核通过/2=审核拒绝
	 */
	private Integer state;
	/**
	 * 审核备注
	 */
	private String remark;

	public String getStateDisplay() {
		switch (state) {
		case 0:
			return "申请状态";
		case 1:
			return "审核通过";
		case 2:
			return "审核失败";
		default:
			return "异常";
		}
	}
}
