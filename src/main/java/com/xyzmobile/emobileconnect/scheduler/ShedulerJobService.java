package com.xyzmobile.emobileconnect.scheduler;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Conditional(value = ShedulerJobCondition.class)
@Service
@Transactional
public class ShedulerJobService {
	
	
	 public void processScheduleJob() {
		 
	 }

}
