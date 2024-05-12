package com.CPT.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import java.io.IOException;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.NguoiDungDaoImpl;
import com.CPT.Entities.NguoiDung;
import com.CPT.Utils.MaHoa;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		
//		String email = req.getParameter("txtemail");
//		String passwords = req.getParameter("txtpassword");
//
//		HttpSession session = req.getSession();

		
//		NguoiDung nds = authenticate(email, passwords);
//
//		if (nds != null) {
//			session.setAttribute("fMsg", nds);
//			if (nds.getVaiTro() != null && nds.getVaiTro().getTenvaitro().equals("admin")) {
//				session.setAttribute("fMsg", "login admin");
//				resp.sendRedirect("admin/homeAdmin.jsp"); 
//			} else {
//				session.setAttribute("fMsg", "login user");
//				resp.sendRedirect("index.jsp"); 
//			}
//		} else {
//			session.setAttribute("fMsg", "loiix");
//			resp.sendRedirect("login.jsp");
//		}
		

		String emails = req.getParameter("txtemail");
		String passwords = req.getParameter("txtpassword");
		
		HttpSession session = req.getSession();

		
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


//	private NguoiDung authenticate(String eml, String pass) {
//		NguoiDungDaoImpl udi = new NguoiDungDaoImpl(DBConnect.getConnect());
//
//		NguoiDung nds = udi.login(eml,pass);
//		if (nds != null && nds.getMatkhau().equals(pass)) {
//			return nds;
//		} else {
//			return null;
//		}
//	}
}
//String email = req.getParameter("txtemail");
//String password = req.getParameter("txtpassword");
//
//HttpSession session = req.getSession();
//
//// Xác thực người dùng bằng phương thức login
//NguoiDung user = login(email, password);
//
//if (user != null) {
//    // Người dùng đã được xác thực thành công
//    session.setAttribute("loggedInUser", user);
//    if (user.getVaiTro().getTenVaiTro().equals("admin")) {
//        // Chuyển hướng đến trang admin nếu vai trò là admin
//        resp.sendRedirect("admin/homeAdmin.jsp");
//    } else if (user.getVaiTro().getTenVaiTro().equals("user")) {
//        // Chuyển hướng đến trang user nếu vai trò là user
//        resp.sendRedirect("index.jsp");
//    }
//} else {
//    // Xác thực không thành công, chuyển hướng đến trang đăng nhập và hiển thị thông báo lỗi
//    session.setAttribute("errorMsg", "Email hoặc mật khẩu không chính xác!");
//    resp.sendRedirect("login.jsp");
//}
//}
