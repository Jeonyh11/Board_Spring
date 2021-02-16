package kr.or.ddit.model;

public class JfileVo {
	private String filename;
	private String p_no;
	private String f_no;
	private String realfilename;
	
	public JfileVo() {}
	
	public JfileVo(String filename, String p_no, String f_no, String realfilename) {
		setFilename(filename);
		setP_no(p_no);
		setF_no(f_no);
		setRealfilename(realfilename);
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getF_no() {
		return f_no;
	}
	public void setF_no(String f_no) {
		this.f_no = f_no;
	}
	public String getRealfilename() {
		return realfilename;
	}
	public void setRealfilename(String realfilename) {
		this.realfilename = realfilename;
	}
	
	@Override
	public String toString() {
		return "JfileVo [filename=" + filename + ", p_no=" + p_no + ", f_no=" + f_no + ", realfilename=" + realfilename
				+ "]";
	}
	
	

}
