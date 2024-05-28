package com.CPT.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.CPT.Entities.DanhMuc;

public class DanhMucDaoImpl implements DanhMucDao {

	private Connection conn;

	public DanhMucDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public List<DanhMuc> getDanhMucAll() {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		DanhMuc dm = null;
		try {
			String sql = "select * from danh_muc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dm = new DanhMuc();
				dm.setId(rs.getInt(1));
				dm.setTendanhmuc(rs.getString(2));
				
				list.add(dm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean AddDanhMuc(DanhMuc dm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DanhMuc getDanhMucById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editDanhMuc(DanhMuc dms) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDanhMuc(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}