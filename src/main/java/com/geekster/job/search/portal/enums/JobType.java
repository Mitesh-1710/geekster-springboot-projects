package com.geekster.job.search.portal.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum JobType {

	IT("IT"), HR("HR "), SALES("SALES"), MARKETING("MARKETING"), TEACHER("TEACHER");

	private String code;

}
