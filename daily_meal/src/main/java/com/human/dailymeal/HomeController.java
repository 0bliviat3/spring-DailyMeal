package com.human.dailymeal;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.MenuVO;
import com.human.VO.UserVO;
import com.human.domain.Meal;
import com.human.domain.constant.MealConstant;
import com.human.service.IF_DailyMealService;



@Controller
public class HomeController {
	
	@Inject
	private IF_DailyMealService dailyMealService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

		return "home"; 
	}
	
	@RequestMapping(value = "/inputInfo", method = RequestMethod.POST)
	public String BMRDetails(Locale locale, Model model,
			@ModelAttribute("") UserVO userVO, int exerciseCnt, int mealCnt) {
		// TODO: 객체 주입 확인용 메소드... 수정 필요
		int BMR = dailyMealService.calculateBMR(userVO);
		int calories = dailyMealService.calculateCalories(BMR, exerciseCnt);
		
		
		System.out.println(BMR);
		System.out.println(calories);
		System.out.println(exerciseCnt + "/"+mealCnt);
		return  "home";
	}
	
	
	
	@RequestMapping(value = "/aa", method = RequestMethod.GET)
	public String mealTest(Locale locale, Model model) {
		// TODO: 객체 주입 확인용 메소드... 수정 필요
		Map<MealConstant, MenuVO> map = new HashMap<>();
		MenuVO m = new MenuVO();
		m.setMenu_name("제육");
		map.put(MealConstant.RICE,m);
		Meal meal = new Meal(map);
		List<Meal> mealList = new ArrayList<>();
		mealList.add(meal);
		mealList.add(meal);
		model.addAttribute("mealList",mealList);
		
		return  "testView";
	}
	
	
	
	
}
