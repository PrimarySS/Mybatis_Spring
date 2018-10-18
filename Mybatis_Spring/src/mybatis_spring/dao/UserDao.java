package mybatis_spring.dao;

import java.util.List;

import mybatis_spring.pojo.User;

/**
 * 
 * ClassName: UserDao
 * 
 * @Description: dao�ӿ�
 * @author XHChen
 * @date 2018��10��15�� ����10:53:10
 */
public interface UserDao {

	// ���
	public void insertUser(User user) throws Exception;

	// �޸�
	public void updateUser(User user) throws Exception;

	// ɾ��
	public void deleteUser(int id) throws Exception;

	// ͨ��id��ѯ
	public User findUserById(int id) throws Exception;

	// ��ģ����ѯ
	public List<User> findUserByLike(String name) throws Exception;

}
