package com.geekster.university.event.management.system.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Department {

	ME("ME"), ECE("ECE"), CIVIL("CIVIL"), CSE("CSE");

//	@JsonValue
	private String code;

}
