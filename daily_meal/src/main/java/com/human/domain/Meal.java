package com.human.domain;

import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.human.VO.MenuVO;
import com.human.domain.constant.MealConstant;

public class Meal {
	private static final String TYPE = "menu_type";
	private static final String INFO = "menu_info";
	private final Map<MealConstant, MenuVO> meal;

	public Meal(final Map<MealConstant, MenuVO> meal) {
		this.meal = meal;
	}

	public int getCost() {
		int sum = 0;
		for (MenuVO mvo : meal.values()) {
			sum += mvo.getMenu_cost();
		}
		return sum;
	}

	public int getKcal() {
		int sum = 0;
		for (MenuVO mvo : meal.values()) {
			sum += mvo.getMenu_kcal();
		}
		return sum;
	}

	@SuppressWarnings("unchecked")
	public JSONArray getMealJson() throws ParseException {
		JSONArray mealJson = new JSONArray();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		JSONParser parser = new JSONParser();
		for (MealConstant mealconstant : meal.keySet()) {
			JSONObject menuJson = new JSONObject();
			menuJson.put(TYPE, mealconstant.getMenu());
			String jsonStr = gson.toJson(meal.get(mealconstant));
			JSONObject jsonObj = (JSONObject) parser.parse(jsonStr);
			menuJson.put(INFO, jsonObj);
			mealJson.add(menuJson);
		}
		return mealJson;
	}
}
