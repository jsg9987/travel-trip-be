package com.ssafy.travelTune.domain.trip.vo;

import java.time.LocalDateTime;

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
public class TripMember {
	private Long tripMemberId;
	private Long tripId;
	private Long memberId;
	private TripMemberRole role;
	private TripMemberRole status;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Member member;
	private Trip trip;
}
