package com.wlgdo.avatar.quartz.schedule.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


public class NewJob implements BaseJob {

    private static Logger log = LoggerFactory.getLogger(NewJob.class);

    public NewJob() {

    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String jobName = context.getJobDetail().getKey().getName();
        log.info("NewJob Job执行时间jobName:{}{}, ", jobName, new Date());
    }
}