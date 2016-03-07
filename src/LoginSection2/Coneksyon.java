package LoginSection2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Coneksyon
{
    public static Connection con;
    
    public static void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/section2","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e + "Connection failed");
        }
    }
}