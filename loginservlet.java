package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");  
        String pw = request.getParameter("password");
        
      
        
        try {    Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/db";

 String user = "root";

 String pwd = "kkxxdh1314";
       Connection cnn= DriverManager.getConnection(url, user, pwd);
       String sql = "select * from user where username = ? and password = ?";    
       PreparedStatement ps = cnn.prepareStatement(sql);    
       ps.setString(1, un);  
       ps.setString(2, pw);  
       ResultSet rs=ps.executeQuery(); 
      
       if (rs.next()) {response.sendRedirect("match.html");   }
       else {response.sendRedirect("error.jsp");
    
       }
       
       
  ps.close();
  cnn.close();}
  catch (SQLException | ClassNotFoundException e) {  
      // TODO Auto-generated catch block  
      e.printStackTrace();  
  }  
	
  /*      request.getRequestDispatcher("match.html")    
        .forward(request, response); */
	

	

}
	protected void doPost(HttpServletRequest request,    
            HttpServletResponse response) throws ServletException, IOException {   
        doGet(request, response);    
    }    
}
