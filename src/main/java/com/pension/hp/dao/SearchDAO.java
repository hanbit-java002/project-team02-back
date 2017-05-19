package com.pension.hp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SearchDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int search(String pensionSearch){
		
		Map param = new HashMap();
		param.put("pensionSearch", pensionSearch);
		
		return sqlSession.insert("search.insertreserve", param);
	}
}
