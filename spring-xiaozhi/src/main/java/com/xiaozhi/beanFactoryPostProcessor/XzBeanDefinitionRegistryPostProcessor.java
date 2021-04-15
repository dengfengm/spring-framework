package com.xiaozhi.beanFactoryPostProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/2 0002 17:53
 * @Version 1.0
 */
@Component
public class XzBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		logger.info("postProcessBeanDefinitionRegistry - {}" ,TulingLog.class.getSimpleName());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TulingLog.class);
		registry.registerBeanDefinition("tuLingLog",rootBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		logger.info("postProcessBeanFactory - {}" ,TulingLog.class.getSimpleName());
	}
}
