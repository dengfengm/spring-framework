package com.xiaozhi.importBeanDefinitionRegistrar;

import com.xiaozhi.beanFactoryPostProcessor.TulingLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 17:43
 * @Version 1.0
 */
public class XzImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		logger.info("registerBeanDefinitions - {}" , XzImportBeanDefinitionRegistrar.class.getSimpleName());
		BeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClassName(XiaoZhiRole.class.getName());
		ConstructorArgumentValues arg = new ConstructorArgumentValues();
		arg.addIndexedArgumentValue(0,"xiaozhi");
		((GenericBeanDefinition) beanDefinition).setConstructorArgumentValues(arg);
		registry.registerBeanDefinition("xiaoZhiRole",beanDefinition);
	}

}
