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
//	//@RequestParam(defaultValue="") ==> �⺻�� �Ҵ� : ���� �������� 1�� �ʱ�ȭ
//	@RequestMapping("list")
//	public ModelAndView list(@RequestParam(defaultValue="title") String searchOption,
//							@RequestParam(defaultValue="") String keyword,
//							@RequestParam(defaultValue="1") int curPage) throws Exception {
//		
//		// ���ڵ��� ���� ���
//		BDao dao = sqlSession.getMapper(BDao.class);
//		int count = dao.getlistTotalPage();
//		System.out.println(count);
//		
//		//������ ������ ���� ó��
//		BoardPager boardPager = new BoardPager(count, curPage);
//		int start = boardPager.getPageBegin();
//		int end = boardPager.getPageEnd();
//		
//		List<BDto> list = dao.listAll(start, end, searchOption, keyword);
//		
//		// �����͸� �ʿ� ����
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("list", list); // list
//		map.put("count", count); // ���ڵ��� ����
//		map.put("searchOption", searchOption); // �˻� �ɼ�
//		map.put("keyword", keyword);
//		map.put("boardPager", boardPager);
//		
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("map",map); // �ʿ� ����� �����͸� mav�� ����
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
