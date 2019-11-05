package com.gx.shop.domain;



public class Shop {

	private Integer sid;
	private String sname;
	private String sdate;
	
	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate + "]";
	}




	
}
