package com.emma;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {

    public TimeTable() {
    }

    public List<String> getTimetable(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(n + " x " + i + " = " + (n * i));
        }
        return result;
    }
    
}
