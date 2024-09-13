package ru.mirea.svelpe;

public class TestStock {
    public static void main(String[] args) {
        Stock Stock1 = new Stock(281.5, "SBER", "ПАО Сбербанк", 282.87);
        System.out.println("Процент изменения стоимости акций равен: " + Stock1.getChangePercent() + "%");
    }
}