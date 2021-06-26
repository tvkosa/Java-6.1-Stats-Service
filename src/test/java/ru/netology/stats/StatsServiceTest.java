package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
     void calculateSum() {//Сумма всех продаж
        int expected = 180;
        int actual = service.calculateSum (sales);
        assertEquals(expected, actual);
    }
    // Средняя сумма продаж в месяц
    @Test
    void calculateAverage() {
        int expected = 15;
        int actual = service.averageSumSales(sales);
        assertEquals(expected, actual);
    }
    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    @Test
    void monthMaxSales() {
        int expected = 8;
        int actual = service.monthMaxSales(sales);
        assertEquals(expected, actual);
    }
    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    void monthMinSales() {
         int expected = 9;
         int actual = service.monthMinSales(sales);
         assertEquals(expected, actual);
    }
    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void monthSalesBelow() {
        int expected = 5;
        int actual = service.monthSalesBelow(sales);
        assertEquals(expected, actual);
    }
    //Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void monthSalesAbove() {
        int expected = 5;
        int actual = service.monthSalesAbove(sales);
        assertEquals(expected, actual);
    }
}