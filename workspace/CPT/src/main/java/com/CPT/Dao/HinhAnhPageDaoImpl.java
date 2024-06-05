package com.CPT.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.CPT.Entities.HinhAnhPage;

public class HinhAnhPageDaoImpl implements HinhAnhPageDao {

	private Connection conn;

	public HinhAnhPageDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public List<HinhAnhPage> getAllHinhAnhPages() {
		List<HinhAnhPage> list = new ArrayList<HinhAnhPage>();
		HinhAnhPage img = null;
		try {
			String sql = "select * from hinh_anh_page";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				img = new HinhAnhPage();
				img.setIdanh(rs.getInt(1));
				img.setTenanh(rs.getString(2));
				img.setHinhanh(rs.getString(3));

				list.add(img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public HinhAnhPage getAnhPageById(int id) {
		HinhAnhPage img = null;
		try {
			String sql = "select * from hinh_anh_page where id_anh_page = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				img = new HinhAnhPage();
				img.setIdanh(rs.getInt("id_anh_page"));
				img.setTenanh(rs.getString("ten_anh"));
				img.setHinhanh(rs.getString("hinh_anh"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return img;
	}

	@Override
	public boolean editAnh(HinhAnhPage hap) {
		boolean f = false;
		try {
			String sql = "update hinh_anh_page set ten_anh = ?, hinh_anh = ? where id_anh_page = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, hap.getTenanh());
			ps.setString(2, hap.getHinhanh());
			ps.setInt(3, hap.getIdanh());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
