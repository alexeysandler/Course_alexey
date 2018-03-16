package date_mock;

import java.text.SimpleDateFormat;
import java.util.*;

public class Greeter {
    int currentHour ;
    int currentDayOfWeek ;
    int currentAM_PM ;

    public Greeter(){
         Calendar c = Calendar.getInstance();
         c.setTime(new Date());
         currentHour = c.get(Calendar.HOUR);
         currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
         currentAM_PM = c.get(Calendar.AM_PM);
        System.out.println(currentAM_PM+" "+currentDayOfWeek+" "+currentHour);
    }

    public void greet(String name) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int currentHour = c.get(Calendar.HOUR);
        int currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int currentAM_PM = c.get(Calendar.AM_PM);
//
        if ((currentDayOfWeek == 6 && currentAM_PM == 1 && currentHour >= 00) ||
                (currentAM_PM == 1 && currentDayOfWeek == 7 && currentHour <= 5)) {
            System.out.println("Shabat shalom, " + name);
        }
        //evening
        else
            if ((currentDayOfWeek != 6 && currentAM_PM == 1 && currentHour >= 5)){
            System.out.println("Good evening, " + name);}
            else
                //morning
                if((currentDayOfWeek == 6 && currentAM_PM == 1 && currentHour < 00)||
                        (currentDayOfWeek != 7 && currentAM_PM == 1 && currentHour < 00)){
            System.out.println("Good morning, " + name);
                }
                else
                   //night
                    if((currentDayOfWeek != 6 && currentAM_PM == 1 && currentHour >= 9)||
                        (currentDayOfWeek != 7 && currentAM_PM == 0 && currentHour <= 5)){
                        System.out.println("Good night, " + name);
                }
                //day
                else
                    if((currentDayOfWeek != 7 && currentDayOfWeek != 7)&&
                            ((currentAM_PM == 1 && currentHour >= 00)||
                            (currentAM_PM == 1 && currentHour <= 5) )  ){
                        System.out.println("Good afternoon, " + name);
                    }



        }
    }

