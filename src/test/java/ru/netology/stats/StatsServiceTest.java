package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    //  1 Сумма всех продаж
    public void testSum() {

        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.allSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // 2 Средняя сумма продаж в месяц
    public void testAverage() {

        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // 3 номер месяца, в котором осуществлены продажи на максимальную сумму
    public void testMonthmaxsales() {

        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //  4 номер месяца, в котором осуществлены продажи на минимальную сумму
    public void testMonthminsales() {
        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // 5 Количество месяцев, в которых продажи были ниже среднего
    public void testLowaverage() {

        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.lowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // 6 Количество месяцев, в которых продажи были выше среднего
    public void testHigtaverage() {

        StatsService service = new StatsService();

        //создаем массив продаж (набор данных о продажах предприятия по месяцам)
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.higtAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
