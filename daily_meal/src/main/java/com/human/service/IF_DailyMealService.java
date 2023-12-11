package com.human.service;

import java.util.List;

import com.human.VO.UserVO;
import com.human.domain.Meal;

public interface IF_DailyMealService {

	public int calculateBMR(UserVO userVO);
	public int calculateCalories(int BMR, int activity);
	public List<Meal> addMeal(int calories, int mealCnt);
	
}
