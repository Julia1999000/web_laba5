package com.web.mapper;

import com.web.entity.Game;
import com.web.web.v1.dto.GameDto;
import org.mapstruct.Mapper;

@Mapper(uses = ImageMapper.class)
public interface GameMapper {

    GameDto toDto(Game game);

    Game toEntity(GameDto dto);
}
