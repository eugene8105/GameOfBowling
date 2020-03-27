package com.ebobalo.U2.ParkingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Player {

    private String playerName = "";
    Scanner sc = new Scanner(System.in);
    /**
     * frameList List of bowling frames
     */
    List<Frames> frameList = new ArrayList<>();
    int r_1 = 0;
    int r_2 = 0;
    int r_3 = 0;
    int totalPlayerPoints = 0;
    int rollingNumberOutput = 1;
    int frameNum = 1;
    boolean frame10 = false;

    public Player(String pName){
        this.playerName = pName;
    } // end of Player constructor
    public void letsPlay() throws InterruptedException {
        letsRoll();
        rollGameLoop();
    } // end of letsPlay method

    /**
     * method for rolling game. Main loop for a game.
     * @throws InterruptedException
     */
    private void rollGameLoop() throws InterruptedException {
        for (int i = 0; i <= 9; i++){
            System.out.flush();
            System.out.println();
            rollFrameNumberMessage(frameNum);
            rollingNumberOutput = 1;
            System.out.println();
            r_1 = rollBoll();
            rollMessageOutput(rollingNumberOutput, r_1);
            rollingNumberOutput++;
            r_2 = rollBoll();
            rollMessageOutput(rollingNumberOutput, r_2);
            rollingNumberOutput++;
            if (i == 9){
                r_3 = rollBoll();
                rollMessageOutput(rollingNumberOutput, r_3);
                frame10 = true;
            }else{

                frameList.add((new Frames(r_1,r_2,r_3, frame10)));
                rollingNumberOutput++;
            }
            for(Frames fr: frameList){
                if(fr.localFrameNum == frameNum){
                    System.out.println("Total for this frame " + fr.totalPointsForFrame() + " points");
                }
            }
            TimeUnit.SECONDS.sleep(0);
            System.out.println();
            frameNum ++;
        }
        printAllFrames();
    } // end of rollGameHelper method
    private void rollMessageOutput(int rollNumber, int points){
        System.out.println("In your " + rollNumber + " roll, you have " + points);
    }
    private void rollFrameNumberMessage(int frameNumber){
        System.out.println("Frame #  " + frameNumber);
    }
    // this method is returning a random number from 0 to 10.
    private int rollBoll(){
        return CalcClass.rendNumGenerator(10);
    } // end of rollBoll method
    private void printAllFrames() {
        for (Frames frm : frameList) {
            System.out.println("Total points for Frame # " + frm.localFrameNum +
                                " is " + frm.totalPointsForFrame());
            totalPlayerPoints += frm.totalPointsForFrame();
        }
        System.out.println("Total " + playerName + "'s" + " points : " + totalPlayerPoints);

    } // end of printAllFrames method

    /**
     * Roll Message on the screen
     */
    private void letsRoll(){
        System.out.println("Let's ROLL...");
    } // end of letsRoll method
} // end of Player class
