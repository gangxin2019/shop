package com.gx.shop.dao;

import java.util.List;

import com.gx.shop.domain.Goods;

public interface GoodsMapper {

	List<Goods> list(Goods goods);

	List<Goods> glist();

}
