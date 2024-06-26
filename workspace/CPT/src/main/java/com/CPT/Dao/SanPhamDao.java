package com.CPT.Dao;

import java.util.List;

import com.CPT.Entities.SanPham;

public interface SanPhamDao {
	
	public boolean AdSanPham(SanPham sp);
	
	public List<SanPham> getSanPhamAll();
	
	public SanPham getSanPhamById(int id);
	
	public boolean editSanPham(SanPham sp);
	
	public boolean deleteSanPham(int id);
	
	public List<SanPham> getNewSanPham();
	
	public List<SanPham> getAllSanPham();
	
	public List<SanPham> getAllNewSanPham();
	
	public List<SanPham> getAllSanPham2();
	
	public List<SanPham> getSanPhamSearch(String search);
	
	public List<SanPham> getSearch(String search);
	
}
