package com.human.service;

import static com.human.service.constant.BMRConstant.AGE;
import static com.human.service.constant.BMRConstant.HEIGHT;
import static com.human.service.constant.BMRConstant.MAN;
import static com.human.service.constant.BMRConstant.WEIGHT;
import static com.human.service.constant.BMRConstant.WOMAN;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.VO.UserVO;
import com.human.dao.IF_MenuDAO;
import com.human.domain.Meal;
import com.human.service.constant.ActivityConstant;

@Service
public class DailyMealServiceImpl implements IF_DailyMealService {

	@Inject
	IF_MenuDAO menuDAO;
	
	
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
	public List<Meal> addMeal(int calories, int mealCnt) {
		// TODO Auto-generated method stub
		int onceCalories = calories/mealCnt;
		// 1. 메인메뉴 랜던 선택, 칼로리 = 칼로리 - 메인메뉴칼로리
		// 2. 밥 선택, 칼로리 = 칼로리 - 밥칼로리 .... 서브12메뉴, 국 //필요에 맞게 간식까지....
		
		
		
		
		return null;
	}

	

}
