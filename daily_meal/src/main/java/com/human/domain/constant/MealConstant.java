package com.human.domain.constant;

public enum MealConstant {
	
	RICE("밥"),
	MAIN_MENU("메인메뉴"),
	SIDE_MENU_1("사이드메뉴1"),
	SIDE_MENU_2("사이드메뉴2"),
	SOUP("국"),
	SNACK("간식");
	
	private String menu;
	
	MealConstant(String menu) {
		this.menu = menu;
	}
	
	public String getMenu() {
		return menu;
	}

}
