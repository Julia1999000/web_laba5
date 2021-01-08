package com.web.mapper;

import com.web.entity.Info;
import com.web.web.v1.dto.InfoDto;
import org.mapstruct.Mapper;

@Mapper(uses = ImageMapper.class)
public interface InfoMapper {

    InfoDto toDto(Info info);

    Info toEntity(InfoDto dto);
}
