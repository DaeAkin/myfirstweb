package com.min.pjt.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.pjt.dto.BDto;
import com.min.pjt.dto.FreeboardReplyDto;
import com.min.pjt.member.Mdto.Mdto;
import com.min.pjt.util.Constant;
@Repository
public class Dao implements BDao{
	
	JdbcTemplate template;
	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public ArrayList<BDto> list() {
		// TODO Auto-generated method stub
		BDao dao = sqlSession.getMapper(BDao.class);
		return dao.list();
	}

	@Override
	public ArrayList<BDto> boardlist() {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public void write(String title, String content, String writer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BDto> content_view(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BDto> modify_view(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(String title, String content, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<FreeboardReplyDto> content_replyview(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reply(String replycontent, int num, String writer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hit(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up(String num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Mdto> login(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void join(String nickname, String id, String password, String passwordQue, String passwordAn, String email,
			String emailCheck) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getlistTotalPage() {
		BDao dao = sqlSession.getMapper(BDao.class);
		return dao.getlistTotalPage();
	}
	
	
	
	
	
	
}