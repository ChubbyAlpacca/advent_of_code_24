package org.aoc.service;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    private final Day1 day1;

    Day1Test(Day1 day1) {
        this.day1 = day1;
    }

    @org.junit.jupiter.api.Test
    void calculateDifference() {
        String path = "src/test/resources/day1TestInput.txt";

        day1.calculateDifference(path);
    }
}