package com.human.VO;

import com.google.gson.annotations.Expose;

public class MenuVO {
	
	@Expose(serialize = false, deserialize = false)
	private int menu_no;
	
	@Expose(serialize = true, deserialize = true)
	private String menu_name;
	
	@Expose(serialize = true, deserialize = true)
	private int menu_kcal;
	
	@Expose(serialize = true, deserialize = true)
	private int menu_cost;
	
	
	public int getMenu_no() {
		return menu_no;
	}
	
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	
	public String getMenu_name() {
		return menu_name;
	}
	
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	
	public int getMenu_kcal() {
		return menu_kcal;
	}
	
	public void setMenu_kcal(int menu_kcal) {
		this.menu_kcal = menu_kcal;
	}
	
	public int getMenu_cost() {
		return menu_cost;
	}
	
	public void setMenu_cost(int menu_cost) {
		this.menu_cost = menu_cost;
	}
}
