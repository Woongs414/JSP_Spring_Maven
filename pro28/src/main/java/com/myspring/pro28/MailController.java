package com.myspring.pro28;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MailController {
	@Autowired //의존성 주입을 자동으로 실행해준다.
	private MailService mailService;
	
	@RequestMapping(value="/sendMail.do", method=RequestMethod.GET)
	public void sendSimpleMail(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		mailService.sendMail("sungwoong414@naver.com", "테스트 메일", "안녕 난 너야");
		mailService.sendPreConfiguredMail("테스트 메일입니다");
		out.print("메일을 보냈습니다.");
		
	}
}
