package wcg.spring.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: wcg
 * @Date: 2020/2/12 0:08
 */
public class B0 {
	B1 b1;

	public void setB1(B1 b1) {
		this.b1 = b1;
	}
}
