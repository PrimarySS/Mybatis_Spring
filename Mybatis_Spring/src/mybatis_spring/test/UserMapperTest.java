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

	// �����Ự����
	private ApplicationContext applicationContext;
	
	// ����bean
	private UserMapper userMapper;

	@Before
	/**
	 * 
	 * @Description: ���������ļ�
	 * @param @throws IOException   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��14�� ����9:50:19
	 */
	public void setUp() throws IOException {
		// ������������ļ�
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	
		// ���bean����
	    userMapper = (UserMapper) applicationContext.getBean("userMapper");
	}

	@Test
	/**
	 * 
	 * @Description: ������ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:33:01
	 */
	public void testInsertUser() throws Exception {
		
		// ����ʵ����
		User user = new User();
		user.setUsername("XHChen_06");
		user.setPassword("ID9527");

		// ���ýӿڷ���
		userMapper.insertUser(user);
	}

	@Test
	/**
	 * 
	 * @Description: �������ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:34:42
	 */
	public void testUpdateUser() throws Exception {

		// ����ʵ����
		User user = new User();
		user.setId(19);
		user.setUsername("XHChen_06");
		user.setPassword("ID9532");

		// ���ýӿڷ���
		userMapper.updateUser(user);

	}

	@Test
	/**
	 * 
	 * @Description: ɾ�����ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:35:49
	 */
	public void testDeleteUser() throws Exception {

		// ���ýӿڷ���
		userMapper.deleteUser(19);

	}

	@Test
	/**
	 * 
	 * @Description: ͨ��id��ѯ,��̬����ӿ�
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��14�� ����9:50:08
	 */
	public void testfindUserById() throws Exception {

		// ��ѯ����
		User user = userMapper.findUserById(16);

		System.out.println(user);

	}

	@Test
	/**
	 * 
	 * @Description: �������Ʋ�ѯ
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:36:37
	 */
	public void testFindUserByLike() throws Exception {

		// ��ѯ����
		List<User> list = userMapper.findUserByLike("XHChen");

		for (User user : list) {
			System.out.println(user);
		}
		System.out.println(list.size());

	}

}
