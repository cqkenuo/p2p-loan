package com.vanguard.p2p.utils;

import lombok.Getter;

@Getter
public enum BidRequestOrderBy {
	BIDREQUEST_STATE("br.bidRequestState");
	private String orderBy;
	BidRequestOrderBy(String orderBy){
		this.orderBy = orderBy;
	}
}
