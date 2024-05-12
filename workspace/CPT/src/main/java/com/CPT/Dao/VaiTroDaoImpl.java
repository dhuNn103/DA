//package com.CPT.Dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//import com.CPT.Entities.VaiTro;
//
//public class VaiTroDaoImpl implements VaiTroDao{
//	private Connection conn;
//
//	
//	public VaiTroDaoImpl() {
//		super();
//		
//	}
//
//
//	@Override
//	public boolean login(VaiTro vt) {
//		boolean f = false;
//		try {
//			String sql = "select * from vai_tro";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, vt.getTenvaitro());
//			
//			int i = ps.executeUpdate();
//			if (i == 1) {
//				f = true;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return f;
//	}
//
//}
