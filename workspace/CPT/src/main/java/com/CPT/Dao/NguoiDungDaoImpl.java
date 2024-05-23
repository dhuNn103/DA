package com.CPT.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CPT.Entities.NguoiDung;


public class NguoiDungDaoImpl implements NguoiDungDao {

	private Connection conn;

	public NguoiDungDaoImpl(Connection connection) {
		this.conn = connection;
	}

	@Override
	public boolean register(NguoiDung nd) {
		boolean f = false;
		try {
			String sql = "insert into nguoi_dung(ho_ten, email, so_dien_thoai, dia_chi, mat_khau, id_vai_tro) values(?,?,?,?,?,3)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nd.getHoten());
			ps.setString(2, nd.getEmail());
			ps.setString(3, nd.getSodienthoai());
			ps.setString(4, nd.getDiachi());
			ps.setString(5, nd.getMatkhau());

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
	public List<NguoiDung> getNguoiDungAll() {
		List<NguoiDung> ndList = new ArrayList<NguoiDung>();
		NguoiDung nd = null;
		try {
			String sql = "select * from nguoi_dung";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				nd = new NguoiDung();
				nd.setId(rs.getInt(1));
				nd.setHoten(rs.getString(2));
				nd.setEmail(rs.getString(3));
				nd.setSodienthoai(rs.getString(4));
				nd.setDiachi(rs.getString(5));
				nd.setMatkhau(rs.getString(6));
				nd.setVaitroid(rs.getInt(7));
				ndList.add(nd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ndList;
	}

	@Override
	public boolean addNguoiDung(NguoiDung nds) {
		boolean f = false;
		try {
			String sql = "insert into nguoi_dung(ho_ten, email, so_dien_thoai, dia_chi, mat_khau, id_vai_tro) values(?,?,?,?,?,3)";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, nds.getHoten());
			pst.setString(2, nds.getEmail());
			pst.setString(3, nds.getSodienthoai());
			pst.setString(4, nds.getDiachi());
			pst.setString(5, nds.getMatkhau());


			int i = pst.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public NguoiDung getNguoiDungById(int id) {
		NguoiDung nguoiDung = null;
		String sql = "SELECT * FROM nguoi_dung WHERE id_nguoi_dung = ?";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				nguoiDung = new NguoiDung();
				nguoiDung.setId(rs.getInt("id_nguoi_dung"));
				nguoiDung.setHoten(rs.getString("ho_ten"));
				nguoiDung.setEmail(rs.getString("email"));
				nguoiDung.setSodienthoai(rs.getString("so_dien_thoai"));
				nguoiDung.setDiachi(rs.getString("dia_chi"));
				nguoiDung.setMatkhau(rs.getString("mat_khau"));
				nguoiDung.setVaitroid(rs.getInt("id_vai_tro"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nguoiDung;
	}

	@Override
	public boolean updateNguoiDung(NguoiDung nds) {
		boolean success = false;
		String sql = "UPDATE nguoi_dung SET ho_ten = ?, email = ?, so_dien_thoai = ?, dia_chi = ?, mat_khau = ?, id_vai_tro = ? WHERE id_nguoi_dung = ?";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nds.getHoten());
			ps.setString(2, nds.getEmail());
			ps.setString(3, nds.getSodienthoai());
			ps.setString(4, nds.getDiachi());
			ps.setString(5, nds.getMatkhau());
			ps.setInt(6, nds.getVaitroid());
			ps.setInt(7, nds.getId());

			int rowsAffected = ps.executeUpdate();
			success = rowsAffected == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean deleteNguoiDung(int id) {
		boolean success = false;
		String sql = "DELETE FROM nguoi_dung WHERE id_nguoi_dung = ?";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);

			int rowsAffected = ps.executeUpdate();
			success = rowsAffected == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}
