package wcg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wcg.spring.test.config.AppConfig;
import wcg.spring.test.cycle.X;

/**
 * @Author: wcg
 * @Date: 2020/2/13 11:25
 */
public class CycleTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ctx.getBean(X.class));
	}
}
