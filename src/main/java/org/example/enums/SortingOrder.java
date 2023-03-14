package org.example.enums;

import lombok.Getter;

@Getter
public enum SortingOrder {

    ASCENDING("-a"),
    DESCENDING("-d");

    private final String option;

    SortingOrder(String option) {
        this.option = option;
    }
}
