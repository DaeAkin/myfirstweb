package com.min.pjt.member.Mdto;

public class Mdto {

	int number;
	String nickname;
	String id;
	String password;
	String passwordQue;
	String passwordAn;
	String email;
	char emailCheck;
	
	
	public Mdto() {
		// TODO Auto-generated constructor stub
	}
	
	public Mdto(int number,String nickname,String id,String password,String passwordQue
			,String passwordAn,String email,char emailCheck) {
		this.number=number;
		this.nickname=nickname;
		this.id=id;
		this.password =password;
		this.passwordQue=passwordQue;
		this.passwordAn=passwordAn;
		this.email=email;
		this.emailCheck=emailCheck;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordQue() {
		return passwordQue;
	}
	public void setPasswordQue(String passwordQue) {
		this.passwordQue = passwordQue;
	}
	public String getPasswordAn() {
		return passwordAn;
	}
	public void setPasswordAn(String passwordAn) {
		this.passwordAn = passwordAn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getEmailCheck() {
		return emailCheck;
	}
	public void setEmailCheck(char emailCheck) {
		this.emailCheck = emailCheck;
	}
	
	
	
}
