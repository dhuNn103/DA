package com.CPT.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.CPT.Entities.NguoiDung;
import com.CPT.Entities.SanPham;

public class SanPhamDaoImpl implements SanPhamDao {

	private Connection conn;

	public SanPhamDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean AdSanPham(SanPham sp) {
		boolean f = false;
		try {
			String sql = "insert into san_pham( id_danh_muc, ten_san_pham, gia_cu, gia_moi, mo_ta, ngay_tao, ngay_sua, hinh_anh) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, sp.getIddanhmuc());
			ps.setString(2, sp.getTensanpham());
			ps.setString(3, sp.getGiacu());
			ps.setString(4, sp.getGiamoi());
			ps.setString(5, sp.getMota());
			ps.setString(6, sp.getNgaytao());
			ps.setString(7, sp.getNgaysua());
			ps.setString(8, sp.getHinhanh());

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
	public List<SanPham> getSanPhamAll() {
		List<SanPham> spList = new ArrayList<SanPham>();
		SanPham sp = null;
		try {
			String sql = "select * from san_pham";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				sp = new SanPham();
				sp.setId(resultSet.getInt(1));
				sp.setIddanhmuc(resultSet.getInt(2));
				sp.setTensanpham(resultSet.getString(3));
				sp.setGiacu(resultSet.getString(4));
				sp.setGiamoi(resultSet.getString(5));
				sp.setMota(resultSet.getString(6));
				sp.setNgaytao(resultSet.getString(7));
				sp.setNgaysua(resultSet.getString(8));
				sp.setHinhanh(resultSet.getString(9));
				spList.add(sp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return spList;

	}

	@Override
	public SanPham getSanPhamById(int id) {
		SanPham sp = null;
		try {
			String sql = "select * from san_pham where id_san_pham = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sp = new SanPham();
				sp.setId(rs.getInt("id_san_pham"));
				sp.setIddanhmuc(rs.getInt("id_danh_muc"));
				sp.setTensanpham(rs.getString("ten_san_pham"));
				sp.setGiacu(rs.getString("gia_cu"));
				sp.setGiamoi(rs.getString("gia_moi"));
				sp.setMota(rs.getString("mo_ta"));
				sp.setNgaytao(rs.getString("ngay_tao"));
				sp.setNgaysua(rs.getString("ngay_sua"));
				sp.setHinhanh(rs.getString("hinh_anh"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sp;
	}

	@Override
	public boolean editSanPham(SanPham sp) {
		boolean f = false;
		try {
			String sql = "update san_pham set id_danh_muc = ?, ten_san_pham = ?, gia_cu = ?, gia_moi = ?, mo_ta =?, ngay_tao=?, ngay_sua=?, hinh_anh = ? where id_san_pham = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sp.getIddanhmuc());
			ps.setString(2, sp.getTensanpham());
			ps.setString(3, sp.getGiacu());
			ps.setString(4, sp.getGiamoi());
			ps.setString(5, sp.getMota());
			ps.setString(6, sp.getNgaytao());
			ps.setString(7, sp.getNgaysua());
			ps.setString(8, sp.getHinhanh());
			ps.setInt(9, sp.getId());

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
	public boolean deleteSanPham(int id) {
		boolean f = false;
		try {
			String sql = "delete from san_pham where id_san_pham = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}