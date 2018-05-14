package imic.pactice.swing.imic.practice.jdbc;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class FirstExample {
    //JDBC name and database ULR
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_ULR = "jdbc:mysql://localhost/mycompany";

    //Database credentials
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection =null;
        Statement statement = null;


        try{
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //Open a connection
            connection = DriverManager.getConnection(DB_ULR, USER, PASSWORD);

            //Exectue a query
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM department");

            //Extract data from result set
            System.out.println("The departments list:");
            while(resultSet.next()){
                //Retrieve  by column name
                int departmentId = resultSet.getInt("idDepartment");
                String departmentName = resultSet.getString("Department_Name");

                //Display values

                System.out.println(departmentId + "\t" + departmentName);
            }

            //clean up enviroment
            resultSet.close();
            statement.close();
            connection.close();

        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //close resources
            try{
                if(statement!=null){
                    statement.close();
                }
            }catch (Exception se2){

            }

            try{
                if(connection!=null){
                    connection.close();
                }
            }catch (Exception se){
                se.printStackTrace();
            }
        }
    }

}

