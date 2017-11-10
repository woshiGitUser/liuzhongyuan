package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Goods;
import com.service.GoodsService;

@Controller
public class GoodsController {
		
	@Resource
	public GoodsService goodsService;
	
	@RequestMapping(value="/selectByStatus")
	public String selectByStatus(@RequestParam(value="district",required=false)String district,HttpServletRequest requset){
		System.out.println(district);
		if(null!=district){
			List<Goods> list=goodsService.selectByStatus(Integer.parseInt(district));	
			
			requset.setAttribute("goodsList", list);
		}
		else{
			List<Goods> list=goodsService.selectByStatus(null);
			requset.setAttribute("goodsList", list);
			}
		return "select";
	}
	
	@RequestMapping(value="/selectById")
	public String selectById(@RequestParam(value="id")Integer id,HttpServletRequest request){
		
		Goods goods=null;
		goods=goodsService.selectById(id);
		if(null!=goods){
			System.out.println(goods);
			request.setAttribute("goodsList", goods);
		}
		return "update";
	}
	
	@RequestMapping(value="/updateGoods",method=RequestMethod.POST)
	public String updateGoods(Goods goods){
		System.out.println(goods.toString()+goods.getPrice());
		if(null!=goods){
			int rest=goodsService.updateGoods(goods);
			return "redirect:selectByStatus";
		}else{
			return "update";
		}
		
		
	}
	
}
