package com.pension.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pension.hp.service.MainService;
import com.pension.hp.service.PostService;
import com.pension.hp.service.ReservationService;
import com.pension.hp.service.SearchService;

@RestController
public class MainController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private SearchService searchService;

	@RequestMapping("/api/sido")
	public List sidoList(){
		
		return mainService.sidoList();
	}
}
