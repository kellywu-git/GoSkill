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
 * Servlet implementation class matchservlet
 */
public class matchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public matchservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("id");
		
		String userid = request.getParameter("userid");
      
        
      
        
        try {    Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/db";

 String user = "root";

 String pwd = "kkxxdh1314";
       Connection cnn= DriverManager.getConnection(url, user, pwd);
       String sql = "INSERT INTO matchuser (id, matchUser ) " +
               "VALUES (" + id + ", '" + userid + "')";
       Statement stmt=cnn.createStatement();
  stmt.executeUpdate(sql);
  stmt.close();
  cnn.close();}
  catch (SQLException | ClassNotFoundException e) {  
      // TODO Auto-generated catch block  
      e.printStackTrace();  
  }  
	

        request.getRequestDispatcher("matchsuccess.html")    
        .forward(request, response); 
	
	

}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
