package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.FoodVO;

public interface IF_FoodDAO {
	
	void insertFood(FoodVO foodVO) throws DataAccessException, Exception;
	FoodVO selectOne(int food_no) throws DataAccessException, Exception;
	List<FoodVO> selectAll() throws DataAccessException, Exception;
	void updateFoodCost(FoodVO foodVO) throws DataAccessException, Exception;
}
