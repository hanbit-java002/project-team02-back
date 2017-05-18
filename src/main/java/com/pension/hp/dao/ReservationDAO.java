package com.pension.hp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int reserve(String customername){
		
		Map param = new HashMap();
		param.put("customername", customername);
		
		return sqlSession.insert("reserve.insertreserve", param);
	}
}
