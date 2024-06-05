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

@WebServlet("/edtDanhMuc")
public class EditDanhMuc extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String tens = req.getParameter("ten");
			
			DanhMuc dm = new DanhMuc();
			dm.setId(id);
			dm.setTendanhmuc(tens);
			
			DanhMucDaoImpl dao = new DanhMucDaoImpl(DBConnect.getConnect());
			boolean f = dao.editDanhMuc(dm);
			
			HttpSession session = req.getSession();
			if (f) {
				session.setAttribute("succMsg", "Cập nhật thành công");
				resp.sendRedirect("admin/quanlyDanhMuc.jsp");
			} else {
				session.setAttribute("failMsg", "Cập nhật thất bại");
				resp.sendRedirect("admin/DanhMucEdit.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
