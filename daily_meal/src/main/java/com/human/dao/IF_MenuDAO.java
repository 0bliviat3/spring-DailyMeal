package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.MenuVO;

public interface IF_MenuDAO {
	
	public void insertMenu(MenuVO menuVO) throws DataAccessException, Exception;
	public MenuVO selectOne(int menu_no) throws DataAccessException, Exception;
	public MenuVO selectMenuByCategory(MenuVO menuVO) throws DataAccessException, Exception;
	public List<MenuVO> selectAll() throws DataAccessException, Exception;

}
