package com.human.domain;

import java.util.Map;

import org.json.simple.JSONArray;

import com.human.VO.MenuVO;
import com.human.domain.constant.MealConstant;

public class Meal {
	
	private final Map<MealConstant, MenuVO> meal;
	
	public Meal(final Map<MealConstant, MenuVO> meal) {
		this.meal = meal;
	}
	
	public int getCost() {
		// TODO: 식단의 총 금액 리턴
		return 0;
	}
	
	public int getKcal() {
		// TODO: 식단의 총 칼로리 리턴
		return 0;
	}
	
	public JSONArray getMealJson() {
		// TODO: json 형식으로 데이터 폼 만들어 리턴하기
		return null;
	}
}
