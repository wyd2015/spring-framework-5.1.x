package wcg.spring.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: wcg
 * @Date: 2020/2/11 23:30
 */
@Component
public class D0 {
	@Autowired
	private D1 d1;

	public void setD1(D1 d1){
		System.out.println("使用@Autowired注解后，此setter方法不会在实例化D0时被调用");
	}
}
