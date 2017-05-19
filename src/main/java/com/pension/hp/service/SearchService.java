package com.pension.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.SearchDAO;

@Service
public class SearchService {
	
	@Autowired
	private SearchDAO searchDAO;
	
	public int search(String pensionSearch){
		return searchDAO.search(pensionSearch);
	}
}
