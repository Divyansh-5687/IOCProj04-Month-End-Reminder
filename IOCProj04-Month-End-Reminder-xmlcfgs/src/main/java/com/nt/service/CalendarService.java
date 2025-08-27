package com.nt.service;

import java.time.LocalDate;

public class CalendarService {
    public int getDate() {
        return LocalDate.now().getDayOfMonth(); // returns today's day
    }
}

