package com.emma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class TimeTableTest {

    @Test
    public void testGetTimeTable(){
        TimeTable timeTable = new TimeTable();

        List<String> result = timeTable.getTimetable(5);
        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0) );
        assertEquals("5 x 5 = 25", result.get(4) );
        assertEquals("5 x 10 = 50", result.get(9) );
    }

}
