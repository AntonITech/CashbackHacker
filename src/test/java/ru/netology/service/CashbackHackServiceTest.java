package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testWhenPurchaseEqualThousand() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenPurchaseAboveThousand() {
        int amount = 2000;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenPurchaseAboveThousandOnHundred() {
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenPurchaseBelowThousand() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenPurchaseBelow() {
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenPurchaseEqualZero() {
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}