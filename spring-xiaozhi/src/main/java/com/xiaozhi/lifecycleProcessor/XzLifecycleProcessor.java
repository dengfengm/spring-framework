package com.xiaozhi.lifecycleProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author mzj
 * @Date 2021/4/2 0002 18:14
 * @Version 1.0
 */
@Component("lifecycleProcessor")
public class XzLifecycleProcessor implements LifecycleProcessor {

	private static Logger logger = LoggerFactory.getLogger("LIFECYCLE");

	@Override
	public void onRefresh() {
		logger.info("onRefresh - {}" , this.getClass().getSimpleName());
	}

	@Override
	public void onClose() {
		logger.info("onClose - {}" , this.getClass().getSimpleName());
	}

	@Override
	public void start() {
		logger.info("start - {}" , this.getClass().getSimpleName());
	}

	@Override
	public void stop() {
		logger.info("stop - {}" , this.getClass().getSimpleName());
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
