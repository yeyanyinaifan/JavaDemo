package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.utils.JDBCDruidUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author irv
 * @date 2020/12/31
 */
public class UserDao {
    public UserDao() {
    }

    private JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());

    /**
     * @Description: 用户登录方法
     * @Param: [loginUser]
     * @return: cn.itcast.domain.User
     * @Author: irv
     * @Date: 2020/12/31
     */
    public User login(User loginUser) {
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),
                    loginUser.getUserName(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            //记录日志
            e.printStackTrace();
            return null;
        }
    }

}
