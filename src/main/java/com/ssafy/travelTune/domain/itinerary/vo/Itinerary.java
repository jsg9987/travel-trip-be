package com.ssafy.travelTune.domain.itinerary.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ssafy.travelTune.domain.region.vo.Attraction;
import com.ssafy.travelTune.domain.trip.vo.Trip;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Itinerary {
	private Long itineraryId;
	private Long tripId;
	private Long attractionId;
	private Integer dayNumber; // n일차
	private Integer visitOrder; // 방문 순서
	private String memo;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Long price;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Trip trip;
	private Attraction attraction;
}
