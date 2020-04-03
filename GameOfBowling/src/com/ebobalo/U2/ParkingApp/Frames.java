package com.ebobalo.U2.ParkingApp;

public class Frames {

    private int roll_1;
    //public int getRoll_1() { return roll_1; }
    //public void setRoll_1(int roll_1) { this.roll_1 = roll_1; }

    private int roll_2;
    //public int getRoll_2() { return roll_2; }
    //public void setRoll_2(int roll_2) { this.roll_2 = roll_2; }

    private int roll_3;
    //public int getRoll_3() { return roll_3; }
    //public void setRoll_3(int roll_3) { this.roll_3 = roll_3; }

    private int points;
    //public int getPoints() { return points; }
    //public void setPoints(int points) { this.points = points; }
    boolean frame10 = false;
    static int globalFrameNum;
    int localFrameNum = 0;

    //public Frames(){}

    public Frames(int r1, int r2, int r3, boolean frm10){
        this.roll_1 = r1;
        this.roll_2 = r2;
        this.roll_3 = r3;
        this.frame10 = frm10;
        this.points = totalPointsForFrame();
        globalFrameNum ++;
        localFrameNum = globalFrameNum;
    } // end of Frames constructor
    public int totalPointsForFrame(){
        return points = roll_1 + roll_2 + roll_3;
    } // end of totalPointsForFrame method
} // end of Frames class
