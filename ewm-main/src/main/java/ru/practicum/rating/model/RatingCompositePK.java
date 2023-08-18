package ru.practicum.rating.model;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class RatingCompositePK implements Serializable {
    private Long userId;
    private Long eventId;
}