package com.xiaozhi.importBeanDefinitionRegistrar;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 18:14
 * @Version 1.0
 */
public class XiaoZhiImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
		return new String[]{XiaoZhiConfiguration.class.getName()};
	}

}
