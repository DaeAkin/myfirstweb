package com.min.pjt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.min.pjt.dao.BDao;

public class SetPageInfo {

	public Map selectBoardList(Map param) {
		
		Map resultObject = new HashMap();
		ArrayList result = new ArrayList();
		
		BDao dao = null;
		int totalCnt = dao.getlistTotalPage();
		
		
		int searchNo = 10;
		int searchCntPerPage = 10;
		int searchUnitPage = 10;
		
		if(totalCnt > 0) {
			
			PagingUtil.setPageInfo(param, 10); // param에 Page정보 파라미터 정보 put 해주기
			result = dao.selectList(param); // 게시판 목록 data페이징 처리 갯수만큼 가져오기
			
			//dataList와 pageInfo 셋팅 해주고 return 하기
			resultObject.put("result", result);
			resultObject.put("page", PagingUtil.getPageObject(totalCnt, searchNo, searchCntPerPage, searchUnitPage));
	} else {
		resultObject.put("result", result);//빈 값
		resultObject.put("page", PagingUtil.getPageObject(totalCnt, 0));
	}
		
		return resultObject;
	}
}
