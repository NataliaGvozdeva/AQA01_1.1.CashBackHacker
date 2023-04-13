package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void findValueToHaveCashback(){
        //подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 24567;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 433;

        //сравнение ожидаемого и фактического
        assertEquals(expected,actual);

    }

    @Test
    public void ifAmountEqual1000(){
        //подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 0;

        //сравнение ожидаемого и фактического
        assertEquals(expected,actual);

    }
}
