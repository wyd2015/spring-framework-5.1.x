package wcg.spring.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: wcg
 * @Date: 2020/2/12 1:05
 */
@Component
public class C0 {
	@Autowired
	C1 c1;
}
