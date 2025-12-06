package com.ssafy.travelTune.domain.music.vo;

import java.time.LocalDateTime;

import com.ssafy.travelTune.domain.artist.vo.Artist;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Music {
	private Long musicId;
	private Long artistId;
	private String spotifyId;
	private String title;
	private String albumImage; // album url
	private String externalUrl;
	private String previewUrl;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	private Artist artist;
	
}
