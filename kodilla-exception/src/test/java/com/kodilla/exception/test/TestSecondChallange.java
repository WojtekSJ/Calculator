package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSecondChallange {
    @Test
    void testExceptionResult() {
        // given
        ExceptionHandling fileHandling = new ExceptionHandling();
        // when & then

        assertThrows(Exception.class, () -> fileHandling.useSecondChallange(2.0, 1.0));
        assertDoesNotThrow(() -> fileHandling.checkSecondChallange(1.5, 1.0));
        assertThrows(Exception.class, () -> fileHandling.checkSecondChallange(1.5, 1.5));
        assertThrows(Exception.class, () -> fileHandling.checkSecondChallange(2.5, 1.0));
        assertThrows(Exception.class, () -> fileHandling.checkSecondChallange(0.5, 1.0));
    }
}
