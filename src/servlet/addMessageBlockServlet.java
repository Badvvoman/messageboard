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



@WebServlet("/addMessageBlockServlet")
public class addMessageBlockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addMessageBlockServlet() {
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
		String MB_name=request.getParameter("title");				
					
		// ��session��ȡ����ǰ�û�����				
		user amb=(user) request.getSession().getAttribute("login");				
		// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ				
		MessageBlock mb=new MessageBlock();				
					
		// ����Ϊ��ȡ�ĵ�ǰʱ��				
		mb.setMBName(MB_name);				
		mb.setMBtime(new Timestamp(System.currentTimeMillis()));				
		mb.setUserId(amb.getId());				
		// ��DB���еķ����ж��Ƿ����ɹ�				
		if(new UserLoginDao().addInfo(mb)){					
			response.sendRedirect("success.jsp") ;				
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
