package com.ssafy.travelTune.domain.trip.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TripMemberRole {
	GUEST("GUEST"),
	HOST("HOST");
	
	private final String value;
}
