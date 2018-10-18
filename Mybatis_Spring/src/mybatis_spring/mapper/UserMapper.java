package mybatis_spring.mapper;

import java.util.List;

import mybatis_spring.pojo.User;

/**
 * 
 * ClassName: UserMapper
 * 
 * @Description: ʵ��pojo��User�ӿ�
 * @author XHChen
 * @date 2018��10��14�� ����9:48:48
 */
public interface UserMapper {

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
