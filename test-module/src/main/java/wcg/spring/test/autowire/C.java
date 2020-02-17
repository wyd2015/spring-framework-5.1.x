package wcg.spring.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: wcg
 * @Date: 2020/2/12 1:34
 */
@Component
public class C {
	C1 c1;

	public C(C1 c1) {
		this.c1 = c1;
		System.out.println(c1);
	}
}
