package org.fleet.modules.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.fleet.common.util.DateUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 示例不带参定时任务
 *
 * @Author fleet-team
 */
@Slf4j
public class SampleJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        log.info(String.format(" Fleet-Boot 普通定时任务 SampleJob !  时间:" + DateUtils.getTimestamp()));
    }
}
