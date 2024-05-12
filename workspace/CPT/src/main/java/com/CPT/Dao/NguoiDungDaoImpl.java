package com.CPT.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.CPT.DB.DBConnect;
import com.CPT.Entities.NguoiDung;
import com.CPT.Entities.VaiTro;
import com.CPT.Utils.MaHoa;

public class NguoiDungDaoImpl implements NguoiDungDao {

	private Connection conn;

	public NguoiDungDaoImpl(Connection connection) {
		super();
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

//	@Override
//	public NguoiDung login(String eml, String pass) {
//		NguoiDung nds = null;
//		try {
//			
//			String query = "SELECT nguoi_dung.id_nguoi_dung, ten_vai_tro FROM nguoi_dung JOIN vai_tro ON nguoi_dung.id_vai_tro = vai_tro.id_vai_tro WHERE email = ? AND mat_khau =?";
//			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setString(1, eml);
//			ps.setString(2, pass);
//			
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				nds = new NguoiDung();
//				nds.setId(rs.getInt("id_nguoi_dung"));
//				nds.setEmail(rs.getString(eml));
//	            nds.setMatkhau(rs.getString(pass));
//	            String role = rs.getString("ten_vai_tro");
//	            VaiTro vaiTro = new VaiTro();
//	            vaiTro.setTenvaitro(role);
//	            nds.setVaiTro(vaiTro);
//			}
//			rs.close();
//	        ps.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return nds;
//	}

	


	
}
