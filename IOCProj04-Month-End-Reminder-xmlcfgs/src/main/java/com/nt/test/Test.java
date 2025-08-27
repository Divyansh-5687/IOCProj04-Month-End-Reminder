package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.reminder.MonthEndReminder;


public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");

        MonthEndReminder reminder = ctx.getBean("MonthEndReminder", MonthEndReminder.class);
        reminder.checkMonthEnd();
    }
}

