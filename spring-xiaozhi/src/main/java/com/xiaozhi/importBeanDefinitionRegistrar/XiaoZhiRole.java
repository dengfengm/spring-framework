package com.xiaozhi.importBeanDefinitionRegistrar;

/**
 * @Author mzj
 * @Date 2021/3/31 0031 17:46
 * @Version 1.0
 */
public class XiaoZhiRole {

	private String roleName;

	XiaoZhiRole(){

	}

	XiaoZhiRole(String roleName){
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "XiaoZhiRole{" +
				"roleName='" + roleName + '\'' +
				'}';
	}
}
