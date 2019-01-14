package com.yyl.util;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Component
public class JedisClientSingle {
	//获取redis实例
	@Resource
	private JedisPool jedisPool;
	
	
	public String get(String key){
		Jedis jedis=jedisPool.getResource();
		String str=jedis.get(key);
		jedis.close();
		return str;
	}
	
	public String set(String key,String value){
		Jedis jedis=jedisPool.getResource();
		String str=jedis.set(key, value);
		jedis.close();
		return str;
	}

	public long del(String key){
		Jedis jedis=jedisPool.getResource();
		Long result=jedis.del(key);
		jedis.close();
		return result;
	}
	
	public Set<String> keys(String value){
		Jedis jedis=jedisPool.getResource();
		Set<String> str=jedis.keys(value);
		jedis.close();
		return str;
	}
	
	public String hget(String hkey,String key){
		Jedis jedis=jedisPool.getResource();
		String str=jedis.hget(hkey, key);
		jedis.close();
		return str;
	}
	
	public long hset(String hkey,String key,String value){
		Jedis jedis=jedisPool.getResource();
		Long result=jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}
	
	public long incr(String key){
		Jedis jedis=jedisPool.getResource();
		Long result=jedis.incr(key);
		jedis.close();
		return result;
	}
	
	public long expire(String key,int second){
		Jedis jedis=jedisPool.getResource();
		Long result=jedis.expire(key, second);
		jedis.close();
		return result;
	}
	
	public long ttl(String key){
		Jedis jedis = jedisPool.getResource();
		Long result=jedis.ttl(key);
		jedis.close();
		return result;
	}
}
