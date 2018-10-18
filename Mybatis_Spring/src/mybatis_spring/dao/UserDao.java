package mybatis_spring.dao;

import java.util.List;

import mybatis_spring.pojo.User;

/**
 * 
 * ClassName: UserDao
 * 
 * @Description: dao接口
 * @author XHChen
 * @date 2018年10月15日 上午10:53:10
 */
public interface UserDao {

	// 添加
	public void insertUser(User user) throws Exception;

	// 修改
	public void updateUser(User user) throws Exception;

	// 删除
	public void deleteUser(int id) throws Exception;

	// 通过id查询
	public User findUserById(int id) throws Exception;

	// 简单模糊查询
	public List<User> findUserByLike(String name) throws Exception;

}
