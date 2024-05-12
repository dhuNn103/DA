package com.CPT.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.NguoiDungDaoImpl;
import com.CPT.Entities.NguoiDung;
import com.CPT.Utils.MaHoa;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		try {
			
			
			String hoten = req.getParameter("txtname");
			String email = req.getParameter("txtemail");
			String sodienthoai = req.getParameter("txtphone");
			String diachi = req.getParameter("txtaddr");
			String matkhau = req.getParameter("txtpassword");
			matkhau = MaHoa.toSha1(matkhau);
			String checks = req.getParameter("check");
			
			NguoiDung n = new NguoiDung();
			n.setHoten(hoten);
			n.setEmail(email);
			n.setSodienthoai(sodienthoai);
			n.setDiachi(diachi);
			n.setMatkhau(matkhau);
			
			HttpSession session = req.getSession();
			
			if(hoten == " " && email == " " && sodienthoai == " " && diachi == " " && matkhau == " ")
			{
				session.setAttribute("faileMsg", "Vui lòng nhập đầy đủ thông tin!");
				resp.sendRedirect("register.jsp");
				
			}else {	
				
				if(checks != null)
				{
					NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
					boolean f = dao.register(n);
					if (f) 
					{
						session.setAttribute("sucMsg","");
						JOptionPane.showMessageDialog(null,
							    "Đăng ký tài khoản thành công!",
							    "message",
							    JOptionPane.PLAIN_MESSAGE);
						resp.sendRedirect("login.jsp");
					} else {
					
						session.setAttribute("faileMsg", "Đăng ký tài khoản thất bại!");
						resp.sendRedirect("register.jsp");
					}
					
				}else {
					session.setAttribute("faileMsg", "Vui lòng chấp nhận điều khoản dịch vụ của chúng tôi!");
					resp.sendRedirect("register.jsp");
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
