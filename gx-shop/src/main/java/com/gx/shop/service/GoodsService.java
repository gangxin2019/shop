package com.gx.shop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.gx.shop.domain.Goods;

public interface GoodsService {

	PageInfo<Goods> list(Goods goods, Integer page, Integer pageSize);

	List<Goods> glist();

}
