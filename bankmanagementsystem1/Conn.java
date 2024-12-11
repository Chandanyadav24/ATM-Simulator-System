
package bank.management.system1;

import java.sql.*;
public class Conn {
   Connection c;
   Statement s;
      public Conn(){
          try{
              c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem1","root", "NewPass!1234" );
              s =c.createStatement();
          }catch(Exception e){
              System.out.println(e);
          }
      }
}
//----------------------------------------------------
//jdbc connection
//1. register the driver
//2. create connectiion
//3. create statement
//4. excute query
//5. close connection