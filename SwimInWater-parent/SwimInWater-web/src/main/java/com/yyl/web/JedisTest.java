package com.yyl.web;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	@Test
	public void testJedis(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-redis.xml");
		//获取redis连接池
		JedisPool jedispool = (JedisPool) ctx.getBean("jedisPool");
		
		//获取redis实例
		Jedis jedis=jedispool.getResource();
		System.out.println(jedis.keys("*"));
	}
}
