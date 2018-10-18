package mybatis_spring.test;

import java.io.IOException;
import java.util.List;

import mybatis_spring.mapper.UserMapper;
import mybatis_spring.pojo.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

	// 创建会话工厂
	private ApplicationContext applicationContext;
	
	// 创建bean
	private UserMapper userMapper;

	@Before
	/**
	 * 
	 * @Description: 加载配置文件
	 * @param @throws IOException   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月14日 下午9:50:19
	 */
	public void setUp() throws IOException {
		// 定义核心配置文件
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	
		// 获得bean对象
	    userMapper = (UserMapper) applicationContext.getBean("userMapper");
	}

	@Test
	/**
	 * 
	 * @Description: 添加数据库数据
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月15日 下午3:33:01
	 */
	public void testInsertUser() throws Exception {
		
		// 创建实体类
		User user = new User();
		user.setUsername("XHChen_06");
		user.setPassword("ID9527");

		// 调用接口方法
		userMapper.insertUser(user);
	}

	@Test
	/**
	 * 
	 * @Description: 更新数据库数据
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月15日 下午3:34:42
	 */
	public void testUpdateUser() throws Exception {

		// 创建实体类
		User user = new User();
		user.setId(19);
		user.setUsername("XHChen_06");
		user.setPassword("ID9532");

		// 调用接口方法
		userMapper.updateUser(user);

	}

	@Test
	/**
	 * 
	 * @Description: 删除数据库数据
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月15日 下午3:35:49
	 */
	public void testDeleteUser() throws Exception {

		// 调用接口方法
		userMapper.deleteUser(19);

	}

	@Test
	/**
	 * 
	 * @Description: 通过id查询,动态代理接口
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月14日 下午9:50:08
	 */
	public void testfindUserById() throws Exception {

		// 查询操作
		User user = userMapper.findUserById(16);

		System.out.println(user);

	}

	@Test
	/**
	 * 
	 * @Description: 根据名称查询
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018年10月15日 下午3:36:37
	 */
	public void testFindUserByLike() throws Exception {

		// 查询操作
		List<User> list = userMapper.findUserByLike("XHChen");

		for (User user : list) {
			System.out.println(user);
		}
		System.out.println(list.size());

	}

}
