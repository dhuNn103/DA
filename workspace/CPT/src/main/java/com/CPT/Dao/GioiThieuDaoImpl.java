package com.CPT.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.CPT.Entities.GioiThieu;
import com.CPT.Entities.SanPham;

public class GioiThieuDaoImpl implements GioiThieuDao {

	private Connection conn;

	public GioiThieuDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public List<GioiThieu> getAll() {
		List<GioiThieu> listAll = new ArrayList<>();
		String sql = "select gioi_thieu.id_gioi_thieu, tieu_de.id_tieu_de, tieu_de.ten_tieu_de, gioi_thieu.noi_dung, gioi_thieu.hinh_anh from tieu_de " + "join gioi_thieu on tieu_de.id_tieu_de = gioi_thieu.id_tieu_de order by gioi_thieu.id_gioi_thieu desc";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					GioiThieu gt = new GioiThieu();
					gt.setId(rs.getInt("id_gioi_thieu"));
					gt.setIdTieude(rs.getInt("id_tieu_de"));
					gt.setTenTieude(rs.getString("ten_tieu_de"));
					gt.setNoidung(rs.getString("noi_dung"));
					gt.setHinh_anh(rs.getString("hinh_anh"));

					listAll.add(gt);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listAll;
	}

	@Override
	public boolean add(GioiThieu gt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(GioiThieu gt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stu
		return false;
	}

	@Override
	public List<GioiThieu> getsearch(String search) {
		List<GioiThieu> gtlist = new ArrayList<>();
		String sql = "select gioi_thieu.id_gioi_thieu, tieu_de.id_tieu_de, tieu_de.ten_tieu_de, gioi_thieu.noi_dung, gioi_thieu.hinh_anh from tieu_de " + "join gioi_thieu on tieu_de.id_tieu_de = gioi_thieu.id_tieu_de where tieu_de.ten_tieu_de like ? or gioi_thieu.noi_dung like ? or gioi_thieu.hinh_anh like ?";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, "%" + search + "%");
			ps.setString(2, "%" + search + "%");
			ps.setString(3, "%" + search + "%");

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					GioiThieu gt = new GioiThieu();
					gt.setId(rs.getInt("id_gioi_thieu"));
					gt.setIdTieude(rs.getInt("id_tieu_de"));
					gt.setTenTieude(rs.getString("ten_tieu_de"));
					gt.setNoidung(rs.getString("noi_dung"));
					gt.setHinh_anh(rs.getString("hinh_anh"));

					gtlist.add(gt);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gtlist;
	}

	@Override
	public List<GioiThieu> getTieuDe1() {
		List<GioiThieu> listAll = new ArrayList<>();
		GioiThieu gt = null;
		try {
			String sql = "select gt.id_gioi_thieu, td.id_tieu_de, td.ten_tieu_de, gt.noi_dung, gt.hinh_anh from tieu_de td join gioi_thieu gt on td.id_tieu_de = gt.id_tieu_de where td.ten_tieu_de = ? order by gt.id_gioi_thieu desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Giới Thiệu");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				gt = new GioiThieu();
				gt.setId(rs.getInt("id_gioi_thieu"));
				gt.setIdTieude(rs.getInt("id_tieu_de"));
				gt.setTenTieude(rs.getString("ten_tieu_de"));
				gt.setNoidung(rs.getString("noi_dung"));
				gt.setHinh_anh(rs.getString("hinh_anh"));

				listAll.add(gt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listAll;
	}

	@Override
	public List<GioiThieu> getTieuDe2() {
		List<GioiThieu> listAll = new ArrayList<>();
		GioiThieu gt = null;
		try {
			String sql = "select gt.id_gioi_thieu, td.id_tieu_de, td.ten_tieu_de, gt.noi_dung, gt.hinh_anh from tieu_de td join gioi_thieu gt on td.id_tieu_de = gt.id_tieu_de where td.ten_tieu_de = ? order by gt.id_gioi_thieu desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Đội Ngũ Nhân Viên");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				gt = new GioiThieu();
				gt.setId(rs.getInt("id_gioi_thieu"));
				gt.setIdTieude(rs.getInt("id_tieu_de"));
				gt.setTenTieude(rs.getString("ten_tieu_de"));
				gt.setNoidung(rs.getString("noi_dung"));
				gt.setHinh_anh(rs.getString("hinh_anh"));

				listAll.add(gt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listAll;
	}

	@Override
	public List<GioiThieu> getTieuDe3() {
		List<GioiThieu> listAll = new ArrayList<>();
		GioiThieu gt = null;
		try {
			String sql = "select gt.id_gioi_thieu, td.id_tieu_de, td.ten_tieu_de, gt.noi_dung, gt.hinh_anh from tieu_de td join gioi_thieu gt on td.id_tieu_de = gt.id_tieu_de where td.ten_tieu_de = ? order by gt.id_gioi_thieu desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Hoạt Động Văn Hóa");

			ResultSet rs = ps.executeQuery();
			int i = 1;
			while (rs.next() && i <= 8) {
				gt = new GioiThieu();
				gt.setId(rs.getInt("id_gioi_thieu"));
				gt.setIdTieude(rs.getInt("id_tieu_de"));
				gt.setTenTieude(rs.getString("ten_tieu_de"));
				gt.setNoidung(rs.getString("noi_dung"));
				gt.setHinh_anh(rs.getString("hinh_anh"));

				listAll.add(gt);
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listAll;
	}
}
