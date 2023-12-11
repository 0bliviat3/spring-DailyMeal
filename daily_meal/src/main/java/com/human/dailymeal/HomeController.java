package com.human.dailymeal;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.UserVO;
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
	
	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String BMRDetails(Locale locale, Model model,
			@ModelAttribute("") UserVO userVO) {
		// TODO: 객체 주입 확인용 메소드... 수정 필요
		int BMR = dailyMealService.calculateBMR(userVO);
		System.out.println(BMR);
		System.out.println(dailyMealService.calculateCalories(BMR, 1));
		return  "home";
	}
	
}
