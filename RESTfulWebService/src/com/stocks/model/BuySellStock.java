package com.stocks.model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "buysellstock")
public class BuySellStock implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String stockSymbol;
	private double buyPrice;
	private double sellPrice;
	private Date createDate;
	public long getId() {
		return id;
	}
	@XmlElement
	public void setId(long id) {
		this.id = id;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	@XmlElement
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	@XmlElement
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	@XmlElement
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Date getCreateDate() {
		return createDate;
	}
	@XmlElement
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
