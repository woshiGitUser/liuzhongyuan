package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.GoodsDao;
import com.pojo.Goods;
import com.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	public GoodsDao goodsDao;
	
	@Override
	public List<Goods> selectByStatus(Integer status) {
		List<Goods> list =null;
		try {
			list=goodsDao.selectByStatus(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Goods selectById(Integer id) {
		Goods goods =null;
		try {
			goods=goodsDao.selectById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goods;
	}

	@Override
	public int updateGoods(Goods goods) {
		int result=0;
		try {
			result=goodsDao.updateGoods(goods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
