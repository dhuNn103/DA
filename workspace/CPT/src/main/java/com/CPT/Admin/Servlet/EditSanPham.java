package com.CPT.Admin.Servlet;

import java.io.File;
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

@WebServlet("/Edtsanpham")
@MultipartConfig
public class EditSanPham extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		try {
			int id = Integer.parseInt(req.getParameter("id"));
			int idDanhMuc = Integer.parseInt(req.getParameter("idDM"));
			String name = req.getParameter("names");
			String giaCu = req.getParameter("giacu");
			String giaMoi = req.getParameter("giamoi");
			String moTa = req.getParameter("mota");
			String ngayTao = req.getParameter("ngaytao");
			String ngaySua = req.getParameter("ngaysua");
			Part imagePart = req.getPart("anh");
			String fileName = imagePart.getSubmittedFileName();
			String loai = req.getParameter("loai");
			String tinhtrang = req.getParameter("tinhtrang");

			// Đường dẫn để lưu tệp upload
			String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists())
				uploadDir.mkdir();
			String filePath = uploadPath + File.separator + fileName;
			imagePart.write(filePath);

			// Tạo đối tượng sản phẩm và gán giá trị
			SanPham sp = new SanPham();
			sp.setId(id);
			sp.setIddanhmuc(idDanhMuc);
			sp.setTensanpham(name);
			sp.setGiacu(giaCu);
			sp.setGiamoi(giaMoi);
			sp.setMota(moTa);
			sp.setNgaytao(ngayTao);
			sp.setNgaysua(ngaySua);
			sp.setHinhanh(fileName);
			sp.setLoaisanpham(loai);
			sp.setTinhtrang(tinhtrang);

			// Tạo DAO và cập nhật sản phẩm
			SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
			boolean isSuccess = dao.editSanPham(sp);

			// Lấy session và đặt thông báo
			HttpSession session = req.getSession();
			if (isSuccess) {
				session.setAttribute("succMsg", "Cập nhật thành công");
				resp.sendRedirect("admin/quanlySanPham.jsp");
			} else {
				session.setAttribute("failMsg", "Cập nhật thất bại");
				resp.sendRedirect("admin/SanPhamEdit.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.getSession().setAttribute("failMsg", "Có lỗi xảy ra: " + e.getMessage());
			resp.sendRedirect("admin/SanPhamEdit.jsp");
		}
	}

}
