package com.ofss;

public class Stock {
	private int stockId;
	private String stockName;
	private double sotockPrice;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int stockId, String stockName, double sotockPrice) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.sotockPrice = sotockPrice;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getSotockPrice() {
		return sotockPrice;
	}
	public void setSotockPrice(double sotockPrice) {
		this.sotockPrice = sotockPrice;
	}
	
	
}
