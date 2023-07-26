package ru.practicum.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ViewStatDto {
    String app;
    String uri;
    Long hits;
}