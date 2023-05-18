package com.geekster.stock.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StockType {

	FMCG("FMCG"), IT("IT"), HEALTH("HEALTH");

	private String code;

}
