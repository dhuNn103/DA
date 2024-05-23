package com.CPT.Admin.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.SanPhamDaoImpl;
import com.CPT.Entities.SanPham;

@WebServlet("/Addsanpham")
@MultipartConfig
public class AddSanPhams extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		try {
			int idDanhMuc = Integer.parseInt(req.getParameter("idDM"));
			String Name = req.getParameter("names");
			String GiaCu = req.getParameter("giacu");
			String GiaMoi = req.getParameter("giamoi");
			String MoTa = req.getParameter("mota");
			String NgayTao = req.getParameter("ngaytao");
			String NgaySua = req.getParameter("ngaysua");
			Part Image = req.getPart("anh");
			String FileImage = Image.getSubmittedFileName();
			
			SanPham sp = new SanPham(idDanhMuc, Name, GiaCu, GiaMoi, MoTa, FileImage, NgayTao, NgaySua);

			SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
			boolean f = dao.AdSanPham(sp);
			HttpSession session = req.getSession();
			if (f) {
				session.setAttribute("succMsg", "Thêm sản phẩm thành công");
				resp.sendRedirect("admin/quanlySanPham.jsp");
			} else {
				session.setAttribute("faileMsg", "Lỗi!");
				resp.sendRedirect("admin/SanPhamAdd.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
