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
			while (rs.next()) {
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
		boolean f = false;
		try {
			String sql = "insert into danh_muc (ten_danh_muc)values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, dm.getTendanhmuc());
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public DanhMuc getDanhMucById(int id) {
		DanhMuc dm = null;
		try {
			String sql = "select * from danh_muc where id_danh_muc = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dm = new DanhMuc();
				dm.setId(rs.getInt("id_danh_muc"));
				dm.setTendanhmuc(rs.getString("ten_danh_muc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dm;
	}

	@Override
	public boolean editDanhMuc(DanhMuc dms) {
		boolean f = false;
		try {
			String sql = "update danh_muc set ten_danh_muc = ? where id_danh_muc = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dms.getTendanhmuc());
			ps.setInt(2, dms.getId());
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public boolean deleteDanhMuc(int id) {
		boolean f = false;
		try {
			String sql = "delete from danh_muc where id_danh_muc = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public List<DanhMuc> getsearch(String search) {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		DanhMuc dm = null;
		try {
			String sql = "select * from danh_muc where ten_danh_muc like ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" +search+ "%");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dm =  new DanhMuc();
				dm.setId(rs.getInt(1));
				dm.setTendanhmuc(rs.getString(2));
				
				list.add(dm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
