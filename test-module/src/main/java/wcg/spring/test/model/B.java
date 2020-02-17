package wcg.spring.test.model;

/**
 * @Author: wcg
 * @Date: 2020/2/11 21:25
 */
public class B {
	private A a;

	public void setA(A a) {
		this.a = a;
	}

	public void setC(C c){
		System.out.println("spring的setter注入，与属性无关，仅与setXxx方法有关");
	}

	public void run(){
		System.out.println("a is => "+a);
	}
}
