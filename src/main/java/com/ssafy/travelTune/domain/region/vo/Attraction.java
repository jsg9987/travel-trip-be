package com.ssafy.travelTune.domain.region.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
public class Attraction {
	private Long AttractionId;
	private Long sidoId;
	private Long gunguId;
	private Long contentTypeId;
	private Long cat1Id;
	private Long cat2Id;
	private Long cat3Id;
	private Integer contentId;
	private String title;
	private Double latitude;
	private Double longitude;
	private String description;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	@Builder.Default
	private List<Music> musics = new ArrayList<>();
}
