package com.min.pjt.member.Mdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.min.pjt.util.Constant;

public class Mdao {
	
	DataSource dataSource;
	
	JdbcTemplate template = null;
	
	public Mdao() {
		// TODO Auto-generated constructor stub
		
		template = Constant.template;
	}

	public void joinMember(final String nickname, final String id,final String password,final String passwordQue,final String passwordAn,
			final String email,final String emailCheck) {
		// TODO Auto-generated method stub
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				
				String sql = "insert into member (nickname,id,password,passwordQue,passwordAn,email,emailCheck) values(?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, nickname);
				pstmt.setString(2, id);
				pstmt.setString(3, password);
				pstmt.setString(4, passwordQue);
				pstmt.setString(5, passwordAn);
				pstmt.setString(6, email);
				pstmt.setString(7, emailCheck);
				return pstmt;
			}
		}) ;
		
		
	}

}
