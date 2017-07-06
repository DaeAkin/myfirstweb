package com.min.pjt.dto;

import java.sql.Timestamp;

public class BDto {
	
	int num;
	String title;
	String content;
	String writer;
	String nickname;
	Timestamp date;
	int hit;
	int group;
	int step;
	int indent;
	
	
	public BDto() {
		// TODO Auto-generated constructor stub
	}
	//이 생성자는 왜 필요 할까?
	
	public BDto(int num,String title,String content,String writer,String nickname,Timestamp date,int hit,int group,int step,int indent) {
		// TODO Auto-generated constructor stub
		this.num=num;
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.nickname=nickname;
		this.date=date;
		this.hit=hit;
		this.group=group;
		this.step=step;
		this.indent=indent;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}
	
	


	

}
