package com.min.pjt.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.pjt.dao.BDao;
import com.min.pjt.dto.BDto;
import com.min.pjt.member.Mdto.Mdto;
import com.min.pjt.util.Constant;

@Controller
public class BController {
	

	
	public JdbcTemplate template;
	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@Autowired
	private SqlSession sqlSession;
	@RequestMapping("/home")
	public String home(Model model) { 
		System.out.println("home()");
		BDao dao = sqlSession.getMapper(BDao.class);
		model.addAttribute("freeboardlist",dao.boardlist());
		
		
		
		return "home";	
	}
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		
		BDao dao = sqlSession.getMapper(BDao.class);
		model.addAttribute("list",dao.list());
		ArrayList<BDto> bDtos = dao.list();
		System.out.println(bDtos);
		
		return "list";
	}
	
	@RequestMapping("/write")
	public String wrtie(HttpServletRequest request, Model model,HttpSession session) {
		System.out.println("write()");
		BDao dao = sqlSession.getMapper(BDao.class);
		String writer = (String)session.getAttribute("DBID");
		dao.write(request.getParameter("title"), request.getParameter("content"),writer);
		System.out.println("writer :" + writer);
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		System.out.println("write_view");
		return "write_view";
	}
	

		
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request,Model model){
		System.out.println("content_view()");
		String num = request.getParameter("num");
		BDao dao =sqlSession.getMapper(BDao.class);
		model.addAttribute("content_view",dao.content_view(Integer.parseInt(num)));
		model.addAttribute("content_replyview",dao.content_replyview(Integer.parseInt(num)));
		dao.hit(Integer.parseInt(num));
		return "content_view";
	}
	
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request,Model model) {
		System.out.println("reply()");
		
		String num=request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class);
		dao.reply(request.getParameter("replycontent"),Integer.parseInt(num));
		String str="redirect:content_view?num="+num;
	
		
		return str;
	}
	
	@RequestMapping("/replyandreply")
	public String replyandreply(HttpServletRequest request,Model model) {
		
		return "/content_view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		System.out.println("delete()");
		String num = request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class); 
		dao.delete(Integer.parseInt(num));
	
		return "redirect:list";
	}
	
	@RequestMapping("/modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		System.out.println("modify_view()");
		String num = request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class);
		model.addAttribute("modify_view",dao.modify_view(Integer.parseInt(num)));
		
		
		
		return"modify_view";
		
	}
	
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request,Model model) {
		System.out.println("modify()");
		String num= request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class);
		System.out.println(request.getParameter("title"));
		dao.modify(request.getParameter("title"), request.getParameter("content"),Integer.parseInt(num));
		//DB를 한번더 접속하는 단점이 있음
		//form을 가져오는 방법으로 나중에 바꾸길바람!
		
		return "redirect:list";
	}
	
	@RequestMapping("/joinform")
	public String joinform() {
		System.out.println("joinform()");
		return "joinform";
	}
	
	@RequestMapping("/join") //회원가입처리
	public String join(HttpServletRequest request, Model model) {
		System.out.println("join()");
		BDao dao = sqlSession.getMapper(BDao.class);
		String nickname = request.getParameter("nickname");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String passwordQue = request.getParameter("passwordQue");
		String passwordAn = request.getParameter("passwordAn");
		String email = request.getParameter("email");
		String emailCheck = request.getParameter("emailCheck");
		
		
		dao.join(nickname,id,password,passwordQue,passwordAn,email,emailCheck);
		return "list";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model,HttpSession session) {
		System.out.println("login()");
		boolean loginflag = false;
		BDao dao = sqlSession.getMapper(BDao.class);
		ArrayList<Mdto> mdto=dao.login(request.getParameter("user_id"));
		System.out.println(mdto);
//		String DBID = mdto.get(0).getId().toString();
//		String DBPW = mdto.get(0).getPassword().toString();
//
//	
//		if(DBID.equals(request.getParameter("user_id")) && 
//				DBPW.equals(request.getParameter("user_pw"))) {
//			loginflag = true;
//			model.addAttribute("hassession",loginflag);
//			session.setAttribute("DBID", DBID);
//			session.setMaxInactiveInterval(60*60);
//			return "redirect:home"; 
//		} else {
//			return "Loginfail";
//		}
		return "";
//	
		
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("logout()");
		session.invalidate();
		return "redirect:home";
	}

	
}
