package medical.store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Souvik
 */
    import java.sql.Connection;
    import java.sql.DriverManager;
public class DBConnection 
{
    static Connection con;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore","root","password");
            if(con!=null)
            {
                System.out.println("Connection Successful");
            }
            else
            {
                System.out.println("Connection Unsuccessful");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
    public static void main(String []args)
    {
        
    }
}


    
    

