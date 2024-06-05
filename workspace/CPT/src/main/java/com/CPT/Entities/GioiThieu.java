package com.CPT.Entities;

public class GioiThieu {

	private int id;
	private int idtieude;
	private String tenTieude;
	private String noidung;
	private String hinhanh;
	
	public GioiThieu() {
		super();
		
	}

	public GioiThieu(int idtieude, String tenTieude, String noidung, String hinhanh) {
		super();
		this.idtieude = idtieude;
		this.tenTieude = tenTieude;
		this.noidung = noidung;
		this.hinhanh = hinhanh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTieude() {
		return idtieude;
	}

	public void setIdTieude(int idtieude) {
		this.idtieude = idtieude;
	}

	public String getTenTieude() {
		return tenTieude;
	}

	public void setTenTieude(String tenTieude) {
		this.tenTieude = tenTieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinh_anh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	
	
}
