package org.desviante.staticmethodsandfields.TimeConstants;

public class TimeConstantsDemo {

    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        System.out.println(TimeConstants.SECONDS_IN_DAY);
        // print SECONDS_IN_WEEK
        System.out.println(TimeConstants.SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    // write your code here
    public static final int HOURS_IN_DAY = 24;
    public static final int HOURS_IN_WEEK = 7 * HOURS_IN_DAY;
    public static final int SECONDS_IN_DAY = SECONDS_IN_HOUR * HOURS_IN_DAY;
    public static final int SECONDS_IN_WEEK = SECONDS_IN_HOUR * HOURS_IN_WEEK;

    private TimeConstants() { }
}