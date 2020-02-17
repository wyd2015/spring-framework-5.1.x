package wcg.spring.test.autowire;

/**
 * @Author: wcg
 * @Date: 2020/2/11 23:41
 */
public class A0 {
	A1 a1;
	public void setA1(A1 a1){
		System.out.println("在不考虑注解的情况下，如果配置了自动装配，就不需要再进行手动配置");
	}
}
