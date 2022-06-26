package AStimulatorSystem;
import java.sql.*;

/**
 *
 * @author pooja
 */
//create conn class
public class conn {
   Connection c=null;
   Statement s=null;
   public conn(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");//JDBC driver class
           c =DriverManager.getConnection("jdbc:mysql://localhost:3303/project2","root","");//database conection
           s =c.createStatement();
       }catch(Exception e){
           System.out.println(e);
       }
       
   }
}