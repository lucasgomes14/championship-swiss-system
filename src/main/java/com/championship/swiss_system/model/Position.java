package com.championship.swiss_system.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Position {
    OUTSIDE("outside"),
    MIDDLE("middle"),
    OPPOSITE("opposite"),
    LIBERO("libero"),
    SETTER("setter");

    private final String position;
}
