package com.demoqa.warmup_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SleepinTest {
    Sleepin sleepin = new Sleepin();

    @Test
    void testSleepin() {

        assertTrue(sleepin.sleepIn(false, false));

    }

    @Test
    void testSleepin2() {
        assertFalse(sleepin.sleepIn(true, false));
    }

    @Test
    void shouldReturnTrueWhenVacation() {
        assertTrue(sleepin.sleepIn(true, true));
    }

    @Test
    void shouldReturnTrueWhenVacation2() {
        assertTrue(sleepin.sleepIn(false, true));

    }
}