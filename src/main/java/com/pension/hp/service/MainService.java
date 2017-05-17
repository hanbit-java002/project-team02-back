package com.pension.hp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pension.hp.dao.MainDAO;

@Service
public class MainService {
	
	@Autowired
	private MainDAO mainDAO;

	public List sidoList(){
		return mainDAO.sidoList();
	}
}
