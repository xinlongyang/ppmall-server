package com.ppmall.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ppmall.common.ServerResponse;
import com.ppmall.service.ISecKillService;

@Controller
@RequestMapping("/kill")
public class SecKillController {
	@Autowired
	private ISecKillService iSeckillService;
	
	@RequestMapping(value = "/create_order.do")
	@ResponseBody
	public ServerResponse createOrder(int productId) {
		
		return iSeckillService.createOrder(26);
		
	}
	
	@RequestMapping(value = "/get_kill_url.do")
	@ResponseBody
	public ServerResponse getKillUrl() {
		
		return null;
		
	}
	
	@RequestMapping(value = "/get_kill_list.do")
	@ResponseBody
	public ServerResponse getKillList() {
		
		return null;
		
	}
}
