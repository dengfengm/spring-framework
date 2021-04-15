package com.xiaozhi.diAutowiredOrResource;

import com.xiaozhi.importBeanDefinitionRegistrar.XzImportBeanDefinitionRegistrar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/15 0015 15:18
 * @Version 1.0
 */
@Component
public class AutowiredService {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");

	public void autowired(){
		logger.info("autowired - {}" , AutowiredService.class.getSimpleName());
	}
}
