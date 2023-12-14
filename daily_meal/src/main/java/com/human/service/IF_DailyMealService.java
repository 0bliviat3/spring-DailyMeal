package com.human.service;

import org.json.simple.JSONArray;

import com.human.VO.UserVO;

public interface IF_DailyMealService {

	public int calculateBMR(UserVO userVO);
	public int calculateCalories(int BMR, int activity);
	public JSONArray addMeal(int calories, int mealCnt);
	
}
