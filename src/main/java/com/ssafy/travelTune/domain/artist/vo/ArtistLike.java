package com.ssafy.travelTune.domain.artist.vo;

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
public class ArtistLike {
	private Long artistLikeId;
	private Long artistId;
	private Long memberId;
	
	private LocalDateTime createdAt; 
	private LocalDateTime modifiedAt; 
	
	private Artist artist;
	private Member member;
}
