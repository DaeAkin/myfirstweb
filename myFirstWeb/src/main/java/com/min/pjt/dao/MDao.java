package com.min.pjt.dao;

import java.util.ArrayList;

import com.min.pjt.member.Mdto.Mdto;

public interface MDao {
	
	public ArrayList<Mdto> login(String id);
	public void join(String nickname, String id, String password, String passwordQue, String passwordAn, String email,
			String emailCheck);

}
