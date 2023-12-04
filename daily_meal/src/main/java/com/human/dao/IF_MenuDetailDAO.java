package com.human.dao;

import java.sql.SQLException;
import java.util.List;

import com.human.VO.MenuDetailVO;

public interface IF_MenuDetailDAO {
	
	void insertMenuDetail(MenuDetailVO menuDetailVO) throws SQLException;
	List<MenuDetailVO> selectMenu(int menu_no) throws SQLException;

}
