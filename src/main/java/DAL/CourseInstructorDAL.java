/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DAL.DatabaseConnect;
import com.mycompany.course.DTO.CourseInstructorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import scala.Int;

public class CourseInstructorDAL {

 
    
    public static List<CourseInstructorDTO> getAllCourseInstructors() {
        DatabaseConnect.connectDB();
        List<CourseInstructorDTO> courseInstructors = new ArrayList<>();
        Connection connection = DatabaseConnect.getConnection();

        try {
            String sql = "SELECT * FROM CourseInstructor";
            ResultSet rs = DatabaseConnect.doReadQuery(sql);

            while (rs.next()) {
                int instructorId = rs.getInt("PersonID");
                int courseId = rs.getInt("CourseID");

                // Tạo đối tượng CourseInstructor và thêm vào danh sách
                CourseInstructorDTO courseInstructor = new CourseInstructorDTO(instructorId, courseId);
                courseInstructors.add(courseInstructor);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        DatabaseConnect.closeConnection();
        return courseInstructors;
    }

    public static List<String> getAllPersonName() {
            List<String> PersonName = new ArrayList<>();
        
            Connection connection = DatabaseConnect.getConnection();

            try {
                String sql = "SELECT Lastname,Firstname FROM Person Where HireDate>0";
                ResultSet rs = DatabaseConnect.doReadQuery(sql);

                while (rs.next()) {
 
                       String firstName = rs.getString("Firstname");
                        String lastName = rs.getString("Lastname");
                        String fullname=firstName+ ' ' +lastName;

         
                    PersonName.add(fullname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } 
           
            return PersonName;
        }
        public static List<String> getAllTitleCourse() {
            List<String> TitleCourse = new ArrayList<>();
           
            Connection connection = DatabaseConnect.getConnection();

            try {
                String sql = "SELECT Title FROM Course";
                ResultSet rs = DatabaseConnect.doReadQuery(sql);

                while (rs.next()) {
                       String Titlecourse = rs.getString("Title");


                    // Tạo đối tượng CourseInstructor và thêm vào danh sác

                    TitleCourse.add(Titlecourse);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } 
           
            return TitleCourse;
        }
    public static void updateCourseInstructorbyname(CourseInstructorDTO courseInstructor) {
        DatabaseConnect.connectDB();
        Connection connection = DatabaseConnect.getConnection();
        try {
            String sql = "UPDATE CourseInstructor SET courseId = ? WHERE PersonID= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, courseInstructor.getCourseID());
            preparedStatement.setInt(2, courseInstructor.getPersonID());
            preparedStatement.executeUpdate();System.out.println(""+preparedStatement.executeUpdate());
        } catch (SQLException ex) {
            ex.printStackTrace();
<<<<<<< HEAD
        } finally {
            DatabaseConnect.closeConnection();
        }
       
        System.out.println("da cap nhap");
        DatabaseConnect.closeConnection();
    }
    public static void updateCourseInstructor(CourseInstructorDTO courseInstructor) {
        DatabaseConnect.connectDB();
        Connection connection = DatabaseConnect.getConnection();
        try {
            String sql = "UPDATE CourseInstructor SET PersonID = ? WHERE courseId= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, courseInstructor.getCourseID());
            preparedStatement.setInt(2, courseInstructor.getPersonID());
            preparedStatement.executeUpdate();System.out.println(""+preparedStatement.executeUpdate());
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DatabaseConnect.closeConnection();
        }
        System.out.println("da cap nhap");
        DatabaseConnect.closeConnection();
=======
        } 
>>>>>>> 38a3ccb7866b2f215484f4bd53678c14ced512de
    }

    public static String getPersonNameById(int personId) {
        String personName = null;
      
        Connection connection = DatabaseConnect.getConnection();

        try {
            
            String sql = "SELECT Firstname, Lastname FROM Person WHERE PersonID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, personId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                String firstName = resultSet.getString("Firstname");
                String lastName = resultSet.getString("Lastname");

                personName = firstName + " " + lastName;
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 

        return personName;
    }

    public static String getTitleById(int courseId) {
        String title = null;
     
        Connection connection = DatabaseConnect.getConnection();

        try {
            String sql = "SELECT Title FROM Course WHERE CourseID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, courseId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                title = resultSet.getString("Title");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
       
        return title;
    }
     
    

 public static int getIDbyname(String nameperson) {
     int ID = 0;
        DatabaseConnect.connectDB();
        Connection connection = DatabaseConnect.getConnection();

        try {
            System.out.println(nameperson);
            String sql = "SELECT PersonID FROM `person` WHERE HireDate > 0 AND CONCAT(Firstname, ' ', Lastname) LIKE ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, nameperson +"%");

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

              ID=resultSet.getInt("PersonID");
              
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        DatabaseConnect.closeConnection();
        return ID;
    }

     public static int getIDbyTITLE(String title)
     {
     int ID = 0;
        DatabaseConnect.connectDB();
        Connection connection = DatabaseConnect.getConnection();

        try {
            System.out.println(title);
            String sql = "SELECT CourseID FROM `course` WHERE Title=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, title);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

              ID=resultSet.getInt("CourseID");
              
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        DatabaseConnect.closeConnection();
        return ID;
    }
    
}

