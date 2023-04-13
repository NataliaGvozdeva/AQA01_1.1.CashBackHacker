package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void findCashbackHackService(){
        //подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 24567;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 433;

        //сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

}
