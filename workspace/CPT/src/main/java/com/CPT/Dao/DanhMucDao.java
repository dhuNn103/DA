package com.CPT.Dao;

import java.util.List;

import com.CPT.Entities.DanhMuc;

public interface DanhMucDao {

	public List<DanhMuc> getDanhMucAll();
	
	public boolean AddDanhMuc(DanhMuc dm);
	
	public DanhMuc getDanhMucById(int id);
	
	public boolean editDanhMuc(DanhMuc dms);
	
	public boolean deleteDanhMuc(int id);
}
