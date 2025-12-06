package com.ssafy.travelTune.domain.music.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
public class MusicLike {
	private Long musicLikeId;
	private Long musicId;
	private Long memberId;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Music music;
	private Member member;
}
