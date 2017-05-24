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

import com.pension.hp.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/api/search", method=RequestMethod.POST)
	@ResponseBody
	public Map search(@RequestParam("gugunid")String gugunid){
		
		List list = searchService.search(gugunid);
		
		Map result= new HashMap();
		result.put("list", list);
		
		return result;
	}
	@RequestMapping(value="/api/searchroom", method=RequestMethod.POST)
	@ResponseBody
	public Map searchroom(@RequestParam("pensionid")String pensionid){
		
		List listroom = searchService.searchroom(pensionid);
		
		Map result= new HashMap();
		result.put("list", listroom);
		
		return result;
	}
	@RequestMapping(value="/api/roominfo", method=RequestMethod.POST)
	@ResponseBody
	public Map roominfo(@RequestParam("roomname")String roomname){
		
		List roominfo = searchService.roominfo(roomname);
		
		Map result= new HashMap();
		result.put("list", roominfo);
		
		return result;
	}
	@RequestMapping(value="/api/findroomid", method=RequestMethod.POST)
	@ResponseBody
	public Map findroomid(@RequestParam("roomid")String roomid){
		
		List roomidfind = searchService.findroomid(roomid);
		
		Map result= new HashMap();
		result.put("list", roomidfind);
		
		return result;
	}
	@RequestMapping(value="/api/findpension", method=RequestMethod.POST)
	@ResponseBody
	public Map findpension(@RequestParam("pensionid")String pensionid){
		
		List pensionidlist = searchService.findpension(pensionid);
		
		Map result= new HashMap();
		result.put("list", pensionidlist);
		
		return result;
	}
	
}
