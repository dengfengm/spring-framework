package com.xiaozhi.diAutowiredOrResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/15 0015 15:18
 * @Version 1.0
 */
@Component
public class ResourceService {

	private static Logger logger = LoggerFactory.getLogger("XIAOZHI");

	public void resource(){
		logger.info("resource - {}" , AutowiredService.class.getSimpleName());
	}
}
