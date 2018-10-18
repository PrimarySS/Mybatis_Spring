package mybatis_spring.test;

import java.io.IOException;
import java.util.List;

import mybatis_spring.dao.UserDao;
import mybatis_spring.pojo.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

	// �����Ự����
	private ApplicationContext applicationContext;
	
	// ����bean
	private UserDao userDao;

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
	
		userDao = (UserDao) applicationContext.getBean("userDao");
	}

	@Test
	/**
	 * 
	 * @Description: ������ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����2:58:11
	 */
	public void testInsertUser() throws Exception {

		// ����ʵ����
		User user = new User();
		user.setUsername("XHChen_06");
		user.setPassword("ID9527");

		// ���ýӿڷ���
		userDao.insertUser(user);
	}

	@Test
	/**
	 * 
	 * @Description: �������ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:01:09
	 */
	public void testUpdateUser() throws Exception {

		// ����ʵ����
		User user = new User();
		user.setId(18);
		user.setUsername("XHChen_06");
		user.setPassword("ID9532");

		// ���ýӿڷ���
		userDao.updateUser(user);

	}

	@Test
	/**
	 * 
	 * @Description: ɾ�����ݿ�����
	 * @param    
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:03:42
	 */
	public void testDeleteUser() throws Exception {

		// ���ýӿڷ���
		userDao.deleteUser(18);

	}

	@Test
	/**
	 * 
	 * @Description: ͨ��id��ѯ,�̳�SqlSessionDaoSupport
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��14�� ����9:50:08
	 */
	public void testfindUserById() throws Exception {

		// ��ѯ����
		User user = userDao.findUserById(1);

		System.out.println(user);

	}

	@Test
	/**
	 * 
	 * @Description: �������Ʋ�ѯ
	 * @param @throws Exception   
	 * @return void  
	 * @throws
	 * @author XHChen
	 * @date 2018��10��15�� ����3:14:59
	 */
	public void testFindUserByLike() throws Exception {

		// ��ѯ����
		List<User> list = userDao.findUserByLike("XHChen");

		for (User user : list) {
			System.out.println(user);
		}
		System.out.println(list.size());

	}

}
