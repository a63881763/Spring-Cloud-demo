package com.lovnx;

import de.codecentric.boot.admin.notify.Notifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableScheduling
public class NotifierConfiguration {

    @Autowired
    private Notifier notifier;

    //服务上线或者下线都通知
    private String[] reminderStatuses = { "UNKNOWN:DOWN" };

    private String[] ignoreChanges = new String[]{"UNKNOWN:OFFLINE","OFFLINE:UP"};

    @Bean
    @Primary
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier remindingNotifier = new RemindingNotifier(notifier);
        //设定时间，5分钟提醒一次
        remindingNotifier.setReminderPeriod(TimeUnit.HOURS.toMillis(5));
        //设定监控服务状态，状态改变为给定值的时候提醒
        remindingNotifier.setReminderStatuses(reminderStatuses);
        return remindingNotifier;
    }
}