package com.CPT.Entities;

public class DanhMuc {
	private int id;
	private String tendanhmuc;
	
	
	public DanhMuc() {
		super();
	}
	
	public DanhMuc(int id, String tendanhmuc) {
		super();
		this.id = id;
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
