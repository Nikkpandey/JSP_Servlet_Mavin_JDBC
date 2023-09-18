package com.employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;
import com.emplyee.DAO.EmployeeDAO;


public class GetEmployeeControler extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aid=Integer.parseInt(request.getParameter("aid"));
		EmployeeDAO dao=new EmployeeDAO();
		Employee e1=dao.getEmployee(aid);
		
		request.setAttribute("employee", e1);
		RequestDispatcher rd=request.getRequestDispatcher("showEmployee.jsp");
		rd.forward(request, response);
		
	}

	

}
