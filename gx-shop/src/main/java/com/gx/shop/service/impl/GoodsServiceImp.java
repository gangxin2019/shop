package com.gx.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gx.shop.dao.GoodsMapper;
import com.gx.shop.domain.Goods;
import com.gx.shop.service.GoodsService;

@Service
public class GoodsServiceImp implements GoodsService{

	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public PageInfo<Goods> list(Goods goods, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Goods> list=goodsMapper.list(goods);
		return new PageInfo<Goods>(list);
	}

	@Override
	public List<Goods> glist() {
		
		return goodsMapper.glist();
	}
}
