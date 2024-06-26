package com.CPT.Entities;

public class NguoiDung {
	private int id;
	private String hoten;
	private String email;
	private String sodienthoai;
	private String diachi;
	private String matkhau;
	private int vaitroid;

	public NguoiDung() {
		super();
	}

	public NguoiDung(String hoten, String email, String sodienthoai, String diachi, String matkhau, int vaitroid) {
		super();
		this.hoten = hoten;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
		this.matkhau = matkhau;
		this.vaitroid = vaitroid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public int getVaitroid() {
		return vaitroid;
	}

	public void setVaitroid(int vaitroid) {
		this.vaitroid = vaitroid;
	}

}
