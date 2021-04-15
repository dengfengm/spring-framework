package com.xiaozhi.importBeanDefinitionRegistrar;

import com.xiaozhi.importBeanDefinitionRegistrar.XzImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 17:40
 * @Version 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(XzImportBeanDefinitionRegistrar.class)
// 可导入ImportBeanDefinitionRegistrar实现类 XzImportBeanDefinitionRegistrar.class
// 还可导入ImportSelector实现类 XiaoZhiImportSelector.class
// 或者导入配置类 XiaoZhiConfiguration.class
public @interface XzScan {

}
