package kr.or.ddit.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserVo {

	public String userid;
	public String usernm;
	public String pass;
	public String alias;
	public String addr1;
	public String addr2;
	public String zipcode;
	public String filename;
	public String realfilename;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date reg_dt;
	
	
	public UserVo() {}
	
	public UserVo(String userid,String usernm, String pass, Date reg_dt, String alias,
			String addr1, String addr2, String zipcode, String filename, String realfilename ) {
		
		setUserid(userid);
		setUsernm(usernm);
		setPass(pass);
		setReg_dt(reg_dt);
		setAlias(userid);
		setAddr1(addr1);
		setAddr2(addr2);
		setZipcode(zipcode);
		setFilename(filename);
		setRealfilename(realfilename);
		
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getRealfilename() {
		return realfilename;
	}

	public void setRealfilename(String realfilename) {
		this.realfilename = realfilename;
	}

	public Date getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	@Override
	public String toString() {
		return "UserVo [userid=" + userid + ", usernm=" + usernm + ", pass=" + pass + ", alias=" + alias + ", addr1="
				+ addr1 + ", addr2=" + addr2 + ", zipcode=" + zipcode + ", filename=" + filename + ", realfilename="
				+ realfilename + ", reg_dt=" + reg_dt + "]";
	}
	
	
	
}
