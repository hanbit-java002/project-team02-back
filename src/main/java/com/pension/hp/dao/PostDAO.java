package com.pension.hp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int post(String title, String contents){
		
		Map param = new HashMap();
		param.put("title", title);
		param.put("contents", contents);
		
		return sqlSession.insert("post.insertpost", param);
	}
}
