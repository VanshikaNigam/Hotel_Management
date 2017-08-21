import java.sql.*;
public class MyConnection
{
	public static Connection con;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DriverOk");
			
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","root");
			System.out.println("Connected");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
		
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		return con;
	}
}