package com.CPT.Entities;

public class SanPham {
	private int id;
	private int iddanhmuc;
	private String tensanpham;
	private String giacu;
	private String giamoi;
	private String mota;
	private String hinhanh;
	private String ngaytao;
	private String ngaysua;
	private String loaisanpham;
	private String tinhtrang;
	
	public SanPham() {
		super();
	}

	public SanPham(int iddanhmuc, String tensanpham, String giacu, String giamoi, String mota, String hinhanh,
			String ngaytao, String ngaysua, String loaisanpham, String tinhtrang) {
		super();
		this.iddanhmuc = iddanhmuc;
		this.tensanpham = tensanpham;
		this.giacu = giacu;
		this.giamoi = giamoi;
		this.mota = mota;
		this.hinhanh = hinhanh;
		this.ngaytao = ngaytao;
		this.ngaysua = ngaysua;
		this.loaisanpham = loaisanpham;
		this.tinhtrang = tinhtrang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIddanhmuc() {
		return iddanhmuc;
	}

	public void setIddanhmuc(int iddanhmuc) {
		this.iddanhmuc = iddanhmuc;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public String getGiacu() {
		return giacu;
	}

	public void setGiacu(String giacu) {
		this.giacu = giacu;
	}

	public String getGiamoi() {
		return giamoi;
	}

	public void setGiamoi(String giamoi) {
		this.giamoi = giamoi;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}

	public String getNgaysua() {
		return ngaysua;
	}

	public void setNgaysua(String ngaysua) {
		this.ngaysua = ngaysua;
	}
	
	public String getLoaisanpham() {
		return loaisanpham;
	}
	
	public void setLoaisanpham(String loaisanpham) {
		this.loaisanpham = loaisanpham;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}
	
	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
}
