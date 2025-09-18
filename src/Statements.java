import java.sql.*;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver"); // Load and register the class


        String url = "jdbc:postgresql://localhost:5432/Student";
        String username = "postgres";
        String password = "Radha";
        String insert = "insert into student values (?,?,?)";
        String update = "update student set st_name = '?' where stid = ? ";
        String delete = "delete from student where stid=5";

        Scanner inpit = new Scanner(System.in);
        System.out.println( "id , name  ");
        int id = inpit.nextInt();
        String name = inpit.next();
       // int marks = inpit.nextInt();

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","Radha"); // create connection ;
        System.out.println("Connection Established");

        Statement statement = con.createStatement();


        PreparedStatement st= con.prepareStatement(update);
       // st.setInt(1,id);
        st.setString(2,name);
        st.setInt(1,id);
        st.update
        st.executeUpdate();

//        statement.execute(update);

        ResultSet rs2 =  statement.executeQuery("select * from Student "); //create the Statement
        while(rs2.next()){
            System.out.println(rs2.getInt(1)+" : "+rs2.getString(2)+" : "+rs2.getInt(3));
        }




        con.close(); // close it
        System.out.println("Connection Closed");



    }
}
