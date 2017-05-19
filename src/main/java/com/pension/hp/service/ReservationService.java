package com.pension.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.ReservationDAO;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationDAO reservationDAO;
	
	public int reserve(String customername, String roomid,String num,
			String date){
		
		return reservationDAO.reserve(customername, roomid, num, date);
		}
}
