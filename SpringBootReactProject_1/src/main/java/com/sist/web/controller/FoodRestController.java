package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.web.dao.*;
import com.sist.web.entity.*;
@RestController
@CrossOrigin(origins = "*")
public class FoodRestController {
	@Autowired
	private FoodDAO dao;
	
	
	   @RequestMapping("/food/find_react")
	   public List<Food> foodFindData(int page, String address)
	   {
	      int rowSize=12;
	      int start=(rowSize*page)-rowSize;
	      List<Food> list=dao.foodFindData(start, address);
//	      Map map=new HashMap();
//	      int totalpage=dao.foodFindTotalPage(address);
//	      final int BLOCK=10;
//	      int startPage=((page-1)/BLOCK*BLOCK)+1;
//	      int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
//	      if(endPage>totalpage)
//	         endPage=totalpage;
//	      
//	      map.put("curpage", page);
//	      map.put("totalpage", totalpage);
//	      map.put("startPage", startPage);
//	      map.put("endPage", endPage);
//	      map.put("list", list);
	      return list;
	   }
	
	   @GetMapping("food/find_totalpage_react")
	   public String find_totalpage(String address)
	   {
	      int total=dao.foodFindTotalPage(address);
	      return String.valueOf(total);
	   }
	
	
	@GetMapping("food/list_react")
	public List<Food> food_list(int page)
	{
		System.out.println("page:"+page);
		int rowSize=12;
		int start=(rowSize*page)-rowSize;
		List<Food> list=dao.foodListData(start);
		/*Map map=new HashMap();
		int totalpage=dao.foodListTotalPage();
		final int BLOCK=10;
		int startPage=((page-1)/BLOCK*BLOCK)+1;
		int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage)
			endPage=totalpage;
		
		map.put("curpage", page);
		map.put("totalpage", totalpage);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("list", list);
		return map; */
		return list;
	}
	@GetMapping("food/food_totalpage_react")
	public String food_totalpage()
	{
		int total=dao.foodListTotalPage();
		return String.valueOf(total);
	}
	
	@GetMapping("food/food_detail_react")
	public Food food_detail(int fno)
	{
		Food vo=dao.findByFno(fno);
		return vo;
	}
}









