package com.CPT.Dao;

import java.util.List;

import com.CPT.Entities.SanPham;

public interface SanPhamDao {
	
	public boolean AdSanPham(SanPham sp);
	
	public List<SanPham> getSanPhamAll();
	
	public SanPham getSanPhamById(int id);
	
	public boolean editSanPham(SanPham sp);
	
	public boolean deleteSanPham(int id);
}