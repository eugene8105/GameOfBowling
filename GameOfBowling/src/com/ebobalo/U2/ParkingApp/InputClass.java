package com.ebobalo.U2.ParkingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputClass {

    Scanner sc = new Scanner(System.in);
    List<Frames> frameList = new ArrayList<>();
    int r_1 = 0;
    int r_2 = 0;
    int r_3 = 0;
    int total = 0;
    int rollingNumberOutput = 1;

    public InputClass(){
        for (int i = 0; i <= 10; i++){
            rollGameHelper();
        }

    }

    private void rollGameHelper(){
        System.out.flush();
        for (int i = 0; i <= 2; i++){

        }
        letsRoll();
        rollingNumberOutput++;
        setRollPoints(r_1);
        setRollPoints(r_2);
        setRollPoints(r_3);
        populateFrame();
        System.out.println();
    }
    private void printAllFrames(){
        for (Frames element : frameList) {
            System.out.println(element);
        }
    }

    private void setRollPoints(int rollNumber){
        rollNumber = CalcClass.rendNumGenerator(5);
    }
    private void populateFrame(){
        Frames fm = new Frames(r_1,r_2,r_3);
        frameList.add(fm);
    }
    private void letsRoll(){
        System.out.println(rollingNumberOutput + " roll: ");
    }
}
