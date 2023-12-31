package ru.practicum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.Create;
import ru.practicum.dto.EndPointHitDto;
import ru.practicum.dto.ViewStatDto;
import ru.practicum.service.EndpointHitService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StatsController {

    private final EndpointHitService endpointHitService;

    @PostMapping("/hit")
    @ResponseStatus(HttpStatus.CREATED)
    public EndPointHitDto create(@RequestBody @Validated({Create.class}) EndPointHitDto endPointHitDto) {

        return endpointHitService.create(endPointHitDto);
    }

    @GetMapping("/stats")
    public List<ViewStatDto> getStats(@RequestParam(value = "start", required = false) String start,
                                      @RequestParam(value = "end", required = false) String end,
                                      @RequestParam(value = "uris", defaultValue = "") List<String> uris,
                                      @RequestParam(value = "unique", defaultValue = "false") Boolean unique) {
        return endpointHitService.getStats(start, end, uris, unique);
    }
}