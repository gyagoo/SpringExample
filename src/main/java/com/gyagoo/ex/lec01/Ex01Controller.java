package com.gyagoo.ex.lec01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lec01/ex01")	// 공통되는 url 작성
public class Ex01Controller {
	
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		return "Spring 을 통한 첫 번째 response";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> printMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		
		return map;
	}
}
