package com.min.pjt.service;

public class BoardPager {
	//�������� �Խù� ��
	public static final int PAGE_SCALE = 10;
	//ȭ��� ������ ��
	public static final int BLOCK_SCALE = 10;
	
	private int curPage; //���� ������
	private int prePage; //���� ������
	private int nextPage; //���� ������
	private int totalpage; // ��ü ������ ����
	private int totalBlock; // ��ü ������ ��� ����
	private int curBlock; // ���� ������ ���
	private int preBlock; // ���� ������ ���
	private int nextBlock; // ���� ������ ���
	//WHERE rn BETWEEN #{start} AND #{end}
	private int pageBegin; // #{start};
	private int pageEnd; // #{end}
	//[����] blockBegin -> 41 42 43 44 45 46 47 48 49 50 [����]
	private int blockBegin; // ���� ������ ����� ���۹�ȣ
	//[����] 41 42 43 44 45 46 47 48 49 50 <- blockEnd [����]
	private int blockEnd;
	
	//BoardPager(���ڵ� ����, ���� ������ ��ȣ)
	public BoardPager(int count, int curpage) {
		curBlock = 1; // ���� ������ ��� ��ȣ
		this.curPage = curpage; // ���� ������ ����
		setTotalpage(count); //��ü ������ ���� ���
		setPageRange();
		setTotalBlock();
		
	}
	
	public void setBlockRange() {
		//���� �������� ��� ° ������ ��Ͽ� ���ϴ��� ���
		curBlock = (int)Math.ceil((curPage-1) / BLOCK_SCALE)+1;
		//���� ������ ����� ����, �� ��ȣ ���
		blockBegin = (curBlock-1)*BLOCK_SCALE+1;
		//������ ����� ����ȣ
		blockEnd = blockBegin+BLOCK_SCALE-1;
		//������ ����� ������ �ʰ������� �ʰ�� ���
		if(blockEnd > totalpage) blockEnd = totalpage;
		//������ ������ �� �̵��� ������ ��ȣ
		prePage = (curPage == 1)? 1:(curBlock-1)*BLOCK_SCALE;
		//������ ������ �� �̵��� ������ ��ȣ
		nextPage = curBlock > totalBlock ? (curBlock * BLOCK_SCALE) : (curBlock * BLOCK_SCALE)+1;
		// ������ �������� ������ �ʰ����� �ʵ��� ó��
		if(nextPage >= totalpage) nextPage = totalpage;
	}
	
	public void setPageRange() {
		//WHERE rn BETWEEN #{start} AND #{end}
		//���۹�ȣ = (����������-1)*�������� �Խù��� +1
		pageBegin = (curPage-1)*PAGE_SCALE+1;
		//����ȣ = ���۹�ȣ+�������� �Խù��� -1
		pageEnd = pageBegin+PAGE_SCALE-1;
		
	}
	
	
	
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int count) {
		//Math.ceil(�Ǽ�) �ø� ó��
		this.totalpage = (int)Math.ceil(count*1.0/PAGE_SCALE);
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	// �������� ����� ���� ���(�� 100��������� 10���� ���)
	public void setTotalBlock() {
		
		//��ü ������ ���� / 10
		// 91/10 =>9.1 => 10��
		totalBlock = (int)Math.ceil(totalpage/BLOCK_SCALE);
	}
	public int getCurBlock() {
		return curBlock;
	}
	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}
	public int getPreBlock() {
		return preBlock;
	}
	public void setPreBlock(int preBlock) {
		this.preBlock = preBlock;
	}
	public int getNextBlock() {
		return nextBlock;
	}
	public void setNextBlock(int nextBlock) {
		this.nextBlock = nextBlock;
	}
	public int getPageBegin() {
		return pageBegin;
	}
	public void setPageBegin(int pageBegin) {
		this.pageBegin = pageBegin;
	}
	public int getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}
	public int getBlockBegin() {
		return blockBegin;
	}
	public void setBlockBegin(int blockBegin) {
		this.blockBegin = blockBegin;
	}
	public int getBlockEnd() {
		return blockEnd;
	}
	public void setBlockEnd(int blockEnd) {
		this.blockEnd = blockEnd;
	}
	
	
	
	
	

}
