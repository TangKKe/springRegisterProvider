package com.spring.register.provider.springRegisterProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.register.provider.springRegisterProvider.redisCluster.RedisUtil;

/**
 * 测试类。
 * @author tangke
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class getInfoFromRedisTest {
	
	@Autowired
	RedisUtil redisUtil;
	
	@Test
	public void testGetInfo() {
		System.out.println(redisUtil.getObject("name"));
		
	}
	
	@Test
	public void testSetInfo() {
		redisUtil.set("name1", "FuJiaWang");
		
	}
	

}
