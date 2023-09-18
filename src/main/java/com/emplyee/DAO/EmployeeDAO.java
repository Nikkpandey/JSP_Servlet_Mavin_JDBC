package com.emplyee.DAO;

import java.sql.*;

import com.employee.model.Employee;

public class EmployeeDAO {
	public Employee getEmployee(int aid) {
		Employee e=new Employee();
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Nikk123@");
	    	Statement stmt=con.createStatement();
	    	ResultSet rs=stmt.executeQuery("select * from employee_details where aid= "+aid);
	    	if(rs.next()) {
	    		e.setAid(rs.getInt("aid"));
	    		e.setAname(rs.getString("aname"));
	    		e.setTech(rs.getString("tech"));
	    	}
	    }
	    catch(Exception exp){
	    	System.out.println(exp);
	    }
	    return e;
	}

}
