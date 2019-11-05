package com.gx.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.gx.shop.domain.Goods;
import com.gx.shop.service.GoodsService;
import com.gx.shop.util.PageUtil;


@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("list2")
	public String list(@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize,Goods goods,
			Model model,HttpServletRequest request) {
		
		List<Goods> glist=goodsService.glist();
		
		PageInfo<Goods> list=goodsService.list(goods,page,pageSize);
		PageUtil.page(request, "/list2", pageSize, list.getList(), (int) list.getTotal(), page);
		model.addAttribute("pg",list);
		model.addAttribute("goods",goods);
		model.addAttribute("glist",glist);
		
		return "list2";
		
	}
	
	@RequestMapping("toAdd")
	@ResponseBody
	public Object toAdd(Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Goods> glist=goodsService.glist();
		map.put("glist", glist);
		
		return map;
	}
	@RequestMapping("add")
	public String toadd() {
		return "add";
		
	}
	
}
