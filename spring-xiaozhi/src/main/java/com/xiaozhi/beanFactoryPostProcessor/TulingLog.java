package com.xiaozhi.beanFactoryPostProcessor;

/**
 * @Author mzj
 * @Date 2021/4/2 0002 17:56
 * @Version 1.0
 */
public class TulingLog {

	private String logId;

	private String logName;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String log(){
		return "tuling log";
	}
}
