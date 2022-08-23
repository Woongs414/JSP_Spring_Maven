package com.myspring.pro27;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.crypto.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller //log4� logger
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/main.do", method= RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "main";
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Data date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
//				DateFormat.LONG, locale);
//		String formattedDate = dateFormate.formate(date);
//		model.addAllAttributes("serverTime", formattedDate);
//		return "home";
	}
}
