package servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserLoginDao;
import model.*;


@WebServlet("/LeaveSignature")
public class LeaveSignature extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveSignature() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����������				
		request.setCharacterEncoding("utf-8");				
		// ������Ӧ����				
		response.setContentType("utf-8");							
		// ��ȡmessage����				
		String newSignature=request.getParameter("message");				
		// ��session��ȡ����ǰ�û�����				
		user u=(user) request.getSession().getAttribute("login");
		
		// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ				
				
					
		// ��DB���еķ����ж��Ƿ����ɹ�				
		if(new UserLoginDao().update_signature(newSignature, u.getId())){					
			response.sendRedirect("main.jsp") ;				
			}
		else {
			response.sendRedirect("error.jsp") ;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
