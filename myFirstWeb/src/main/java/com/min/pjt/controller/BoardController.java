//package com.min.pjt.controller;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.min.pjt.board.BoardService;
//import com.min.pjt.dao.BDao;
//import com.min.pjt.dto.BDto;
//import com.min.pjt.service.BoardPager;
//@Controller
//public class BoardController {
//	
//	@Autowired
//	SqlSession sqlSession;
//	
//	BDao dao;
//	BoardService boardService;
//	
//	//@RequestParam(defaultValue="") ==> 기본값 할당 : 현재 페이지를 1로 초기화
//	@RequestMapping("list")
//	public ModelAndView list(@RequestParam(defaultValue="title") String searchOption,
//							@RequestParam(defaultValue="") String keyword,
//							@RequestParam(defaultValue="1") int curPage) throws Exception {
//		
//		// 레코드의 갯수 계산
//		BDao dao = sqlSession.getMapper(BDao.class);
//		int count = dao.getlistTotalPage();
//		System.out.println(count);
//		
//		//페이지 나누기 관련 처리
//		BoardPager boardPager = new BoardPager(count, curPage);
//		int start = boardPager.getPageBegin();
//		int end = boardPager.getPageEnd();
//		
//		List<BDto> list = dao.listAll(start, end, searchOption, keyword);
//		
//		// 데이터를 맵에 저장
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("list", list); // list
//		map.put("count", count); // 레코드의 갯수
//		map.put("searchOption", searchOption); // 검색 옵션
//		map.put("keyword", keyword);
//		map.put("boardPager", boardPager);
//		
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("map",map); // 맵에 저장된 데이터를 mav에 저장
//		mav.setViewName("list1");
//		
//		
//		
//		
//		
//		
//		
//		return mav;
//	}
//}
