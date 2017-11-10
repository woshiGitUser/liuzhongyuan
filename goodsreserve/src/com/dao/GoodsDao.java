package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Goods;

public interface GoodsDao {
	
	public List<Goods> selectByStatus(@Param(value="district")Integer district);
	
	public Goods selectById(@Param(value="id")Integer id);
	
	public int updateGoods(Goods goods);
	
}
