package com.wcg.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: wcg
 * @Date: 2020/2/13 12:09
 */
public class Z /*implements ApplicationContextAware*/ {

	/*@Autowired X x;

	public Z() {
		System.out.println("z was created !");
	}

	@PostConstruct
	public void initZ(){
		System.out.println("call z lifecycle init callback ...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call aware callback !");
	}*/
}
