package com.min.pjt.member.Mservice;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.min.pjt.member.Mdao.Mdao;

public class MJoinService implements Mservice {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		
		String nickname=request.getParameter("nickname");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String passwordQue=request.getParameter("passwordQue");
		String passwordAn=request.getParameter("passwordAn");
		String email=request.getParameter("email");
		String emailCheck=request.getParameter("emailCheck");
		
		Mdao mdao = new Mdao();
		mdao.joinMember(nickname,id,password,passwordQue,passwordAn,email,emailCheck);
		

	}

}
