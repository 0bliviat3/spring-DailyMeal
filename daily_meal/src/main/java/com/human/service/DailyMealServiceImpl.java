package com.human.service;

import org.springframework.stereotype.Service;

import com.human.VO.UserVO;

@Service
public class DailyMealServiceImpl implements IF_DailyMealService{

	@Override
	public int calculateBMR(UserVO userVO) {
		int BMR = (int) Math.round(userVO.getWeight() * 10 + 6.25 * userVO.getHeight() - 5 * userVO.getAge());
		if(userVO.isGender()) { // 남자일 경우
			return BMR + 5;
		}
		return BMR - 161;
	}

	@Override
	public int calculateCalories(int BMR, int activity) {
		// TODO Auto-generated method stub
		double kcal = 0;
		switch(activity) {
			case 0: 
				kcal = BMR * 1.2;
				break;
			case 1:
				kcal = BMR * 1.375;
				break;
			case 2:
				kcal = BMR * 1.55;
				break;
			case 3:
				kcal = BMR * 1.9;
				break;
		}
		kcal = Math.round(kcal);
		return (int)kcal;
	}

}
