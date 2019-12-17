
package questionsetter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TeleTeach
 */
public class connection {
    public static void main(String[] args) {
 
        // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        // Step 1: Loading or 
        // registering Oracle JDBC driver class
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            ClassNotFoundException err = cnfex;
           // JOptionPane.showMessageDialog(this,"Problem in loading or registering MS Access JDBC driver\n"+err);                   
        }
 
        // Step 2: Opening database connection
        try {
            String msAccDB = "lib/DB/question_setter.accdb";
            String dbURL = "jdbc:ucanaccess://"+ msAccDB;
            //connection.setAutoCommit(false);
            java.util.Properties prop = new java.util.Properties();
            prop.put("charSet", "UTF-8");
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL,prop); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
                
            System.out.println("Connected");
            // Step 2.C: Executing SQL and 
           
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
            System.out.println("SQLException has occured"+sqlex);
        }       
    }
}
