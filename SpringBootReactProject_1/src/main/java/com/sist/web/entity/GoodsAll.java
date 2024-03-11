package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/*
 * NO int 
GOODS_NAME text 
GOODS_SUB text 
GOODS_PRICE text 
GOODS_DISCOUNT int 
GOODS_FIRST_PRICE text 
GOODS_DELIVERY text 
GOODS_POSTER text 
HIT int
 */
@Entity(name = "goods_all")
@Getter
@Setter
public class GoodsAll {
	@Id
	private int no;
	private String goods_name,goods_sub,goods_price,goods_discount,goods_first_price,
	goods_delivery,goods_poster;
	private int hit;
}
