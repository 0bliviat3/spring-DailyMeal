package com.human.dao;

import java.sql.SQLException;
import java.util.List;

import com.human.VO.FoodDetailVO;

public interface IF_FoodDetailDAO {
	void insertFoodDetail(FoodDetailVO foodDetailVO) throws SQLException;
	List<FoodDetailVO> selectFood(int food_no) throws SQLException;
	List<FoodDetailVO> selectAll() throws SQLException;
	void updateFoodCnt(FoodDetailVO foodDetailVO) throws SQLException;
	void deleteFoodDetail(FoodDetailVO foodDetailVO) throws SQLException;
}
