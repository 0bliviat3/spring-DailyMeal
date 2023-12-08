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
		return 0;
	}

}
