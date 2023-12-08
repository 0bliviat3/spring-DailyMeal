package com.human.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.human.VO.MenuVO;

@Repository
public class MenuImpl implements IF_MenuDAO{
private static String mapperQuery= "com.human.dao.IF_MenuDAO";
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void insertMenu(MenuVO menuVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".insertMenu",menuVO);
	}

	@Override
	public MenuVO selectOne(int menu_no) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+"selectMenu",menu_no);
	}

	@Override
	public List<MenuVO> selectAll() throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectMenuList");
	}
}
