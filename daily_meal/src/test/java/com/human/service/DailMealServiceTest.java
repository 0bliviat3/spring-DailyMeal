package com.human.service;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;

import com.human.VO.UserVO;

public class DailMealServiceTest {
	
	@Inject
	IF_DailyMealService dailymealService;
	
	// TODO: 다음의 테스트가 통과할수 있도록 로직 작성
	
	@Test
	@DisplayName("사용자의 정보로 BMR계산후 리턴")
	@CsvSource(value = {"175:75:26:true:1719", "160:48:23:false:1204", "159:43:22:false:1153"}, delimiter = ':')
	void calculateBMRByUserInfo(double height, double weight, int age, boolean gender, int BMR) {
		UserVO userVO = new UserVO();
		userVO.setWeight(weight);
		userVO.setHeight(height);
		userVO.setAge(age);
		userVO.setGender(gender);
		
		assertThat(dailymealService.calculateBMR(userVO)).isEqualTo(BMR);
	}
	
	@Test
	@DisplayName("사용자의 BMR정보와 운동계수로 일일 칼로리소모량 계산후 리턴")
	@CsvSource(value = {"1719:2:2664", "1204:0:1445", "1153:1:1585"}, delimiter = ':')
	void calculateCaloriesByUserBMRAndActivity(int BMR, int activity, int calories) {
		 assertThat(dailymealService.calculateCalories(BMR, activity)).isEqualTo(calories);
	}

}
