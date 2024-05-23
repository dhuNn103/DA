package com.CPT.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Utils.MaHoa;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String emails = req.getParameter("txtemail");
		String passwords = req.getParameter("txtpassword");
		
		HttpSession session = req.getSession();
		session.setAttribute("emls", emails);
	
		try {
			
			passwords = MaHoa.toSha1(passwords);
			Connection conn = DBConnect.getConnect();
			String query = "SELECT nguoi_dung.id_nguoi_dung, ten_vai_tro FROM nguoi_dung JOIN vai_tro ON nguoi_dung.id_vai_tro = vai_tro.id_vai_tro WHERE email = ? AND mat_khau = ?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, emails);
			statement.setString(2, passwords);
			
			ResultSet rs = statement.executeQuery();
			
			if(emails.isEmpty() || passwords.isEmpty())
			{
				session.setAttribute("fMsg", "Vui lòng nhập đầy đủ thông tin!");
				resp.sendRedirect("login.jsp");				
			}else {	
				if (rs.next()) {
					String role = rs.getString("ten_vai_tro");
					session.setAttribute("role", role);
					if (role.equals("admin")) {
						resp.sendRedirect("admin/homeAdmin.jsp");
					} else if (role.equals("user")) {
						resp.sendRedirect("index.jsp");
					}
				} else {
					session.setAttribute("fMsg", "Tài khoản hoặc mật khẩu sai!");
					resp.sendRedirect("login.jsp");
				}
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
