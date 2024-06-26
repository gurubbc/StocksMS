package com.ofss;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	Stock st1=new Stock(1, "ORCL", 123);
	Stock st2=new Stock(2, "IBM", 234);
	Stock st3=new Stock(3, "INFY", 345);
	Stock st4=new Stock(4, "WIPRO", 567);
	Stock st5=new Stock(5, "TCS", 787);
	Stock st6=new Stock(6, "CTS", 9292);
	ArrayList<Stock> allStocks=new ArrayList(Arrays.asList(st1,st2,st3,st4,st5,st6));
	
	@RequestMapping(value="/stocks", method=RequestMethod.GET)
	public ArrayList<Stock> listAllStocks() {
		return allStocks;
	}
	
	@RequestMapping(value="/stocks/{stockId}", method=RequestMethod.GET)
	public Stock getAStock(@PathVariable("stockId") int stockId1) {
		for (Stock s:allStocks) {
			if (s.getStockId()==stockId1) 
				return s;
		}
		return null;
	}
}
