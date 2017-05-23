package com.pension.hp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.SearchDAO;

@Service
public class SearchService {
	
	@Autowired
	private SearchDAO searchDAO;
	
	public List search(String gugunid){
		return searchDAO.search(gugunid);
	}
	public List searchroom(String pensionid){
		return searchDAO.searchroom(pensionid);
	}
	public List roominfo(String roomname){
		return searchDAO.roominfo(roomname);
	}
}
