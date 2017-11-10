package com.pojo;

public class Goods {
	
	private Integer id;
	private String goodsName;
	private Integer status;
	private Integer district;
	private Integer counts;
	private double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getCounts() {
		return counts;
	}
	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", status="
				+ status + ", district=" + district + ", counts=" + counts
				+ "]";
	}
	
	
	
}
