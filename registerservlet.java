package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class registerservlet
 */
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String skillHave = request.getParameter("skillHave");
        String skillWant = request.getParameter("skillWant");
        
      
        
        try {    Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/db";

 String user = "root";

 String pwd = "kkxxdh1314";
       Connection cnn= DriverManager.getConnection(url, user, pwd);
       String sql = "INSERT INTO user (id, username, password, email, skillHave, skillWant) " +
               "VALUES (" + id + ", '" + username + "', '" + password + "', '" + email + "','" + skillHave + "','" + skillWant + "')";
       Statement stmt=cnn.createStatement();
  stmt.executeUpdate(sql);
  stmt.close();
  cnn.close();}
  catch (SQLException | ClassNotFoundException e) {  
      // TODO Auto-generated catch block  
      e.printStackTrace();  
  }  
	
//        request.getRequestDispatcher("login.html")    
 //       .forward(request, response); 
        response.sendRedirect("login.html");
	

}
	protected void doPost(HttpServletRequest request,    
            HttpServletResponse response) throws ServletException, IOException {   
        doGet(request, response);    
    }    
}
