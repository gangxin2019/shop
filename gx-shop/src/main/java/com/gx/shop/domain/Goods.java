package com.gx.shop.domain;

public class Goods extends Shop{

	private Integer gid;
	private String gname;
	private int[] gids;
	
	
	public int[] getGids() {
		return gids;
	}
	public void setGids(int[] gids) {
		this.gids = gids;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + "]";
	}
	
	
}
