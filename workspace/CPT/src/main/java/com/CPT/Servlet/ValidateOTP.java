package com.CPT.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validateOTP")
public class ValidateOTP extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String otpValue = req.getParameter("otp");
		HttpSession session = req.getSession();
		Integer otp = (Integer) session.getAttribute("otp");
		
		RequestDispatcher dispatcher = null;

		if ( otpValue.isEmpty()) {
			session.setAttribute("failMsg", "Vui lòng nhập đầy đủ thông tin!");
			resp.sendRedirect("OTP.jsp");
		} else {
			int value = Integer.parseInt(otpValue);

			if (value == otp) {
				req.setAttribute("email", session.getAttribute("email"));
				req.setAttribute("status", "success");
				dispatcher = req.getRequestDispatcher("newPass.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("message", "Mã OTP sai");
				dispatcher = req.getRequestDispatcher("OTP.jsp");
				dispatcher.forward(req, resp);
			}
		}
	}

}
