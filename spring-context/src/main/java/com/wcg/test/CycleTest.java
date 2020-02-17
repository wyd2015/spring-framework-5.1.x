package com.wcg.test;

import com.wcg.app.AppConfig;
import com.wcg.model.Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wcg
 * @Date: 2020/2/13 11:25
 */
public class CycleTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.register(Demo.class);
		ctx.refresh();

		System.out.println(ctx.getBean(Demo.class));
	}
}
