package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DBConnector {
    public Connection connector(){
        Connection connection = null ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_library" , "root" , "");
            if(connection == null){
                System.out.println("Connection Fail");
            }else{
                System.out.println("Connection Success");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
