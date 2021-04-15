package com.xiaozhi.applicationContextAware;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author mzj
 * @Date 2021/3/17 0017 11:45
 * @Version 1.0
 */
@Slf4j
@Service
public class AwareInit implements ApplicationContextAware, InitializingBean, DisposableBean, SmartInitializingSingleton {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");

	AwareInit() {
		logger.info("{} - create" ,this.getClass().getSimpleName());
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("{} - postConstruct" ,this.getClass().getSimpleName());
	}

	@PreDestroy
	public void PreDestroy() {
		logger.info("{} - PreDestroy" ,this.getClass().getSimpleName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("{} - InitializingBean call back" ,this.getClass().getSimpleName());
	}

	@Override
	public void afterSingletonsInstantiated() {
		logger.info("{} - afterSingletonsInstantiated call back" ,this.getClass().getSimpleName());
	}

	@Override
	public void destroy() throws Exception {
		logger.info("{} - destroy call back" ,this.getClass().getSimpleName());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.info("{} - ApplicationContextAware call back" ,this.getClass().getSimpleName());
	}

}
