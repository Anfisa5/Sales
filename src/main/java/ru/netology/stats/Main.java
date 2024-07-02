package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();
        //набор данных о продажах предприятия по месяцам
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // 1 Сумма всех продаж
        System.out.println(service.allSales(sales));

        // 2 Средняя сумма продаж в месяц
        System.out.println(service.averageSales(sales));

        // 3 номер месяца, в котором осуществлены продажи на максимальную сумму
        System.out.println(service.maxSales(sales));

        // 4 номер месяца, в котором осуществлены продажи на минимальную сумму
        System.out.println(service.minSales(sales));

        // 5 Количество месяцев, в которых продажи были ниже среднего
        System.out.println(service.lowAverage(sales));

        // 6 Количество месяцев, в которых продажи были выше среднего
        System.out.println(service.higtAverage(sales));
    }
}


