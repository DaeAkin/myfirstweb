package com.min.pjt.dto;

import java.sql.Date;

public class FreeboardReplyDto {
	int num;
	int replynum;
	int groups;
	int indent;
	int step;
	String writer;
	String replycontent;
	Date datetime;
	int agreement;
	int opposition;
	
	public FreeboardReplyDto() {
		// TODO Auto-generated constructor stub
	}
	//이 생성자는 왜 필요 할까?
	
	public FreeboardReplyDto(int num,int replynum,int groups,int indent
			,int step,String replycontent, Date datetime, int agreement
			,int opposition,String writer) {
		this.num=num;
		this.replynum=replynum;
		this.groups=groups;
		this.indent=indent;
		this.step=step;
		this.replycontent=replycontent;
		this.datetime=datetime;
		this.agreement=agreement;
		this.opposition=opposition;
		this.writer =writer;
		// TODO Auto-generated constructor stub
	}
	
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getReplynum() {
		return replynum;
	}
	public void setReplynum(int replynum) {
		this.replynum = replynum;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public String getReplycontent() {
		return replycontent;
	}
	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getAgreement() {
		return agreement;
	}
	public void setAgreement(int agreement) {
		this.agreement = agreement;
	}
	public int getOpposition() {
		return opposition;
	}
	public void setOpposition(int opposition) {
		this.opposition = opposition;
	}
	
	

}
