package com.xiaozhi.importBeanDefinitionRegistrar;

import org.springframework.context.annotation.Bean;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 18:17
 * @Version 1.0
 */
public class XiaoZhiConfiguration {

	@Bean
	public XiaoZhiRole xiaoZhiRole() {
		return new XiaoZhiRole("xiaozhi-conf");
	}

}
