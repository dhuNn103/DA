package com.CPT.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Utils.MaHoa;

@WebServlet("/new_password")
public class NewPassword extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String newPassword = req.getParameter("txtpasss");
		String confPassword = req.getParameter("comfirm_pass");
		RequestDispatcher dispatcher = null;

		if (newPassword.isEmpty() || confPassword.isEmpty()) {
			session.setAttribute("fail", "Vui lòng nhập mật khẩu mới!");
			resp.sendRedirect("newPass.jsp");
		} else {
			if (newPassword != null && confPassword != null && newPassword.equals(confPassword)) {

				try {
					String mhdPass = MaHoa.toSha1(newPassword);
					Connection con = DBConnect.getConnect();
					PreparedStatement pst = con.prepareStatement("update nguoi_dung set mat_khau = ? where email = ? ");
					pst.setString(1, mhdPass);
					pst.setString(2, (String) session.getAttribute("email"));

					int rowCount = pst.executeUpdate();
					if (rowCount > 0) {
						req.setAttribute("status", "resetSuccess");
						dispatcher = req.getRequestDispatcher("login.jsp");
					} else {
						req.setAttribute("status", "resetFailed");
						dispatcher = req.getRequestDispatcher("login.jsp");
					}
					dispatcher.forward(req, resp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
