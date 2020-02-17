package wcg.spring.test.model;

import java.math.BigDecimal;

/**
 * @Author: wcg
 * @Date: 2020/2/12 20:42
 */
public class Person {
	String name;
	BigDecimal salary;

	public Person(String name, BigDecimal salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}
}
