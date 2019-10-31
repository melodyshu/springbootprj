package net.fxclass.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private static int count=1;
    @Scheduled(cron = "*/3 * * * * *")
    public void count(){
        System.out.println("第"+count+"次");
        count++;
    }
}
