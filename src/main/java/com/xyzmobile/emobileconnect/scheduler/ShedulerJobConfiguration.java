package com.xyzmobile.emobileconnect.scheduler;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(value = ShedulerJobCondition.class)
@Configuration
public class ShedulerJobConfiguration {
	
	
	  @Bean(name = "shedulerJobDetail")
	    public JobDetail shedulerJobDetail() {

	        return JobBuilder.newJob(ShedulerJob.class)
	                .withIdentity("shedulerJob")
	                .storeDurably(true)
	                .requestRecovery(true)
	                .build();
	    }
	
    @Bean(name = "shedulerJobTrigger")
    public Trigger shedulerJobTrigger() {

        
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInMinutes(1)
                .repeatForever();

        return TriggerBuilder.newTrigger()
                .forJob(shedulerJobDetail())
                .withIdentity("shedulerJobTrigge")
                .withSchedule(scheduleBuilder)
                .build();

    }

}
