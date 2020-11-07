package com.xyzmobile.emobileconnect.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Conditional(value = ShedulerJobCondition.class)
@Component
public class ShedulerJob extends QuartzJobBean {

	private String jobName;

	@Autowired
	private ShedulerJobService shedulerJobService;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {

		// TODO :call service
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public ShedulerJobService getShedulerJobService() {
		return shedulerJobService;
	}

	public void setShedulerJobService(ShedulerJobService shedulerJobService) {
		this.shedulerJobService = shedulerJobService;
	}

}
