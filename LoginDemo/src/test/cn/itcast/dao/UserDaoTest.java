package test.cn.itcast.dao; 

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserDao Tester. 
* 
* @author <Authors name> 
* @since <pre>12月 31, 2020</pre> 
* @version 1.0 
*/ 
public class UserDaoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: login(User loginUser) 
* 
*/ 
@Test
public void testLogin() throws Exception {
    User loginUser = new User();
    loginUser.setUserName("hyf");
    loginUser.setPassword("123456");

    UserDao userDao = new UserDao();
    User user = userDao.login(loginUser);
    System.out.println(user);
} 


} 
