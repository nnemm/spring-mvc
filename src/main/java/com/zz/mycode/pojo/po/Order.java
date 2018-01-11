package com.zz.mycode.pojo.po;

public class Order {
	
	private Integer id;
	private String code;
	private Double money;

	public Order(Integer id, String code, Double money) {
		super();
		this.id = id;
		this.code = code;
		this.money = money;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	
}
