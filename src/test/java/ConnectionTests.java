import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

/**
 *  
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015年5月18日 上午1:07:01 
 */
public class ConnectionTests {

	@Test
	public void test() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.1.11.165:1433;databaseName=YConnect_Platform",
					"sa", "Asdf1234");
			
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
