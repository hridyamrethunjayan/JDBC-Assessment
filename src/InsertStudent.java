import java.sql.*;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/student";
        String username=System.getenv("DB_USER");
        String password=System.getenv("DB_PASSWORD");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            System.out.println("Connection is successful!");

            String sql="INSERT INTO StudentDetails VALUES(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);

            System.out.println("Enter the number of students: (at least 5)");
            int n=in.nextInt();
            in.nextLine();

            if(n<5){
                System.out.println("Enter at least 5 students");
                return;
            }
            for(int i=1;i<=5;i++) {
                System.out.println("\nEnter details of student " + i);
                System.out.println("Enter the ID: ");
                int id = in.nextInt();
                in.nextLine();
                System.out.println("Enter the name: ");
                String name = in.nextLine();
                System.out.println("Enter the course: ");
                String course = in.nextLine();
                System.out.println("Enter the department: ");
                String dept = in.nextLine();
                System.out.println("Enter the section: ");
                String section = in.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, course);
                ps.setString(4, dept);
                ps.setString(5, section);

                ps.addBatch();
            }
            int[] results=ps.executeBatch();
            int processed=0;
            for(int result:results){
                if(result>=0)
                    processed++;
            }
            System.out.println("Batch inserted");

            System.out.println("Number of processed records: "+processed);

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
