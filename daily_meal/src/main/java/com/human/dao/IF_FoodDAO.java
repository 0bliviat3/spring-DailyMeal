package com.human.dao;

import java.sql.SQLException;
import java.util.List;

import com.human.VO.FoodVO;

public interface IF_FoodDAO {
	
	void insertFood(FoodVO foodVO) throws SQLException;
	FoodVO selectOne(int food_no) throws SQLException;
	List<FoodVO> selectAll() throws SQLException;
	void updateFoodCost(FoodVO foodVO) throws SQLException;
}
