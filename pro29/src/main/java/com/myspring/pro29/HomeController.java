package com.myspring.pro29;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.pro29.ex01.TestController;

@Controller
public class HomeController {
	private static Logger logger=  LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "JSONTest";
	}
}
