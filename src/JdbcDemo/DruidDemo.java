package JdbcDemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import utils.JDBCDruidUtils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
//        //3.加载配置文件
//        Properties properties = new Properties();
//        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
//        properties.load(inputStream);
//        //4.获取连接池对象
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        //5.获取连接
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn);

        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            connection = JDBCDruidUtils.getConnection();
            //2.定义sql
            String sql = "insert into student values(null,?,?,?,?)";
            //3.获取pstmt对象
            pstmt = connection.prepareStatement(sql);
            //4.给？赋值
            pstmt.setString(1, "王五");
            pstmt.setInt(2, 100);
            pstmt.setInt(3, 100);
            pstmt.setInt(4, 100);
            //5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCDruidUtils.close(null, pstmt, connection);
        }
    }
}
