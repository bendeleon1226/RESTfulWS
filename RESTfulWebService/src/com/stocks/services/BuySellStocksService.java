package com.stocks.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stocks.model.BuySellStock;
import com.stocks.model.dao.StocksDao;
import com.stocks.model.dao.impl.StocksDaoImpl;


@Path("/BuySellStocksService")
public class BuySellStocksService {

	
	StocksDao sd = new StocksDaoImpl();
	
	@GET
	@Path("/priceAlerts")
	@Produces(MediaType.APPLICATION_XML)
	public List<BuySellStock> getPriceAlert(){
		return sd.getPriceAlert("Y", "N");
	}
}
