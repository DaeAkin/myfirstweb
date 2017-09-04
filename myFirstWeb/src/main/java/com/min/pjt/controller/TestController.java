package com.min.pjt.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.pjt.dao.BDao;

@Controller
public class TestController {

	
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("/list1") 
	public String test(Model model) {
		BDao dao= sqlSession.getMapper(BDao.class);
		System.out.println("Asd");
		return "list";
	}
	
}
