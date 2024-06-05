package com.CPT.Entities;

public class HinhAnhPage {
	
	private int idanh;
	private String tenanh;
	private String hinhanh;
	
	public HinhAnhPage() {
		super();
	}

	public HinhAnhPage(String tenanh, String hinhanh) {
		super();
		this.tenanh = tenanh;
		this.hinhanh = hinhanh;
	}

	public int getIdanh() {
		return idanh;
	}

	public void setIdanh(int idanh) {
		this.idanh = idanh;
	}

	public String getTenanh() {
		return tenanh;
	}

	public void setTenanh(String tenanh) {
		this.tenanh = tenanh;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	
	
}
