package com.xyzmobile.emobileconnect.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ShedulerJobCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		String enabled = context.getEnvironment().getProperty("scheduler.job.enabled");

		return "true".equalsIgnoreCase(enabled);
	}
}
