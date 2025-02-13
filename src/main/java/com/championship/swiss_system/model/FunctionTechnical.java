package com.championship.swiss_system.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FunctionTechnical {
    TRAINER("trainer"),
    ASSISTANT("assistant"),
    PHYSICAL_COACH("physical_coach"),
    HEALTH_PROFESSIONAL("health_professional");

    private final String function;
}
