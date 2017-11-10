package com.service;

import java.util.List;

import com.pojo.Goods;

public interface GoodsService {
	
public List<Goods> selectByStatus(Integer status);
	
	public Goods selectById(Integer id);
	
	public int updateGoods(Goods goods);
}
