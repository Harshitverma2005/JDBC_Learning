import java.sql.*; //import library

public class joining {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver"); // Load and register the class


        String url = "jdbc:postgresql://localhost:5432/Student";
        String username = "postgres";
        String password = "Radha";
 //DriverManager.getConnection(url,username,password);
   //     System.out.println("Connection Established");


        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","Radha"); // create connection ;
        System.out.println("Connection Established");

        Statement statement = con.createStatement();

       ResultSet rs =  statement.executeQuery("select * from Student "); //create the Statement

//        rs.next();
//        rs.updateRow();
//       String name = rs.getString(3); // Execute the query
//
//        System.out.println(name ); //print it


        while(rs.next()){
            System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
        }

       con.close(); // close it
        System.out.println("Connection Closed");



    }
}
