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
import com.CPT.Dao.HinhAnhPageDaoImpl;
import com.CPT.Entities.HinhAnhPage;

@WebServlet("/editImg")
@MultipartConfig
public class EditImgPage extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String tens = req.getParameter("names");
			Part img = req.getPart("img");
			String file = img.getSubmittedFileName();
			
			String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists())
				uploadDir.mkdir();
			String filePath = uploadPath + File.separator + file;
			img.write(filePath);
			
			HinhAnhPage imgs = new HinhAnhPage();
			imgs.setIdanh(id);
			imgs.setTenanh(tens);
			imgs.setHinhanh(file);
			
			HinhAnhPageDaoImpl dao = new HinhAnhPageDaoImpl(DBConnect.getConnect());
			boolean f = dao.editAnh(imgs);
			
			HttpSession session = req.getSession();
			if (f) {
				session.setAttribute("succMsg", "Cập nhật thành công");
				resp.sendRedirect("admin/quanlyAnhPage.jsp");
			} else {
				session.setAttribute("failMsg", "Cập nhật thất bại");
				resp.sendRedirect("admin/EditAnhPage.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
