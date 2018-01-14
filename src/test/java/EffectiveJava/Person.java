package EffectiveJava;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
public class Person {
    private final Date birthData=null;

    private static final Date BOOM_START;
    private static final Date BOOM_END;
    Map map = null;
    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1964,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public Boolean isBabyBoom(){
        return birthData.compareTo(BOOM_START)>=0 && birthData.compareTo(BOOM_END)<0;
    }
}
