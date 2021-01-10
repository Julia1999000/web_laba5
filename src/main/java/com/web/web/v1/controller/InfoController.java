package com.web.web.v1.controller;

import com.web.service.InfoService;
import com.web.web.v1.dto.InfoDto;
import com.web.web.v1.ApiUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(ApiUtil.INFO)
@RequiredArgsConstructor
@CrossOrigin
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/getInfo")
    public List<InfoDto> getInfo() {
        //return infoService.getInfo();
        return Collections.singletonList(infoService.getInfo());
    }
}
