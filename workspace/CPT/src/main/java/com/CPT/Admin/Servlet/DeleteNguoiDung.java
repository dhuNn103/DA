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

@WebServlet("/delete")
public class DeleteNguoiDung extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
			boolean f=dao.deleteNguoiDung(id);
			HttpSession session = req.getSession();
			if (f) {
                session.setAttribute("succMsg", "Xóa thành công");
                resp.sendRedirect("admin/quanlyTaiKhoan.jsp");
            } else {
                session.setAttribute("failMsg", "thất bại, vui lòng thử lại");
                resp.sendRedirect("admin/UserEdit.jsp");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
