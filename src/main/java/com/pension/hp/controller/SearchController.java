package com.pension.hp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pension.hp.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/api/search", method=RequestMethod.POST)
	@ResponseBody
	public Map reserve(@RequestParam("pensionSearch")String customername){
		
		SearchService.reserve(customername);
		
		Map result= new HashMap();
		result.put("result", "ok");
		
		return result;
	}
}
