package ru.netology.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void CashbackHackService_1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackService_2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackService_3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackService_4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackService_5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 9999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
