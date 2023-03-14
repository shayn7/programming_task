package org.example.enums;

import lombok.Getter;

@Getter
public enum SplitBy {
    WHITE_SPACE("-s"),
    COMA("-c"),
    NEW_LINE("-n");


    private final String option;

    SplitBy(String option) {
        this.option = option;
    }
}
