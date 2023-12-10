package com.human.service;

import static com.human.service.constant.BMRConstant.*;

import org.springframework.stereotype.Service;

import com.human.VO.UserVO;
import com.human.service.constant.ActivityConstant;

@Service
public class DailyMealServiceImpl implements IF_DailyMealService {

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

}
