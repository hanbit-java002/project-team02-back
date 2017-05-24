package com.pension.hp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int reserve(String reservationnum, String roomid, 
			String reservationname,
			String reservationdate){
		
		Map param = new HashMap();
		param.put("reservationnum", reservationnum);
		param.put("roomid", roomid);
		param.put("reservationname", reservationname);
		param.put("reservationdate", reservationdate);
				
		return sqlSession.insert("reserve.insertreserve", param);
	}
	public List reservefind(String reservationname){
		
		Map param = new HashMap();
		param.put("reservationname", reservationname);
		
		return sqlSession.selectList("reserve.reservefind", param);
	}
}
