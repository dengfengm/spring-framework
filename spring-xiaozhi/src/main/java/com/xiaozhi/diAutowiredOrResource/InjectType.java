package com.xiaozhi.diAutowiredOrResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author mzj
 * @Date 2021/4/15 0015 15:14
 * @Version 1.0
 */
@Component
public class InjectType {

	@Autowired
	private AutowiredService autowiredService;

	@Resource
	private ResourceService resourceService;

}
