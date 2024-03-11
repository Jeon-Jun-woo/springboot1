package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.dao.*;
@RestController
@CrossOrigin(origins = "*")
public class MusicRestController {
	@Autowired
	private MusicDAO dao;
	
	@GetMapping("/music/list")
	public List<Music> musicListData()
	{
		return dao.musicListData();   //findAll도가능 근대 ORDER BY가 안되잇음
	}
}
