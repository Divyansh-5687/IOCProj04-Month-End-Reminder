package com.nt.reminder;

import com.nt.service.CalendarService;

public class MonthEndReminder {
	private CalendarService calendarService;

    // setter injection
    public void setCalendarService(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    public void checkMonthEnd() {
        int day = calendarService.getDate();
        if (day == 30 || day == 31) {
            System.out.println("Month is ending, please submit reports.");
        } else {
            System.out.println("Continue working as usual.");
        }
    }
   
}
