package com.wcg.postprocessor;

import com.wcg.service.Y;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author: wcg
 * @Date: 2020/2/16 15:48
 */
@Component
public class UpdateBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
		GenericBeanDefinition y = new GenericBeanDefinition();
		y.setBeanClass(Y.class);
		defaultListableBeanFactory.registerBeanDefinition("y", y);

		BeanDefinition x = defaultListableBeanFactory.getBeanDefinition("x");
		x.setBeanClassName("com.wcg.service.Z");
	}
}
