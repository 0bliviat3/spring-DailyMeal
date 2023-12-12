package com.human.domain.constant;

public enum MealConstant {
	
	RICE("rice"),
	MAIN_MENU("main_menu"),
	SIDE_MENU_1("side_menu"),
	SIDE_MENU_2("side_menu"),
	SOUP("soup"),
	SNACK("snack");
	
	private String menu;
	
	MealConstant(String menu) {
		this.menu = menu;
	}
	
	public String getMenu() {
		return menu;
	}

}
