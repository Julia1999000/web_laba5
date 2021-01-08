package com.web.mapper;

import com.web.entity.News;
import com.web.web.v1.dto.NewsDto;
import org.mapstruct.Mapper;

@Mapper(uses = {ImageMapper.class, GameMapper.class})
public interface NewsMapper {

    NewsDto toDto(News news);

    News toEntity(NewsDto dto);
}
