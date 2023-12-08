package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.FoodVO;

public interface IF_FoodDAO {
	
	public void insertFood(FoodVO foodVO) throws DataAccessException, Exception;
	public FoodVO selectOne(int food_no) throws DataAccessException, Exception;
	public List<FoodVO> selectAll() throws DataAccessException, Exception;
	public void updateFoodCost(FoodVO foodVO) throws DataAccessException, Exception;
}
