package com.pension.hp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.ReservationDAO;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationDAO reservationDAO;
	
	public int reserve(String reservationnum,
			String roomid, 
			String reservationname,
			String reservationdate){
		
	return reservationDAO.reserve(reservationnum, roomid, reservationname, reservationdate);
	}
	public List reservefind(String reservationname){
		
	return reservationDAO.reservefind(reservationname);
	}
	
}
