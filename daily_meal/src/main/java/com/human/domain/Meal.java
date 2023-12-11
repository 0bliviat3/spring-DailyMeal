package com.human.domain;

import java.util.Map;

import com.human.VO.MenuVO;
import com.human.domain.constant.MealConstant;

public class Meal {
	
	private final Map<MealConstant, MenuVO> meal;
	
	public Meal(final Map<MealConstant, MenuVO> meal) {
		this.meal = meal;
	}
	
	public MenuVO getName() {
		return meal.get(MealConstant.RICE);
	}
}
