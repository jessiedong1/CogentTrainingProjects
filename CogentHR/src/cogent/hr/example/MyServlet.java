package cogent.hr.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hr.app.dao.EmployeeDAO;

import cogent.hr.eapp.model.Employee;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/test")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("<b>Hello World</b>");
		response.setContentType("text/html");
		
		String action = request.getParameter("action").toLowerCase();
		EmployeeDAO dao = new EmployeeDAO();
		switch(action) {
			case "insert":
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				double salary = Double.parseDouble(request.getParameter("salary"));
				int did = Integer.parseInt(request.getParameter("did"));
				Employee e = new Employee(id,name,salary,did);
				if(dao.insert(e)) {
					request.setAttribute("employee", e);
					request.getRequestDispatcher("/admin/result.jsp").forward(request, response);
				}
				else{
					request.setAttribute("message", "Cannot register you, please contact adminstrator");
					request.getRequestDispatcher("error.jsp").forward(request,  response);
				}
				break;
			case "find":
				int id1 = Integer.parseInt(request.getParameter("id"));
				
				if(dao.find(id1)!=null) {
					Employee e1 = dao.find(id1);
					HttpSession session = request.getSession();
					session.setAttribute("employee", e1);
//					request.setAttribute("employee", e1);
					request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
				}
				else {
					request.setAttribute("message", "Sorry, we cannot find this employee");
					request.getRequestDispatcher("error.jsp").forward(request,  response);
				}
				break;
		
		}
		
	}
	protected void addNewEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
