package mybatis_spring.dao.impl;

import java.util.List;

import mybatis_spring.dao.UserDao;
import mybatis_spring.pojo.User;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 
 * ClassName: UserDaoImpl
 * 
 * @Description: dao实现类
 * @author XHChen
 * @date 2018年10月15日 上午10:59:01
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()创建SqlSession
		SqlSession SqlSession = this.getSqlSession();

		// 查询id
		User user = SqlSession.selectOne("test.findUserById", 1);

		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()创建SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// 插入数据库
		sqlSession.insert("test.insertUser", user);
		
		// 提交事务
		sqlSession.commit();
		
		// 关闭源
		sqlSession.close();

	}

	@Override
	public void updateUser(User user) throws Exception {
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()创建SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// 插入数据库
		sqlSession.update("test.updateUser", user);
		
		// 提交事务
		sqlSession.commit();
		
		// 关闭源
		sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()创建SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// 插入数据库
		sqlSession.delete("test.deleteUser", id);
		
		// 提交事务
		sqlSession.commit();
		
		// 关闭源
		sqlSession.close();

	}

	@Override
	public List<User> findUserByLike(String name) throws Exception {
		// 继承SqlSessionDaoSupport，通过this.getSqlSession()创建SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// 插入数据库
		List<User> list = sqlSession.selectList("test.findUserByLike", name);
		
		return list;
	}

}
