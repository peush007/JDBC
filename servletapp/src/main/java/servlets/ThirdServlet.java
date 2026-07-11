package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside third servlet");
		
		int roll = Integer.parseInt(req.getParameter("roll"));
		String name = req.getParameter("firstname");
		String city = req.getParameter("city");
		System.out.println(name + " " + roll + " " + city);
		
		// JDBC
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/parul_university";
		try {
		Connection conn = DriverManager.getConnection(url, "root", "peush@123");
		
		PreparedStatement st = conn.prepareStatement("insert into student values(?, ?, ?, ?)");
		st.setInt(1,  id);
		st.setString(2, name);
		st.setInt(3, age);
		st.setString(4, city);
		
		st.executeUpdate();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

}
