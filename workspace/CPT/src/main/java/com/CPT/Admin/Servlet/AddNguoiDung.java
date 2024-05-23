package com.CPT.Admin.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.NguoiDungDaoImpl;
import com.CPT.Entities.NguoiDung;
import com.CPT.Utils.MaHoa;

@WebServlet("/addNguoiDung")
public class AddNguoiDung extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();

		try {
			String hoten = req.getParameter("ten");
			String email = req.getParameter("emails");
			String sodienthoai = req.getParameter("phone");
			String diachi = req.getParameter("diachi");
			String matkhau = req.getParameter("passworod");
			matkhau = MaHoa.toSha1(matkhau);
			int idvaitro = Integer.parseInt(req.getParameter("idvt"));

			NguoiDung n = new NguoiDung();
			n.setHoten(hoten);
			n.setEmail(email);
			n.setSodienthoai(sodienthoai);
			n.setDiachi(diachi);
			n.setMatkhau(matkhau);
			n.setVaitroid(idvaitro);

			if (hoten.isEmpty() || email.isEmpty() || sodienthoai.isEmpty() || diachi.isEmpty() || matkhau.isEmpty()) {
				session.setAttribute("status", "failed");
				session.setAttribute("faileMsg", "Vui lòng nhập đầy đủ thông tin!");
				resp.sendRedirect("admin/TaiKhoanAdd.jsp");
			} else {
				Connection conn = null;
				try {
					conn = DBConnect.getConnect();
					PreparedStatement checkEmailStmt = conn
							.prepareStatement("SELECT email FROM nguoi_dung WHERE email = ?");
					checkEmailStmt.setString(1, email);
					ResultSet rs = checkEmailStmt.executeQuery();
					if (rs.next()) {
						session.setAttribute("status", "failed");
						session.setAttribute("faileMsg", "Email đã tồn tại. Vui lòng sử dụng email khác!");
						resp.sendRedirect("admin/TaiKhoanAdd.jsp");
					} else {
						NguoiDungDaoImpl dao = new NguoiDungDaoImpl(conn);
						boolean f = dao.addNguoiDung(n);
						if (f) {
							session.setAttribute("status", "success");
							resp.sendRedirect("admin/quanlyTaiKhoan.jsp");
						} else {
							session.setAttribute("status", "failed");
							resp.sendRedirect("admin/TaiKhoanAdd.jsp");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					session.setAttribute("status", "error");
					resp.sendRedirect("register.jsp");
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("status", "error");
			session.setAttribute("faileMsg", "Có lỗi xảy ra. Vui lòng thử lại!");
			resp.sendRedirect("register.jsp");
		}
	}

}
