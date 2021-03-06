package com.gyagoo.ex.lec05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lec05")
public class Lec05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lec05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		// 과일 이름 리스트(List)
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("plum");
		fruits.add("potato");
		fruits.add("peach");
		model.addAttribute("fruits", fruits);	// key: fruits
		
		// 회원 정보(List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "임승화");
		map.put("age", 27);
		map.put("hobby", "수면");
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "김바다");
		map.put("age", 4);
		map.put("hobby", "독서");
		users.add(map);
		
		model.addAttribute("users", users);
		
		return "lec05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date today = new Date();
		model.addAttribute("today", today);
		
		return "lec05/ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04() {
		return "lec05/ex04";
	}
	

}
