package com.sist.web.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sist.web.entity.GoodsAll;
import java.util.*;
import com.sist.web.entity.*;
public interface GoodsAllDAO extends JpaRepository<GoodsAll, Integer>{
	@Query(value = "SELECT * FROM goods_all "
			+"ORDER BY no DESC LIMIT :start,12",nativeQuery = true)
	public List<GoodsAll> goodsListData(@Param("start") int start);
}
