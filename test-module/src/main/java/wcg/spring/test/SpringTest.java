package wcg.spring.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wcg.spring.test.autowire.CustomBeanFactoryPostProcessor;
import wcg.spring.test.cycle.X;
import wcg.spring.test.model.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: wcg
 * @Date: 2020/2/11 21:49
 */
public class SpringTest {
	//调试模式下使用，在set方法中打断点
	public static void main(String[] args) {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("spring-default.xml");
		B b = (B) act.getBean("b");
		B b1 = (B) act.getBean("b");
		C1 c1 = (C1) act.getBean("c1");
		D0 d0 = (D0) act.getBean("d0");
		Master master = (Master) act.getBean("master");
	}

	@Test
	public void test(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire.xml");
		CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
		ac.addBeanFactoryPostProcessor(customBeanFactoryPostProcessor);
		ac.refresh();
	}

	@Test
	public void argth(){
		Integer[] arr = {1,43,123,2312,4343,21,3,5,7,8,9,11,23};
		List<Integer> list0 = Arrays.asList(arr);

		List<Integer> positiveList = list0.stream().sorted().collect(Collectors.toList());
		//List<Integer> positiveList = list0.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(positiveList);

		List<Integer> reverseList = list0.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseList);

		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("张三", new BigDecimal("50.0")));
		list1.add(new Person("王五", new BigDecimal("25.0")));
		list1.add(new Person("李四", new BigDecimal("68.0")));
		list1.add(new Person("李四", new BigDecimal("17.0")));
		list1.add(new Person("张三", new BigDecimal("45.0")));

		List<Person> positive = list1.stream().sorted(Comparator.comparing(Person::getSalary)).collect(Collectors.toList());
		System.out.println(positive);

		List<Person> reverse = list1.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(reverse);


		/*int[] arr = {1,3,5,6,7,8,11,23,43,123,2312,4343,21,3,5,7,8,9,11,23};
		Set<Integer> repeatNumber = findRepeatNumber(arr);
		List<Integer> collect = repeatNumber.stream().sorted().collect(Collectors.toList());
		String collect1 = collect.stream().map(e -> e + "").collect(Collectors.joining(" 或 "));
		System.out.println(collect1);*/
	}

	private Set<Integer> findRepeatNumber(int[] nums) {
		Set<Integer> repeatSet = new HashSet<>();
		Set filterSet = new HashSet<Integer>();
		for(int i : nums){
			if(filterSet.contains(i)){
				repeatSet.add(i);
				continue;
			}

			filterSet.add(i);
		}
		return repeatSet;
	}
}
