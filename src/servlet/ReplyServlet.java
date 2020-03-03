package servlet;

import java.io.IOException;





import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserLoginDao;
import model.*;



@WebServlet("/ReplyServlet")
public class ReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReplyServlet() {
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
		int mId=(int) request.getSession().getAttribute("m_id");	
		// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ				
		reply r=new reply();				
					
		r.setTitle(title);
		r.setContent(message);
		r.setTime(new Timestamp(System.currentTimeMillis()));
		r.setMB_id(mbId);	
		r.setU_id(u.getId());
		r.setM_id(mId);
				
					
		// ��DB���еķ����ж��Ƿ����ɹ�				
		if(new UserLoginDao().insert_reply(r)){					
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
