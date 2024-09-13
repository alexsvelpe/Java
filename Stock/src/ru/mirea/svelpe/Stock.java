package ru.mirea.svelpe;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(double previousClosingPrice, String symbol, String name, double currentPrice) {
        this.previousClosingPrice = previousClosingPrice;
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }
}