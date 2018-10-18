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
 * @Description: daoʵ����
 * @author XHChen
 * @date 2018��10��15�� ����10:59:01
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// �̳�SqlSessionDaoSupport��ͨ��this.getSqlSession()����SqlSession
		SqlSession SqlSession = this.getSqlSession();

		// ��ѯid
		User user = SqlSession.selectOne("test.findUserById", 1);

		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// �̳�SqlSessionDaoSupport��ͨ��this.getSqlSession()����SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// �������ݿ�
		sqlSession.insert("test.insertUser", user);
		
		// �ύ����
		sqlSession.commit();
		
		// �ر�Դ
		sqlSession.close();

	}

	@Override
	public void updateUser(User user) throws Exception {
		// �̳�SqlSessionDaoSupport��ͨ��this.getSqlSession()����SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// �������ݿ�
		sqlSession.update("test.updateUser", user);
		
		// �ύ����
		sqlSession.commit();
		
		// �ر�Դ
		sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		// �̳�SqlSessionDaoSupport��ͨ��this.getSqlSession()����SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// �������ݿ�
		sqlSession.delete("test.deleteUser", id);
		
		// �ύ����
		sqlSession.commit();
		
		// �ر�Դ
		sqlSession.close();

	}

	@Override
	public List<User> findUserByLike(String name) throws Exception {
		// �̳�SqlSessionDaoSupport��ͨ��this.getSqlSession()����SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		// �������ݿ�
		List<User> list = sqlSession.selectList("test.findUserByLike", name);
		
		return list;
	}

}
