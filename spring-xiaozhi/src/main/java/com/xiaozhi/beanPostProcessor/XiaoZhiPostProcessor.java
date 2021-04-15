package com.xiaozhi.beanPostProcessor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 18:33
 * @Version 1.0
 */
@Service
public class XiaoZhiPostProcessor implements BeanPostProcessor {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		logger.info("postProcessBeforeInitialization - {}" ,beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		logger.info("postProcessAfterInitialization - {}" ,beanName);
		return bean;
	}

}
