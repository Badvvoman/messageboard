package servlet;

import java.io.IOException;


import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import dao.*;
import model.message;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����������
		request.setCharacterEncoding("utf-8");
		// ������Ӧ����
		response.setContentType("utf-8");
		AdminLoginDao loginDao = new AdminLoginDao();
		HttpSession session = request.getSession();
		
		
		admin l = loginDao.checkLogin(request.getParameter("name"), request.getParameter("password"));
		if (l != null) {
			// �����½�ɹ�
			session.setAttribute("adminlogin", l);
			// ����ȡ�Ķ��󱣴���session��
			response.sendRedirect("adminmain.jsp");
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

