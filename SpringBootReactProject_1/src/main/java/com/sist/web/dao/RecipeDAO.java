package com.sist.web.dao;
import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sist.web.entity.*;
public interface RecipeDAO extends JpaRepository<Recipe, Integer>{
	@Query(value = "SELECT * FROM recipe2 "
			+"ORDER BY no DESC LIMIT :start,12",nativeQuery = true)
	public List<Recipe> recipeListData(@Param("start") int start);
	

	//리덕스
	//count() => count(*)
	//save() => insert/update
	//delete() => delete
}
