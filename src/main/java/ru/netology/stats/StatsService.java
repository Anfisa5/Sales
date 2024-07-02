package ru.netology.stats;

public class StatsService {

    // 1 Сумма всех продаж
    public long allSales(long[] sales) {
        long sum = 0;
        // цикл for each для прохождения всего массива
        for (long sale : sales) {
            //суммирование каждого элемента массива
            sum = sum + sale;
        }
        return sum;
    }

    // 2 Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {

        // сумма всех продаж за период
        long total = allSales(sales);

        return total / sales.length;

    }

    // 3 номер месяца, в котором осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 4 номер месяца, в котором осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5 Количество месяцев, в которых продажи были ниже среднего
    public int lowAverage(long[] sales) {

        // заводим переменную для расчета средняя сумма продаж в месяц
        long average = averageSales(sales);
        int counter = 0;

        // цикл for each для прохождения всего массива
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    // 6 Количество месяцев, в которых продажи были выше среднего
    public int higtAverage(long[] sales) {

        // заводим переменную для расчета средняя сумма продаж в месяц
        long average = averageSales(sales);
        int counter = 0;

        // цикл for each для прохождения всего массива
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
