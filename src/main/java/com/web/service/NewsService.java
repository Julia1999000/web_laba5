package com.web.service;

import com.web.web.v1.dto.NewsDto;

import java.util.List;

public interface NewsService {
    List<NewsDto> getAllNews();
    NewsDto getNewsById(Long id);
}
