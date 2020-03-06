package com.ebobalo.U2.ParkingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class InputClass {

    Scanner sc = new Scanner(System.in);
    ArrayList<Frames> rl = new ArrayList<>();
    int r_1=0;
    int r_2=0;
    int r_3=0;
    int rollingNumber = 1;

    public InputClass(){
        rollGameHelper();
    }

    private void rollGameHelper(){
        System.out.flush();
        for (int i = 0; i <= 2; i++){
            letsRoll();
            rollingNumber++;
            rollBoll();
        }

    }

    private void rollBoll(){
        CalcClass.rendNumGenerator(5);
    }

    private void letsRoll(){
        System.out.println(rollingNumber + " roll: ");
    }
}
