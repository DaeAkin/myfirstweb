package com.min.pjt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.min.pjt.dto.BDto;
import com.min.pjt.dto.FreeboardReplyDto;
import com.min.pjt.member.Mdto.Mdto;

public interface BDao {
	
	public ArrayList<BDto> list();
	public ArrayList<BDto> boardlist();
	public void write(String title,String content,String writer);
	public ArrayList<BDto> content_view(int num);
	public void delete(int num);
	public ArrayList<BDto> modify_view(int num);
	public void modify(String title,String content,int num);
	public ArrayList<FreeboardReplyDto> content_replyview(int num);
	public void reply(String replycontent,int num,String writer);
	public void hit(int num);
	public void up(String num);
	
	public ArrayList<Mdto> login(String id);
	public void join(String nickname, String id, String password, String passwordQue, String passwordAn, String email,
			String emailCheck);
	public int getlistTotalPage();
	
	public List<BDto> listAll(int start,int end,String searchOption, String keyword) throws Exception;
	public 
	
	
}
