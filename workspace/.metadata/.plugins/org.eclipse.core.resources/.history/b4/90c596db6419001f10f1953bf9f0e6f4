
package com.CPT.Admin.Servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.SanPhamDaoImpl;

@WebServlet("/Delete")
public class DeleteSanPham extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
			boolean f =dao.deleteSanPham(id);
			HttpSession session = req.getSession();
			if (f) {
                session.setAttribute("succMsg", "Cập nhật thành công");
                resp.sendRedirect("admin/quanlySanPham.jsp");
            } else {
                session.setAttribute("failMsg", "Cập nhật thất bại");
                resp.sendRedirect("admin/SanPhamEdit.jsp");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
