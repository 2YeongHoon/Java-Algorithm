import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return (dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US)).toUpperCase();

    }
}