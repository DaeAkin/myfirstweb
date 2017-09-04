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
			
			PagingUtil.setPageInfo(param, 10); // param�� Page���� �Ķ���� ���� put ���ֱ�
			result = dao.selectList(param); // �Խ��� ��� data����¡ ó�� ������ŭ ��������
			
			//dataList�� pageInfo ���� ���ְ� return �ϱ�
			resultObject.put("result", result);
			resultObject.put("page", PagingUtil.getPageObject(totalCnt, searchNo, searchCntPerPage, searchUnitPage));
	} else {
		resultObject.put("result", result);//�� ��
		resultObject.put("page", PagingUtil.getPageObject(totalCnt, 0));
	}
		
		return resultObject;
	}
}
