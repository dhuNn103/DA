package com.CPT.Admin.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.NguoiDungDaoImpl;
import com.CPT.Entities.NguoiDung;

@WebServlet("/editNguoiDung")
public class EditNguoiDung extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String names = req.getParameter("ten");
			String email = req.getParameter("emls");
			String sdt = req.getParameter("sdt");
			String diachi = req.getParameter("diachis");
			String matkhau = req.getParameter("password");
			int idvatr = Integer.parseInt(req.getParameter("idvatr"));
				
			NguoiDung nd = new NguoiDung();
			nd.setId(id);
			nd.setHoten(names);
			nd.setEmail(email);
			nd.setSodienthoai(sdt);
			nd.setDiachi(diachi);
			nd.setMatkhau(matkhau);
			nd.setVaitroid(idvatr);
			
			NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
			boolean f = dao.editNguoiDung(nd);
			
			HttpSession session = req.getSession();
			if(f) {
				session.setAttribute("", "Cập nhật thành công");
				resp.sendRedirect("admin/quanlyTaiKhoan.jsp");
			}else {
				session.setAttribute("", "Lỗi! vui lòng thử lại");
				resp.sendRedirect("admin/TaiKhoanEdit.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}