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
import com.CPT.Utils.MaHoa;

@WebServlet("/addtaikhoan")
public class AddTaiKhoans extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session = req.getSession();
		
		
		try {
			String Name = req.getParameter("names");
			String Email = req.getParameter("emails");
			String SĐT = req.getParameter("phones");
			String DiaChi = req.getParameter("diachi");
			String MK = req.getParameter("txtpassword");
			MK = MaHoa.toSha1(MK);
			int idVaiTro = Integer.parseInt(req.getParameter("vaitro"));
			

			NguoiDung nd = new NguoiDung(Name, Email, SĐT, DiaChi, MK, idVaiTro);

			NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
			boolean f = dao.addNguoiDung(nd);

			if (f) {
				session.setAttribute("succ", "Thêm sản phẩm thành công");
				resp.sendRedirect("admin/quanlyTaiKhoan.jsp");
			} else {
				session.setAttribute("fail", "Lỗi!");
				resp.sendRedirect("admin/UserAdd.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
