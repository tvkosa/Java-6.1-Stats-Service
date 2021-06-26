package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }
    // Средняя сумма продаж в месяц
    public int averageSumSales(int[] sales) {
        int averageSum = 0;
        for (int sale : sales) {
            averageSum += sale;
        }
        averageSum = averageSum / sales.length;
        return averageSum;
    }
    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int monthMaxSales(int[] sales) {
        int monthMax = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[monthMax]) {
                monthMax = month;
            }
            month = month + 1;
        }
        return monthMax + 1;
    }
    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int monthMinSales(int[] sales) {
        int monthMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[monthMin]) {
                monthMin = month;
            }
            month = month + 1;
        }
        return monthMin + 1;
    }
    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monthSalesBelow(int[] sales) {
        int quantityMonth = 0;
        int averageSum = averageSumSales(sales);
        for (int sale : sales){
            if (sale < averageSum) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
    //Кол-во месяцев, в которых продажи были выше среднего
    public int monthSalesAbove(int[] sales) {
        int quantityMonth = 0;
        int averageSum = averageSumSales(sales);
        for (int sale : sales){
            if (sale > averageSum) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
}