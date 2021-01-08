package com.web.web.v1.controller;

import com.web.service.NewsService;
import com.web.web.v1.dto.NewsDto;
import com.web.web.v1.ApiUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(ApiUtil.NEWS)
@CrossOrigin
@RequiredArgsConstructor
@Transactional
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/getAllNews")
    public List<NewsDto> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/getNews/{id}")
    public NewsDto getNewsById(@PathVariable("id") Long id) {
        return newsService.getNewsById(id);
    }
}