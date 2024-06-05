package com.CPT.Dao;

import java.util.List;

import com.CPT.Entities.HinhAnhPage;

public interface HinhAnhPageDao {

	public List<HinhAnhPage> getAllHinhAnhPages();

	public HinhAnhPage getAnhPageById(int id);

	public boolean editAnh(HinhAnhPage hap);

}
