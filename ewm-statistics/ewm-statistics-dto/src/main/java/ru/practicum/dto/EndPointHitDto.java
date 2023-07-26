package ru.practicum.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Value
@Builder
@AllArgsConstructor
@Jacksonized
public class EndPointHitDto {
    Long id;

    @NotBlank(message = "app не может быть пустым")
    String app;

    @NotBlank(message = "URI не может быть пустым")
    String uri;

    @NotBlank(message = "ip не может быть пустым")
    String ip;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "timestamp не может быть пустым")
    LocalDateTime timestamp;
}