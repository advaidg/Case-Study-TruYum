package com.cognizant.truyum.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<MenuItem> menuItemList;
	private double total;
	

	public Cart(List<MenuItem> menuItemList) {
		super();
		this.menuItemList = menuItemList;
		this.total = total;
	}
	
	

	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}
	public double getTotal() {
		return total;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Cart [menuItemList=" + menuItemList + ", total=" + total + "]";
	}
	
	
}
