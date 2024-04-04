package com.company.feignclientapp.controller;


import com.company.feignclientapp.model.GoogleTranslateDto;
import com.company.feignclientapp.service.DictionaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionary")
public class DictionaryController {
    private final DictionaryService dictionaryService;

    @PostMapping("/google-web-client")
    public String getGoogle(@RequestBody GoogleTranslateDto googleTranslateDto) throws IOException, InterruptedException {
        return dictionaryService.getGoogle(googleTranslateDto);
    }


}
