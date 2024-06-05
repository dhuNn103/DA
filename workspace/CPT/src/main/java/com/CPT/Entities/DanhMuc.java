package com.CPT.Entities;

public class DanhMuc {
	private int id;
	private String tendanhmuc;
	
	
	public DanhMuc() {
		super();
	}
	
	public DanhMuc(String tendanhmuc) {
		super();
		this.tendanhmuc = tendanhmuc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTendanhmuc() {
		return tendanhmuc;
	}

	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	
	
}
