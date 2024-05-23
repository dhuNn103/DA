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

@WebServlet("/editTaikhoan")
public class EditNguoiDung extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String ten = req.getParameter("names");
			String eml = req.getParameter("emails");
			String SDT = req.getParameter("phones");
			String dichi = req.getParameter("diachi");
			String mk = req.getParameter("pass");
			mk = MaHoa.toSha1(mk);
			int idvaitro = Integer.parseInt(req.getParameter("vaitro"));
			
			NguoiDung nd =  new NguoiDung();
			nd.setId(id);
			nd.setHoten(ten);
			nd.setEmail(eml);
			nd.setSodienthoai(SDT);
			nd.setDiachi(dichi);
			nd.setMatkhau(mk);
			nd.setVaitroid(idvaitro);
			
			NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
			boolean f= dao.updateNguoiDung(nd);
			
			HttpSession session = req.getSession();
			if(f) {
				session.setAttribute("succMsg", "Cập nhật thành công");
				resp.sendRedirect("admin/quanlyTaiKhoan.jsp");
			}else {
				session.setAttribute("faileMsg", "Thất bại");
				resp.sendRedirect("admin/UserEdit.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
	
}