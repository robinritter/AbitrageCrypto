package Datenbank;
import java.sql.*;
public class DatenbankAnbindung {

		public static void main (String[] args ) {
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "";
			DatenHinzuf�gen data = new DatenHinzuf�gen();
			try (Connection conn = DriverManager.getConnection(url, user, password))
			{
				System.out.println("erfolreich verbunden");
			}catch(SQLException ex) {
				System.err.println(ex.getMessage());
			}
		}
}
