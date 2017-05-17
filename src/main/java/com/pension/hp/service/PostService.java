package com.pension.hp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.PostDAO;
@Service
public class PostService {
	
	@Autowired
	private PostDAO postDAO;
	
	public int post(String title, String contents){
		return postDAO.post(title, contents);
	}
	
}
