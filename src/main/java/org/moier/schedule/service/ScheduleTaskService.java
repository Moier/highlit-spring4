package org.moier.schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午8:43 2017/12/13
 */
@Service
public class ScheduleTaskService {

    @Scheduled(fixedRate = 5000)
    public void fixedRateExecute(){
        System.out.println("固定时间频率执行");
    }
}
