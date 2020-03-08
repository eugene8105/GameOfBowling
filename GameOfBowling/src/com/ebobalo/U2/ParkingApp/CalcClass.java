package com.ebobalo.U2.ParkingApp;

import java.util.Random;

public class CalcClass {

    public static int rendNumGenerator (int rolling){
        //rolling = 10;
        int minPoints = 0;
        Random random = new Random();
        int rollPoints = random.nextInt(rolling - minPoints) + minPoints;
        return rollPoints;
    }
}
