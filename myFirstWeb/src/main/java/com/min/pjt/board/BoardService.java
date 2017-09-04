package com.min.pjt.board;

import java.util.List;

import com.min.pjt.dto.BDto;

public interface BoardService {

	public List<BDto> listAll(int start, int end, String searchOption, String keyword) throws Exception;
}
