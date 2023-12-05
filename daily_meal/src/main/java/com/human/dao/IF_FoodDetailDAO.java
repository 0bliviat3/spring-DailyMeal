package com.human.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.human.VO.FoodDetailVO;

public interface IF_FoodDetailDAO {
	void insertFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
	List<FoodDetailVO> selectFood(int food_no) throws DataAccessException, Exception;
	List<FoodDetailVO> selectAll() throws DataAccessException, Exception;
	void updateFoodCnt(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
	void deleteFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception;
}
