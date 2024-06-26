package com.CPT.Servlet;

import java.io.IOException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/reset_password")
public class ResetPasswordServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("txtemail");
		RequestDispatcher dispatcher = null;
		int maotp = 0;
		HttpSession mysession = req.getSession();

		if (email.isEmpty()) {
			mysession.setAttribute("faileMsg", "Vui lòng nhập email, không được để chống!");
			resp.sendRedirect("quenPass.jsp");
		} else {
			if (email != null) {
				Random random = new Random();
				maotp = random.nextInt(123456);

				String to = email;
				Properties properties = new Properties();
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.socketFactory.port", "465");
				properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.port", "465");

				Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("apihacking465@gmail.com", "nwmhpeqeokscgdnb");
					}
				});
				try {
					MimeMessage message = new MimeMessage(session);
					message.setFrom(new InternetAddress(email));
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
					message.setSubject("Laptop ALAPTER");
					message.setText("Mã OTP của bạn là: " + maotp);
					Transport.send(message);
				} catch (MessagingException e) {
					throw new RuntimeException(e);
				}
				dispatcher = req.getRequestDispatcher("OTP.jsp");
				req.setAttribute("message", "Mã OTP đã được gửi đến gmail của bạn");
				mysession.setAttribute("otp", maotp);
				mysession.setAttribute("email", email);
				dispatcher.forward(req, resp);
			}

		}
	}
}

//		
//		String emailString = req.getParameter("txtemail");
//	    RequestDispatcher dispatcher = null;
//	    HttpSession mysession = req.getSession();
//
//	    if (emailString != null && !emailString.equals("")) {
//	        // Giả sử các email được ngăn cách bởi dấu phẩy
//	        String[] emailArray = emailString.split(",");
//	        Random random = new Random();
//
//	        // Lặp 500 lần
//	        for (int i = 0; i < 50; i++) {
//	            // Lấy email tại vị trí i, nếu không đủ thì lấy email cuối cùng trong danh sách
//	            String email;
//	            if (i < emailArray.length) {
//	                email = emailArray[i].trim();
//	            } else {
//	                email = emailArray[emailArray.length - 1].trim(); // Sử dụng email cuối cùng nếu không đủ 500 email
//	            }
//
//	            int maotp = random.nextInt(999999); // Tạo mã OTP ngẫu nhiên từ 0 đến 999999
//	            
//	            String to = email;
//	            
//	            Properties properties = new Properties();
//	            properties.put("mail.smtp.host", "smtp.gmail.com");
//	            properties.put("mail.smtp.socketFactory.port", "465");
//	            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//	            properties.put("mail.smtp.auth", "true");
//	            properties.put("mail.smtp.port", "465");
//	            
//	            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
//	                protected PasswordAuthentication getPasswordAuthentication() {
//	                    return new PasswordAuthentication("apihacking465@gmail.com", "nwmhpeqeokscgdnb");
//	                }
//	            });
//	            
//	            try {
//	                MimeMessage message = new MimeMessage(session);
//	                message.setFrom(new InternetAddress("apihacking465@gmail.com"));
//	                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//	                message.setSubject("Cụ Đào Văn Hùng");
//	                message.setText("Mã OTP của bạn là: " + maotp);
//	                Transport.send(message);
//	                
//	                // Lưu OTP và email vào session cho từng người dùng
//	                mysession.setAttribute("otp_" + to, maotp);
//	                mysession.setAttribute("email_" + to, to);
//	            } catch (MessagingException e) {
//	                throw new RuntimeException(e);
//	            }
//	        }
//
//	        dispatcher = req.getRequestDispatcher("OTP.jsp");
//	        req.setAttribute("message", "Mã OTP đã được gửi đến các địa chỉ email của bạn");
//	        dispatcher.forward(req, resp);
//	    }
//	}
//
//}
