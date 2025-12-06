package com.ssafy.travelTune.domain.member.vo;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.travelTune.domain.artist.vo.ArtistLike;
import com.ssafy.travelTune.domain.friend.vo.Friend;
import com.ssafy.travelTune.domain.music.vo.Music;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Member {
	private Long memberId;
	private String email;
	private String nickname;
	private String profileImage; // image url
	private String password;
	private String provider;
	private String providerId;
	private Boolean preferencesSubmitted;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	@Builder.Default
	private List<Friend> friends = new ArrayList<>();
	
	@Builder.Default
	private List<ArtistLike> artistLikes = new ArrayList<>();
	
	@Builder.Default
	private List<Music> musics = new ArrayList<>();
	
}
