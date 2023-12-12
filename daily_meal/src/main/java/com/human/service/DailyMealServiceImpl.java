package com.human.service;

import static com.human.service.constant.BMRConstant.*;

import javax.inject.Inject;

import org.json.simple.JSONArray;
import org.springframework.stereotype.Service;

import com.human.VO.UserVO;
import com.human.dao.IF_MenuDAO;
import com.human.service.constant.ActivityConstant;

@Service
public class DailyMealServiceImpl implements IF_DailyMealService {
	
	@Inject
	private IF_MenuDAO manuDAO;

	@Override
	public int calculateBMR(UserVO userVO) {
		int BMR = (int) Math.round(
				userVO.getWeight() * WEIGHT.getNumber() 
				+ HEIGHT.getNumber() * userVO.getHeight() 
				- AGE.getNumber() * userVO.getAge());
		if(userVO.isMan()) {
			return (int) (BMR + MAN.getNumber());
		}
		return (int) (BMR - WOMAN.getNumber());
	}

	@Override
	public int calculateCalories(int BMR, int step) {
		return (int) Math.round(
				BMR * ActivityConstant.toActivity(step));
	}

	@Override
	public JSONArray addMeal(int calories, int mealCnt) {
		// TODO: 칼로리와 식사빈도수를 통해 식단을 생성하고 json 형태로 리턴
		// 하루 식사 빈도수에 따라 칼로리 나눔
		// 나눈 칼로리의 1/3이 메인 메뉴의 상한선 : 이때 DB는 100g 기준으로 저장하므로 
		// 메인메뉴의 상한선을 2끼의 경우 300g으로 3끼의 경우 200g으로 계산
		// 즉 2끼인경우 상한이 나눈 칼로리의 1/9 3끼의 경우 1/6
		// 원래 칼로리 기준 : 2끼 ) 1/18 3끼) 1/18
		
		// 메인 메뉴 먼저 가져와서 계산
		
		
		return null;
	}

}
