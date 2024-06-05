package com.CPT.Dao;

import java.util.List;

import com.CPT.Entities.NguoiDung;
import com.CPT.Entities.SanPham;

public interface NguoiDungDao {

	public boolean register(NguoiDung nd);

	public List<NguoiDung> getNguoiDungAll();

	public boolean addNguoiDung(NguoiDung and);

	public NguoiDung getNguoiDungById(int id);

	public boolean editNguoiDung(NguoiDung end);

	public boolean deleteNguoiDung(int id);
	
	public List<NguoiDung> getNguoiDungSearch(String search);
}
