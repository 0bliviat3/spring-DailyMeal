package com.human.dao;

import java.sql.SQLException;
import java.util.List;

import com.human.VO.MenuVO;

public interface IF_MenuDAO {
	
	void insertMenu(MenuVO menuVO) throws SQLException;
	MenuVO selectOne(int menu_no) throws SQLException;
	List<MenuVO> selectAll() throws SQLException;

}
