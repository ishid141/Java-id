package com.ishika;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //practice for primitive values
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        //Reference Types
        byte egg = 30;
        Date now = new Date ();
        System.out.println(now);

        //Difference between Primitive and Reference
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //Strings
        String message = "Hello World" + "!!";

        System.out.println(message);

        //Escape sequences
        String escape = "c:\tWindows\\...";

    }
}