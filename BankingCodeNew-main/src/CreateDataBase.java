import java.sql.*;
//database creation using java and mysql
public class CreateDataBase {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/";
    static final String user = "root";
    static final String pass = "password";
    public void createDatabase () {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database .... ");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Creating database");
            st= conn.createStatement();
            String sql = "Create Database Registration";
            st.executeUpdate(sql);
            System.out.println("Database created successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (st!=null)
                    st.close();
            }catch (SQLException e1){

            }try {
                if (conn!=null)
                    conn.close();
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
        System.out.println("Signing out");
    }
}
