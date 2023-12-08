package com.human.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.human.VO.FoodDetailVO;

@Repository
public class FoodDetailImpl implements IF_FoodDetailDAO{
private static String mapperQuery= "com.human.dao.IF_FoodDetailDAO";
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void insertFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".insertFoodDetail",foodDetailVO);
	}

	@Override
	public List<FoodDetailVO> selectFood(int food_no) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectFoodDetail",food_no);
	}

	@Override
	public List<FoodDetailVO> selectAll() throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectFoodDetailList");
	}

	@Override
	public void updateFoodCnt(FoodDetailVO foodDetailVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		int updateFoodCnt = foodDetailVO.getFood_cnt();
		sqlSession.update(mapperQuery+".updateFoodDetail",updateFoodCnt);
	}

	
	// 이건 질문 있음
	@Override
	public void deleteFoodDetail(FoodDetailVO foodDetailVO) throws DataAccessException, Exception {
		// TODO Auto-generated method stub
		int deleteFoodNo = foodDetailVO.getFood_no();
		sqlSession.delete(mapperQuery+".deleteFoodDetail",deleteFoodNo);
	}
}
