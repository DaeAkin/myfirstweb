package com.min.pjt.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.min.pjt.dto.BDto;
import com.min.pjt.util.Constant;

public class Dao {

	DataSource dataSource;

	JdbcTemplate template = null;

	public Dao() {
		// TODO Auto-generated constructor stub
		template = Constant.template;
	}

	public ArrayList<BDto> list() {
		// TODO Auto-generated method stub
		ArrayList<BDto> dtos = null;
		
		String sql = "select num,title,content,writer,date,hit,groups,step,indent from freeboard order by groups desc,step asc";
		
		dtos=(ArrayList<BDto>)template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	
		
	
		return dtos;
	}

	public void write(String title, String content) {
		// TODO Auto-generated method stub
		
		
	}

}
