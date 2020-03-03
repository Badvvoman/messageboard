package servlet;

import java.io.IOException;

import java.sql.Timestamp;






import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserLoginDao;
import model.user;
import model.message;



@WebServlet("/LeaveMessage")
public class LeaveMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LeaveMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����������				
		request.setCharacterEncoding("utf-8");				
		// ������Ӧ����				
		response.setContentType("utf-8");				
		// ��ȡtitle����				
		String title=request.getParameter("title");				
		// ��ȡmessage����				
		String message=request.getParameter("message");				
		// ��session��ȡ����ǰ�û�����				
		user u=(user) request.getSession().getAttribute("login");
		int mbId=(int) request.getSession().getAttribute("mb_id");	
		// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ				
		message m=new message();				
					
		m.setTitle(title);
		m.setContent(message);
		m.setPublishtime(new Timestamp(System.currentTimeMillis()));
		m.setMb_id(mbId);			
		m.setUserId(u.getId());			
					
		// ��DB���еķ����ж��Ƿ����ɹ�				
		if(new UserLoginDao().insert_message(m)){					
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
