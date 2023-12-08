package com.human.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.human.VO.MenuDetailVO;

@Repository
public class MenuDetailImpl implements IF_MenuDetailDAO{
private static String mapperQuery= "com.human.dao.IF_MenuDetailDAO";
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void insertMenuDetail(MenuDetailVO menuDetailVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".insertMenuDetail",menuDetailVO);
	}

	@Override
	public List<MenuDetailVO> selectMenu(int menu_no) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectMenu",menu_no);
	}
}
