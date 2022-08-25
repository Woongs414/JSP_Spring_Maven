package com.myspring.pro29.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test/*") //1차 매핑
public class TestController {
	static Logger logger=  LoggerFactory.getLogger(TestController.class);
	@RequestMapping(value="/info", method = RequestMethod.POST) //2차 매핑
	
//@RequestBody를 사용함으로써 New예약어 없이 자동으로 MemverVO주소형태를 가진 참조변수vo객체 저장할수있다
	public void modify(@RequestBody MemberVO vo) {
		logger.info(vo.toString());
	}

}
