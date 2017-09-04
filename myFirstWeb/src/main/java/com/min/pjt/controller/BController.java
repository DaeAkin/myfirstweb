package com.min.pjt.controller;


import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.min.pjt.dao.BDao;
import com.min.pjt.dao.Dao;
import com.min.pjt.member.Mdto.Mdto;
import com.min.pjt.util.Constant;

import javassist.compiler.ast.NewExpr;

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
		Dao dao2 = new Dao();
		

		
		
		
		return "home";    	
	}
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		BDao dao = sqlSession.getMapper(BDao.class);

		model.addAttribute("list",dao.list());
	
		
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
		BDao dao = sqlSession.getMapper(BDao.class);
		return "write_view";
	}
	

		
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request,Model model){
		System.out.println("content_view()");
		String num = request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class);
		model.addAttribute("content_view",dao.content_view(Integer.parseInt(num)));
		model.addAttribute("content_replyview",dao.content_replyview(Integer.parseInt(num)));
		dao.hit(Integer.parseInt(num));
		return "content_view";
	}
	
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request,Model model,HttpSession session) {
		System.out.println("reply()");
		
		String num=request.getParameter("num");
		BDao dao = sqlSession.getMapper(BDao.class);
		dao.reply(request.getParameter("replycontent"),Integer.parseInt(num),(String)session.getAttribute("DBID"));
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
		
		String nickname = request.getParameter("nickname");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String passwordQue = request.getParameter("passwordQue");
		String passwordAn = request.getParameter("passwordAn");
		String email = request.getParameter("email");
		String emailCheck = request.getParameter("emailCheck");
		
		BDao dao = sqlSession.getMapper(BDao.class);
		dao.join(nickname,id,password,passwordQue,passwordAn,email,emailCheck);
		return "list";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model,HttpSession session) {
		System.out.println("login()");
		boolean loginflag = false;
		BDao dao = sqlSession.getMapper(BDao.class);
		System.out.println(request.getParameter("user_id"));
		ArrayList<Mdto> mdto=dao.login(request.getParameter("user_id"));
		System.out.println(mdto);
		String DBID = mdto.get(0).getId().toString();
		String DBPW = mdto.get(0).getPassword().toString();
		String DBNick = mdto.get(0).getNickname().toString();

	
		if(DBID.equals(request.getParameter("user_id")) && 
				DBPW.equals(request.getParameter("user_pw"))) {
			loginflag = true;
			model.addAttribute("hassession",loginflag);
			session.setAttribute("DBID", DBID);
			session.setAttribute("DBNick", DBNick);
			session.setMaxInactiveInterval(60*60);
			return "redirect:home"; 
		} else {
			return "Loginfail";
		}
		
//	
		
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("logout()");
		session.invalidate();
		return "redirect:home";
	}
	
	@RequestMapping("/memberModify")
	public String memberModify(HttpSession session) {
		System.out.println("memberModify()");
		
		String id=(String) session.getAttribute("DBID");
		System.out.println("ID =" + id);
		
		
		
		
		return "";
	}
	//추천 눌렀을 때
	@RequestMapping("/up") 
	public String up(HttpServletRequest request) {
		System.out.println("up()");
		BDao dao = sqlSession.getMapper(BDao.class);
		String num = request.getParameter("num");
		System.out.println("num : " + num);
		dao.up(request.getParameter("replynum"));
		System.out.println("replynum :" + request.getParameter("replynum"));
		String str = "redirect:content_view?num="+num;
		return str;
	}
	
	//반대 눌렀을 때
	@RequestMapping("/down") 
	public String down() {
		
		return "";
	}
	
	//파일업로드
	@RequestMapping(value="/fileUpload")
	public Map fileUpload(HttpServletRequest request,HttpServletResponse response) {
		//파일에 저장될 path 설정
		String path="c://aaa";
		Map returnObject = new HashedMap();
		
		try {
			//MultipartHttpServletRequest 생성
			MultipartHttpServletRequest mhsr =(MultipartHttpServletRequest)request;
			Iterator iter = mhsr.getFileNames();
			
			MultipartFile mfile = null;
			String fieldName= "";
			List resultList = new ArrayList();
			
			//디렉토리가 없다면 생성
			File dir= new File(path);
			if (!dir.isDirectory()) {
				dir.mkdirs(); // 디렉토리가 없으면 새로만든다.
			}
			
			// 값이 나올때까지
			while(iter.hasNext()) {
				fieldName = (String)iter.next(); // 내용을 가져와서
				mfile = mhsr.getFile(fieldName);
				String origName;
				
				origName = new String(mfile.getOriginalFilename().getBytes("8859_1"), "UTF-8"); //한글깨짐 방지
				
				//파일명이 없다면
				if("".equals(origName)) {
					continue;
				}
				
				//파일 명 변경(uuid로 암호화)
				String ext = origName.substring(origName.lastIndexOf('.')); // 확장자
				String saveFileName = getUuid() + ext;
				
				//설정한 path에 파일저장
				File serverFile = new File(path + File.separator + saveFileName);
				mfile.transferTo(serverFile);
				
				HashMap<String, Object> file = new HashMap<String,Object>();
				file.put("origName", origName);
				file.put("sfile", serverFile);
				resultList.add(file);
			}
			
			returnObject.put("files", resultList);
			returnObject.put("params", mhsr.getParameterMap());
			
			
			
			
			
		}catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		return null;
	}
	
	//uuid 생성
	public static String getUuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
