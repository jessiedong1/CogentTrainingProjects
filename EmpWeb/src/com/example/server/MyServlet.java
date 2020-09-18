package com.example.server;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.EmployeeDAO;
import com.example.entities.Employee;


/**
 * Servlet implementation class MyServlet
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
		response.setContentType("text/html");
		//Getting the action from request
		String action = request.getParameter("action");
		//Retrieve employee info from request
		int id = 999;
		String name = "Deafult";
		double salary = 0.0;
		int did = 0;
		if(request.getParameter("id") != null)
			id = Integer.parseInt(request.getParameter("id"));
		if(request.getParameter("name") != null)
			name = request.getParameter("name");
		if(request.getParameter("salary") != null)
			salary = Double.parseDouble(request.getParameter("salary"));
		if(request.getParameter("did") != null)
			did = Integer.parseInt(request.getParameter("did"));
		Employee e = new Employee(id,name,salary);
		

		switch(action) {
			case "Create Account":
			
				String res = EmployeeDAO.getInstance().insert(e,did);
				if(res.equals("success")) {
					request.setAttribute("employee", e);
					request.setAttribute("smessage", "Your information has been successfully updated!");
					request.getRequestDispatcher("result.jsp").forward(request, response);
				}
				else{
					request.setAttribute("message", res);
					request.getRequestDispatcher("error.jsp").forward(request,  response);
				}
				break;
			case "Update Account":
//				Employee eu = new Employee(id,name,salary);
				String resu = EmployeeDAO.getInstance().update(e,did);
				if(resu.equals("success")) {
					request.setAttribute("employee", e);
					request.setAttribute("smessage", "Your information has been successfully updated!");
					request.getRequestDispatcher("result.jsp").forward(request, response);
				}
				else{
					request.setAttribute("message", resu);
					request.getRequestDispatcher("error.jsp").forward(request,  response);
				}
				break;
				
				//Looking for the account with emp_id
			case "Find Account":
					Employee e1 = EmployeeDAO.getInstance().find(id);
					if(e1!=null) {
						request.setAttribute("employee", e1);
						request.getRequestDispatcher("result.jsp").forward(request, response);
					}
					else {
						request.setAttribute("message", "Sorry, we cannot find this employee");
						request.getRequestDispatcher("error.jsp").forward(request,  response);
					}
					break;
			
					//Delete the account with emp_id
			case "Delete Account":
				Employee ed = EmployeeDAO.getInstance().delete(id);
				if(ed != null) {
					request.setAttribute("employee", ed);
					request.setAttribute("smessage", "Your information has been successfully delete!");
					request.getRequestDispatcher("result.jsp").forward(request, response);
				}
				else{
					request.setAttribute("message","Cannot delete the record");
					request.getRequestDispatcher("error.jsp").forward(request,  response);
				}
				
				//Admin login Employee ID:999 name: admin
			case "Admin":
					if(name.equals("Admin")&& id==999){
					List<Employee> empList = EmployeeDAO.getInstance().retrieveAll();
					
					request.setAttribute("employees", empList);
					request.getRequestDispatcher("allData.jsp").forward(request, response);
					}
					else {
						request.setAttribute("message", "Sorry, you don't have the access to employee information");
						request.getRequestDispatcher("error.jsp").forward(request, response);
					}
					
				
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
