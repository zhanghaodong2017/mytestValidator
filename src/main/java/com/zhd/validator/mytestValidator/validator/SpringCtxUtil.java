package com.zhd.validator.mytestValidator.validator;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringCtxUtil implements ApplicationContextAware {

	private ApplicationContext application;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		application = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return application;
	}

	public <T> T getBean(Class<T> classType) throws BeansException {
		return (T) application.getBean(classType);
	}

	public <T> Map<String, T> getBeans(Class<T> classType) throws BeansException {
		return application.getBeansOfType(classType);
	}

}
