package ru.practicum.dto;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
@Builder
public class ViewStatDto {
    @NotBlank(message = "app не может быть пустым")
    String app;

    @NotBlank(message = "URI не может быть пустым")
    String uri;

    @NotNull(message = "hits не может быть пустым")
    Long hits;
}