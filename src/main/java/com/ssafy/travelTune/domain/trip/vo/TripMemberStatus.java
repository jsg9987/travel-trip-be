package com.ssafy.travelTune.domain.trip.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TripMemberStatus {
	PENDING("PENDING"),
	ACCEPTED("ACCEPTED"),
	REJECTED("REJECTED"),
	LEFT("LEFT");
	
	private final String value;
}
