package com.stocks.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.stocks.model.*;
import com.stocks.model.dao.StocksDao;
import com.stocks.model.dao.impl.StocksDaoImpl;

import java.util.List;
import java.util.ArrayList;

public class AllStocks extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		StocksDao ss = new StocksDaoImpl();
		List<Stock> stocks = ss.getAllStocks();
		//out.println("Top Most Active Stocks In The Last 20 Trading Days!<br>");		
		//for(Stock s: stocks){
		//	out.println("<br><br>Stock Symbol: " + s.getStockSymbol());
		//	out.println("<br>Stock Frequency: " + s.getFrequency());
		//}
		request.setAttribute("allStocks",stocks);
		RequestDispatcher view = request.getRequestDispatcher("AllStocks.jsp");
		view.forward(request,response);
	}
}