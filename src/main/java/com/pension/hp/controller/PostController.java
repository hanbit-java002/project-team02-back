package com.pension.hp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pension.hp.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value="/api/post", method=RequestMethod.POST)
	@ResponseBody
	public Map Post(@RequestParam("title") String title, 
			@RequestParam("contents") String contents){
			
		postService.post(title, contents);
		
		Map result= new HashMap();
		result.put("result", "ok");
		
		return result;
	}
}
