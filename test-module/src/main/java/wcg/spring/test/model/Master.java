package wcg.spring.test.model;

/**
 * @Author: wcg
 * @Date: 2020/2/11 21:43
 */
public class Master {
	private Slave slave;

	public Master(Slave slave) {
		this.slave = slave;
	}

	public void call(){
		System.out.println("slave is => "+slave);
	}
}
