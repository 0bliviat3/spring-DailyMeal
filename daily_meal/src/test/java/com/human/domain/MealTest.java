package com.human.domain;

import static com.human.domain.constant.MealConstant.MAIN_MENU;
import static com.human.domain.constant.MealConstant.RICE;
import static com.human.domain.constant.MealConstant.SIDE_MENU_1;
import static com.human.domain.constant.MealConstant.SIDE_MENU_2;
import static com.human.domain.constant.MealConstant.SNACK;
import static com.human.domain.constant.MealConstant.SOUP;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileReader;
import java.io.Reader;
import java.util.EnumMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.human.VO.MenuVO;
import com.human.domain.constant.MealConstant;

public class MealTest {
	
	private Meal meal;
	
	@BeforeEach
	void setMeal() {
		Map<MealConstant, MenuVO> testData = new EnumMap<>(MealConstant.class);
		
		// TODO: 테스트 데이터 임의 생성
		MenuVO rice = new MenuVO();
		MenuVO mainMenu = new MenuVO();
		MenuVO sideMenu1 = new MenuVO();
		MenuVO sideMenu2 = new MenuVO();
		MenuVO soup = new MenuVO();
		MenuVO snack = new MenuVO();
		
		rice.setMenu_name("쌀밥");
		rice.setMenu_cost(1000);
		rice.setMenu_kcal(286);
		
		mainMenu.setMenu_name("제육볶음");
		mainMenu.setMenu_cost(10000);
		mainMenu.setMenu_kcal(382);
		
		sideMenu1.setMenu_name("단무지");
		sideMenu1.setMenu_cost(1300);
		sideMenu1.setMenu_kcal(26);
		
		sideMenu2.setMenu_name("배추김치");
		sideMenu2.setMenu_cost(1800);
		sideMenu2.setMenu_kcal(21);
		
		soup.setMenu_name("오징어무국");
		soup.setMenu_cost(1100);
		soup.setMenu_kcal(142);
		
		snack.setMenu_name("피크닉");
		snack.setMenu_cost(500);
		snack.setMenu_kcal(70);
		
		testData.put(RICE, rice);
		testData.put(MAIN_MENU, mainMenu);
		testData.put(SIDE_MENU_1, sideMenu1);
		testData.put(SIDE_MENU_2, sideMenu2);
		testData.put(SOUP, soup);
		testData.put(SNACK, snack);
		
		meal = new Meal(testData);
	}
	
	@Test
	void getCostByTestData() {
		assertThat(meal.getCost()).isEqualTo(15700); // TODO: 테스트 데이터 생성
	}
	
	@Test
	void getKcalByTestData() {
		assertThat(meal.getKcal()).isEqualTo(927); // TODO: 테스트 데이터 생성
	}
	
	@Test
	void getMealJson() throws Exception {
		String path = System.getProperty("user.dir") + "\\..\\docs\\meal.json";
		Reader reader = new FileReader(path);
		JSONParser parser = new JSONParser();
		JSONArray mealJson = (JSONArray) parser.parse(reader);
		assertThat(meal.getMealJson().toString()).isEqualTo(mealJson.toString());
	}

}
