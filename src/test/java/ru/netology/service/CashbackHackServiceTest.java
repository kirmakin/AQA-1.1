package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldSuggestOne() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldSuggestFiveHundred() {
        assertEquals(500, service.remain(1500));
    }

    @Test
    public void shouldSuggestZero() {
        assertEquals(0, service.remain(1000));
    }
}