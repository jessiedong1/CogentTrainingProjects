package com.hr.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cogent.hr.eapp.model.Employee;

//Buisness Logic
public class EmployeeDAO {
	private Connection con = null;
	private String url="jdbc:mysql://localhost:3306/batch52";
	private String uname = "root";
	private String pass = "Jessie86725736";
	public EmployeeDAO() {
		try
		{
			this.con = DriverManager.getConnection(url,uname,pass);
		}catch(SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();		}
	}
	public boolean insert(Employee e) {
		//database to insert into database
		String query = "INSERT INTO EMPLOYEE VALUES (?,?,?,?)";

		try(PreparedStatement st = con.prepareStatement(query)){
			st.setInt(1, e.getId());
			st.setString(2, e.getName());
			st.setDouble(3,e.getSalary());
			st.setInt(4, e.getDept());
			int n = st.executeUpdate();
			if(n>0) {
				return true;
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();		}
		return false;
	}
	
	public Employee find(int emp_id) {
		String query = "Select * from employee where emp_id = " + emp_id;
		try(Statement st = con.createStatement();
				ResultSet result = st.executeQuery(query))
		{
			while(result.next()) {
				int eid = result.getInt(1);
				String ename = result.getString(2);
				double esalary = result.getDouble(3);
				int edeptid = result.getInt(4);
				Employee e = new Employee(eid,ename,esalary,edeptid);
				return e;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


}
