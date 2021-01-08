package com.web.service.impl;

import com.web.entity.Info;
import com.web.mapper.InfoMapper;
import com.web.repository.InfoRepository;
import com.web.service.InfoService;
import com.web.web.v1.dto.InfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;

    private final InfoMapper infoMapper;

    @Override
    public InfoDto getInfo() {
        List<Info> res = infoRepository.findAll();
        if (!res.isEmpty()) {
            Info info = res.get(0);

            return infoMapper.toDto(info);

        } else
            throw new RuntimeException("Info is not exists");
    }
}
