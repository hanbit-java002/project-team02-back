package com.pension.hp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pension.hp.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(value="/api/reserve", method=RequestMethod.POST)
	@ResponseBody
	public Map reserve(@RequestParam("reservationnum")String reservationnum,
			@RequestParam("roomid")String roomid,
			@RequestParam("reservationname")String reservationname, 
			@RequestParam("reservationdate")String reservationdate){
		System.out.println(roomid);
		System.out.println(reservationnum);
		reservationService.reserve(reservationnum, roomid, reservationname, reservationdate);
		
		Map result= new HashMap();
		result.put("result", "ok");
		
		return result;
	}
	@RequestMapping(value="/api/reservefind", method=RequestMethod.POST)
	@ResponseBody
	public Map reserve(@RequestParam("reservationname")String reservationname){
		
		List list = reservationService.reservefind(reservationname);
		
		Map result= new HashMap();
		result.put("list", list);
		
		return result;
	}
}
