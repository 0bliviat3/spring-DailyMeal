package com.human.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.human.VO.FoodVO;

@Repository
public class FoodImpl implements IF_FoodDAO{
private static String mapperQuery= "com.human.dao.IF_FoodDAO";
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void insertFood(FoodVO foodVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".insertFood",foodVO);
	}

	@Override
	public FoodVO selectOne(int food_no) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".selectFood", food_no);
	}

	@Override
	public List<FoodVO> selectAll() throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectFoodList");
	}

	@Override
	public void updateFoodCost(FoodVO foodVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		int updateFoodCost = foodVO.getFood_cost();
		sqlSession.update(mapperQuery+".updateFood",updateFoodCost);
	}

}
