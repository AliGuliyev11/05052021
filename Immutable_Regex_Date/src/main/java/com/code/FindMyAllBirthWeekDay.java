package com.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FindMyAllBirthWeekDay {
    public static void main(String[] args) {


        myAllBdayWeekDay("07.05.2021");

    }


    public static void myAllBdayWeekDay(String bday) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(bday, dateTimeFormatter);
        MonthDay monthDay = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());

        for (int i = localDate.getYear(); i <= LocalDate.now().getYear(); i++) {
            System.out.println(i + " ili " + monthDay.atYear(i).getDayOfWeek());
        }

    }
}
