package com.ssafy.travelTune.domain.friend.vo;

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
public class Friend {
	private Long friendId;
	private Long fromMemberId;
	private Long toMemberId;
	private String friendStatus;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Member member;
}	
