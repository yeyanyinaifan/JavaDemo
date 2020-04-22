package JdbcDemo;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCDruidUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "update student set math = 90 where id = ?";
        int count = jdbcTemplate.update(sql, 1);
        System.out.println(count);
    }

    @Test
    public void test1() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "insert into student values(null, ?, ?, ? ,?) ";
        int count = jdbcTemplate.update(sql, "伊奈帆", 100, 100, 100);
        System.out.println(count);
    }

    @Test
    public void test2() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "insert into student values(null, ?, ?, ? ,?) ";
        int count = jdbcTemplate.update(sql, "伊奈帆", 100, 100, 100);
        System.out.println(count);
    }

    @Test
    public void test3() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "delete from student where id = ?";
        int count = jdbcTemplate.update(sql, 12);
        System.out.println(count);
    }

    @Test
    public void test4() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "select * from student where id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1);
        System.out.println(stringObjectMap);
    }

    @Test
    public void test5() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void test6() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setUsername(resultSet.getString("username"));
                student.setMath(resultSet.getInt("math"));
                student.setEnglish(resultSet.getInt("english"));
                student.setChinese(resultSet.getInt("chinese"));
                return student;
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test7() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test8(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "select count(id) from student";
        Long total = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
