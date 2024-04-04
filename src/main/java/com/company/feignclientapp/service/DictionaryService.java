package com.company.feignclientapp.service;

import com.company.feignclientapp.client.ToolClient;
import com.company.feignclientapp.model.GoogleTranslateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class DictionaryService {
    private final ToolClient toolClient;

    public String getGoogle(GoogleTranslateDto googleTranslateDto) throws IOException, InterruptedException {
        return toolClient.googleTranslate(googleTranslateDto);
    }




}
