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

@WebServlet("/Xoa")
public class DeleteDanhMuc extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			DanhMucDaoImpl dao = new DanhMucDaoImpl(DBConnect.getConnect());
			boolean f=dao.deleteDanhMuc(id);
			HttpSession session = req.getSession();
			if (f) {
                session.setAttribute("succMsg", "Xóa thành công");
                resp.sendRedirect("admin/quanlyDanhMuc.jsp");
            } else {
                session.setAttribute("failMsg", "Xóa thất bại");
                resp.sendRedirect("admin/quanlyDanhMuc.jsp");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
