package kr.or.ddit.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JcommentVo {

	private String com_no;
	private String com_ct;
	private String com_del;
	private String p_no;
	private String userid;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date com_reg_dt;

	public JcommentVo() {}
	
	public JcommentVo(String com_no, String com_ct, Date com_reg_dt, String com_del,
				String p_no, String userid) {
			setCom_no(com_no);
			setCom_ct(com_ct);
			setCom_reg_dt(com_reg_dt);
			setCom_del(com_del);
			setP_no(p_no);
			setUserid(userid);
	}
	
	public String getCom_no() {
		return com_no;
	}

	public void setCom_no(String com_no) {
		this.com_no = com_no;
	}

	public String getCom_ct() {
		return com_ct;
	}

	public void setCom_ct(String com_ct) {
		this.com_ct = com_ct;
	}

	public String getCom_del() {
		return com_del;
	}

	public void setCom_del(String com_del) {
		this.com_del = com_del;
	}

	public String getP_no() {
		return p_no;
	}

	public void setP_no(String p_no) {
		this.p_no = p_no;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getCom_reg_dt() {
		return com_reg_dt;
	}

	public void setCom_reg_dt(Date com_reg_dt) {
		this.com_reg_dt = com_reg_dt;
	}

	@Override
	public String toString() {
		return "JcommentVo [com_no=" + com_no + ", com_ct=" + com_ct + ", com_del=" + com_del + ", p_no=" + p_no
				+ ", userid=" + userid + ", com_reg_dt=" + com_reg_dt + "]";
	}
	
	


}
