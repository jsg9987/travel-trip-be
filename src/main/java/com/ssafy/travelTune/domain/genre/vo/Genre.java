package com.ssafy.travelTune.domain.genre.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
public class Genre {
	
	private Long genreId;
	private String name;
	
	private LocalDateTime createdAt; 
	private LocalDateTime modifiedAt; 
	
	@Builder.Default
	private List<Artist> artists = new ArrayList<>();
}
