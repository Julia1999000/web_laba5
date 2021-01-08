package com.web.service.impl;

import com.web.entity.News;
import com.web.mapper.NewsMapper;
import com.web.repository.NewsRepository;
import com.web.service.NewsService;
import com.web.web.v1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    private final NewsMapper newsMapper;

    @Override
    public List<NewsDto> getAllNews() {
        return newsRepository.findAll()
                .stream().map(newsMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public NewsDto getNewsById(Long id) {
        News res = newsRepository.getOne(id);

        return newsMapper.toDto(res);
    }
}
