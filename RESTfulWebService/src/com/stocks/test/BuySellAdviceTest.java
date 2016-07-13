package com.stocks.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.stocks.model.dao.StocksDao;
import com.stocks.model.dao.impl.StocksDaoImpl;

public class BuySellAdviceTest {

	public static void main(String[] args) {
		BuySellAdviceTest bsa = new BuySellAdviceTest();
		Map<String,BigDecimal> sellStocks = bsa.getSellStocks();

		for(Map.Entry<String, BigDecimal> entry: sellStocks.entrySet()){
			System.out.println(entry.getKey() + "=" + entry.getValue().doubleValue());
		}
		
		String symbol = "URC";
		double lastTradingPrice = 201.9;
		
		if(lastTradingPrice >= sellStocks.get(symbol+"_SELL").doubleValue()){
			System.out.println("Sell "+ symbol+ " now!");
		} else {
			System.out.println("Hold "+ symbol+ "!");
		}
	}

	public Map<String,BigDecimal> getSellStocks(){
		StocksDao sd = new StocksDaoImpl();
		Map<String,BigDecimal> sellMap = sd.getBuySellStocks();
		return sellMap;
	}
}
