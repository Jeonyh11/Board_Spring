package kr.or.ddit.model;

public class PageVo {
	private int page;
	private int pageSize;
	private String board_no;
	
	public PageVo() {}
	
	public PageVo(int page, int pageSize, String board_no) {
		setPage(page);
		setPageSize(pageSize);
		setBoard_no(board_no);
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

	public String getBoard_no() {
		return board_no;
	}

	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}

	@Override
	public String toString() {
		return "PageVo [page=" + page + ", pageSize=" + pageSize + ", board_no=" + board_no + "]";
	}

	
	
}
