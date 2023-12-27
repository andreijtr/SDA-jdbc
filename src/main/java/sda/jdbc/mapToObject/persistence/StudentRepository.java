package sda.jdbc.mapToObject.persistence;

import sda.jdbc.mapToObject.model.Student;

import java.sql.*;

public class StudentRepository {

    public Student findById(int id) {
        try(Connection connection = DatabaseUtils.getConnection();
            PreparedStatement selectStmt = connection.prepareStatement("select * from students s where s.id = ?")
        ) {
            selectStmt.setInt(1, id);
            ResultSet rs = selectStmt.executeQuery();
            Student student = null;
            while (rs.next()) {
                student = mapToStudent(rs);
            }
            return student;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oups! Something went wrong during database action.");
        }
    }

    private Student mapToStudent(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setAge(rs.getInt("age"));
        student.setCreatedDate(rs.getString("created_date"));
        return student;
    }
}
