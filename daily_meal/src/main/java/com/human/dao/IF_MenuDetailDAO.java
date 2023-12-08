package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.MenuDetailVO;

public interface IF_MenuDetailDAO {
	
	public void insertMenuDetail(MenuDetailVO menuDetailVO) throws DataAccessException, Exception;
	public List<MenuDetailVO> selectMenu(int menu_no) throws DataAccessException, Exception;

}
