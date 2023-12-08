package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.FoodDetailVO;

public interface IF_FoodDetailDAO {
	public void insertFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
	public List<FoodDetailVO> selectFood(int food_no) throws DataAccessException, Exception;
	public List<FoodDetailVO> selectAll() throws DataAccessException, Exception;
	public void updateFoodCnt(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
	public void deleteFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
}
