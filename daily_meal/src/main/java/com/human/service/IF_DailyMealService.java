package com.human.service;

import com.human.VO.UserVO;

public interface IF_DailyMealService {

	public int calculateBMR(UserVO userVO);
	public int calculateCalories(int BMR, int activity);
	
}
