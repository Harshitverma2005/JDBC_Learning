import java.sql.*;

public class CRUD {

       public static void main(String[] args) throws SQLException, ClassNotFoundException {

            Class.forName("org.postgresql.Driver"); // Load and register the class


            String url = "jdbc:postgresql://localhost:5432/Student";
            String username = "postgres";
            String password = "Radha";
            String insert = "insert into student values (5,'Nonu',19)";
           String update = "update student set st_name = 'Harshit' where stid = 5 ";
           String delete = "delete from student where stid=5";



            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","Radha"); // create connection ;
            System.out.println("Connection Established");

            Statement statement = con.createStatement();

//            statement.execute(insert);
//
//            ResultSet rs =  statement.executeQuery("select * from Student "); //create the Statement
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
//            }
           statement.execute(insert );
           statement.execute(update);

           ResultSet rs2 =  statement.executeQuery("select * from Student "); //create the Statement
           while(rs2.next()){
               System.out.println(rs2.getInt(1)+" : "+rs2.getString(2)+" : "+rs2.getInt(3));
           }

//           statement.execute(delete);
//
//           ResultSet rs3 =  statement.executeQuery("select * from Student "); //create the Statement
//           while(rs3.next()){
//               System.out.println(rs3.getInt(1)+" : "+rs3.getString(2)+" : "+rs3.getInt(3));
//           }


            con.close(); // close it
            System.out.println("Connection Closed");



        }
    }


