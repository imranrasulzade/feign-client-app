package com.company.feignclientapp.model;

import lombok.Data;

@Data
public class GoogleTranslateDto {
    private String text;
    private String source;
    private String target;
}
