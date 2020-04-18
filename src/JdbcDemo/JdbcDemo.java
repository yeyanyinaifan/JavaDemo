package JdbcDemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {
    public static void main(String[] args) {
        List<Student> students = new JdbcDemo().findAll();
        System.out.println(students);

        /*
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234qwer");

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql:///mydb?useSSL=false", "root", "1234qwer");
//            String sql = "UPDATE student SET Math = 100 WHERE id = 1";
//            String sql = "insert into student values(null, '伊奈帆', 100, 100, 100)";
//            String sql = "delete from student where id = 2";
            String sql = "select * from student";
            statement = connection.createStatement();
//            int count = statement.executeUpdate(sql);
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                long id = res.getLong("Id");
                String username = res.getString("Username");
                int math = res.getInt("Math");
                int english = res.getInt("English");
                int chinese = res.getInt("Chinese");
                System.out.println(id + "---" + username + "---" + math + "---" + english + "---" + chinese);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         */
    }

    /**
     * 查询所有Student对象
     * @return
     */
    public List<Student> findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet res = null;
        List<Student> list = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql:///mydb?useSSL=false", "root", "1234qwer");
//            String sql = "UPDATE student SET Math = 100 WHERE id = 1";
//            String sql = "insert into student values(null, '伊奈帆', 100, 100, 100)";
//            String sql = "delete from student where id = 2";
            String sql = "select * from student";
            statement = connection.createStatement();
//            int count = statement.executeUpdate(sql);
            res = statement.executeQuery(sql);
            Student student = null;
            list = new ArrayList<>();
            while (res.next()) {
                long id = res.getLong("Id");
                String username = res.getString("Username");
                int math = res.getInt("Math");
                int english = res.getInt("English");
                int chinese = res.getInt("Chinese");
                System.out.println(id + "---" + username + "---" + math + "---" + english + "---" + chinese);
                student = new Student(id, username, math, english, chinese);
                list.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
