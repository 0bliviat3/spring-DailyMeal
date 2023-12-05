package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.MenuVO;

public interface IF_MenuDAO {
	
	void insertMenu(MenuVO menuVO) throws DataAccessException, Exception;
	MenuVO selectOne(int menu_no) throws DataAccessException, Exception;
	List<MenuVO> selectAll() throws DataAccessException, Exception;

}
