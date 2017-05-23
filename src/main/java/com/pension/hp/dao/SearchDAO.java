package com.pension.hp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SearchDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List search(String gugunid){
		
		Map param = new HashMap();
		param.put("gugunid", gugunid);
		
		return sqlSession.selectList("search.searchresult", param);
	}
	public List searchroom(String pensionid){
		
		Map param = new HashMap();
		param.put("pensionid", pensionid);
		
		return sqlSession.selectList("search.searchroomresult", param);
	}
	public List roominfo(String roomname){
		
		Map param = new HashMap();
		param.put("roomname", roomname);
		
		return sqlSession.selectList("search.roominfo", param);
	}
}
