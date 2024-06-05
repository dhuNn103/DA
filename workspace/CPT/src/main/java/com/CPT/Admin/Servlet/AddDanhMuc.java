package com.CPT.Admin.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.DanhMucDaoImpl;
import com.CPT.Entities.DanhMuc;

@WebServlet("/addDanhMuc")
public class AddDanhMuc extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		try {
			String names = req.getParameter("names");
			
			DanhMuc dm = new DanhMuc(names);
			DanhMucDaoImpl dao = new DanhMucDaoImpl(DBConnect.getConnect());
			boolean f = dao.AddDanhMuc(dm);
			HttpSession session = req.getSession();
			if (f) {
				session.setAttribute("succMsg", "Thêm danh mục thành công");
				resp.sendRedirect("admin/quanlyDanhMuc.jsp");
			} else {
				session.setAttribute("faileMsg", "Lỗi!");
				resp.sendRedirect("admin/DanhMucAdd.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
