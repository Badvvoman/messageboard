package servlet;

import java.io.IOException;


import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.user;
import dao.UserLoginDao;
import model.message;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����������
		request.setCharacterEncoding("utf-8");
		// ������Ӧ����
		response.setContentType("utf-8");
		UserLoginDao loginDao = new UserLoginDao();
		HttpSession session = request.getSession();
		
		
		user l = loginDao.checkLogin(request.getParameter("name"), request.getParameter("password"));
		if (l != null) {
			// �����½�ɹ�
			session.setAttribute("login", l);
			// ����ȡ�Ķ��󱣴���session��
			response.sendRedirect("main.jsp");
			// ��֤�ɹ���ת�� main.jsp
		} else {
			// ��֤ʧ����ת�� error.jsp
			response.sendRedirect("error.jsp");
		}
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
