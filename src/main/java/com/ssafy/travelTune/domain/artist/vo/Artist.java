package com.ssafy.travelTune.domain.artist.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.travelTune.domain.genre.vo.Genre;
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
public class Artist {
	private Long artistId;
	private Long genreId;
	private String spotifyId;
	private String name;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	@Builder.Default
	private List<Genre> genre = new ArrayList<>(); // 연결테이블 건너뛰고 바로 담기
	
	@Builder.Default
	private List<Music> musics = new ArrayList<>();
}
