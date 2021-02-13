package kr.or.ddit.model;

public class BoardVo {
	private String board_no;
	private String board_nm;
	private String board_st;
	
	public BoardVo () {}
	
	public BoardVo(String board_no, String board_nm, String board_st){
		setBoard_no(board_no);
		setBoard_nm(board_nm);
		setBoard_st(board_st);
	}
	
	
	public String getBoard_no() {
		return board_no;
	}

	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}

	public String getBoard_nm() {
		return board_nm;
	}
	public void setBoard_nm(String board_nm) {
		this.board_nm = board_nm;
	}
	public String getBoard_st() {
		return board_st;
	}
	public void setBoard_st(String board_st) {
		this.board_st = board_st;
	}
	@Override
	public String toString() {
		return "boardVo [board_vo=" + board_no + ", board_nm=" + board_nm + ", board_st=" + board_st + "]";
	}
	
	

}
