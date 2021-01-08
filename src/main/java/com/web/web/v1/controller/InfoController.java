package com.web.web.v1.controller;

import com.web.service.InfoService;
import com.web.web.v1.dto.InfoDto;
import com.web.web.v1.ApiUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiUtil.INFO)
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/getInfo")
    public InfoDto getInfo() {
        return infoService.getInfo();
    }
}
