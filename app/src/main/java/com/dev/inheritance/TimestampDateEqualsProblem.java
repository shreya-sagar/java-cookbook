package com.dev.inheritance;

import java.sql.Date;
import java.sql.Timestamp;

public class TimestampDateEqualsProblem {
    public static void main(String[] args) {
        Timestamp timestamp1 = Timestamp.valueOf("2023-06-26 12:34:56.123456789");
        Timestamp timestamp2 = Timestamp.valueOf("2023-06-26 12:34:56.123400000");
        Date date = new Date(timestamp1.getTime());

        System.out.println("timestamp1 : " + timestamp1);
        System.out.println("timestamp2 : " + timestamp2);
        System.out.println("date : " + date);

        System.out.println("timestamp1.equals(date) : " + timestamp1.equals(date));
        System.out.println("date.equals(timestamp2) : " + date.equals(timestamp2));
        System.out.println("timestamp1.equals(timestamp2) : " + timestamp1.equals(timestamp2));
    }
}
