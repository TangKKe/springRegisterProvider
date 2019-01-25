package com.spring.register.provider.springRegisterProvider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.register.provider.springRegisterProvider.redisCluster.RedisUtil;

/**
 * 简单测试类,从服务器上的Redis集群中获取信息。
 * @author tangke
 *
 */
@RestController
public class getInfoFromRedisCtrl {
	@Autowired
	RedisUtil redisUtil;
	
	@RequestMapping("/getInfo")
	@ResponseBody
	public String getInfo() {
		String info = redisUtil.get("name");
		return info;
	}
	
	@RequestMapping("/setInfo")
	@ResponseBody
	public String setInfo() {
		String info = "";
		if(redisUtil.hasKey("name")) {
			info = "该键已经存在！";
			return info;
		}
		redisUtil.set("name", "tangke");
		info = "设置成功！";
		return info;
	}
	
	@RequestMapping("/getString")
	@ResponseBody
	public String getString() {
		return "this a string created by provider!";
	}

}
