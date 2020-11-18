package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldSuggestOne () {
        assertEquals(service.remain(999),1);
    }

    @Test
    public void shouldSuggestNineHundredNineNine () {
        assertEquals(service.remain(1),999);
    }

    @Test
    public void shouldSuggestZero () {
        assertEquals(service.remain(1000),0);
    }

}