package com.ssafy.travelTune.domain.trip.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.travelTune.domain.itinerary.vo.Itinerary;
import com.ssafy.travelTune.domain.member.vo.Member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Trip {
	private Long tripId;
	private Long MemberId;
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Member member;
	
	@Builder.Default
	private List<TripMember> tripMember = new ArrayList<>();
	
	@Builder.Default
	private List<Itinerary> itinerary = new ArrayList<>();
}
