package ru.practicum.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@AllArgsConstructor
@Jacksonized
public class ViewStatDto {
    String app;
    String uri;
    Long hits;
}