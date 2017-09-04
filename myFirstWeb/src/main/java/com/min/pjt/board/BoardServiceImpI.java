package com.min.pjt.board;

import java.util.List;

import javax.inject.Inject;

import com.min.pjt.dao.BDao;
import com.min.pjt.dto.BDto;

public class BoardServiceImpI implements BoardService {
	
	@Inject
	BDao BDao;

	@Override
	public List<BDto> listAll(int start, int end, String searchOption, String keyword) throws Exception {
//		// �˻��ɼ�,Ű���� �� ����
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("searchOption", searchOption);
//		map.put("keyword", keyword);
//		// BETWEEN #{start}, #{end}�� �Էµ� ���� �ʿ�
//		map.put("start", start);
//		map.put("end", end);
//		return SqlSession.class
		return BDao.listAll(start, end, searchOption, keyword);
	}

}
