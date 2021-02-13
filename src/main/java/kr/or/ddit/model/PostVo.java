package kr.or.ddit.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PostVo {
	private String p_no;
	private String p_title;
	private String p_ct;
	private String p_re_ct;
	private Date p_re_reg_dt;
	private String p_del;
	private String userid;
	private String p_re_no;
	private String board_no;
	
	public PostVo() {}
	
	public PostVo(String p_no, String p_title, String p_ct, String p_re_ct, Date p_re_reg_dt,
			String p_del, String userid, String p_re_no, String board_no) {
		setP_no(p_no);
		setP_title(p_title);
		setP_ct(p_ct);
		setP_re_ct(p_re_ct);
		setP_re_reg_dt(p_re_reg_dt);
		setP_del(p_del);
		setUserid(userid);
		setP_re_no(p_re_no);
		setBoard_no(board_no);
		
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date p_reg_dt;

	public String getP_no() {
		return p_no;
	}

	public void setP_no(String p_no) {
		this.p_no = p_no;
	}

	public String getP_title() {
		return p_title;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}

	public String getP_ct() {
		return p_ct;
	}

	public void setP_ct(String p_ct) {
		this.p_ct = p_ct;
	}

	public String getP_re_ct() {
		return p_re_ct;
	}

	public void setP_re_ct(String p_re_ct) {
		this.p_re_ct = p_re_ct;
	}

	public Date getP_re_reg_dt() {
		return p_re_reg_dt;
	}

	public void setP_re_reg_dt(Date p_re_reg_dt) {
		this.p_re_reg_dt = p_re_reg_dt;
	}

	public String getP_del() {
		return p_del;
	}

	public void setP_del(String p_del) {
		this.p_del = p_del;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getP_re_no() {
		return p_re_no;
	}

	public void setP_re_no(String p_re_no) {
		this.p_re_no = p_re_no;
	}

	public String getBoard_no() {
		return board_no;
	}

	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}

	public Date getP_reg_dt() {
		return p_reg_dt;
	}

	public void setP_reg_dt(Date p_reg_dt) {
		this.p_reg_dt = p_reg_dt;
	}

	@Override
	public String toString() {
		return "PostVo [p_no=" + p_no + ", p_title=" + p_title + ", p_ct=" + p_ct + ", p_re_ct=" + p_re_ct
				+ ", p_re_reg_dt=" + p_re_reg_dt + ", p_del=" + p_del + ", userid=" + userid + ", p_re_no=" + p_re_no
				+ ", board_no=" + board_no + ", p_reg_dt=" + p_reg_dt + "]";
	}
	
	
	
}
