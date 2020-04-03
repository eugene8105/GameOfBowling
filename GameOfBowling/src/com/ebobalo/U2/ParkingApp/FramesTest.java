package com.ebobalo.U2.ParkingApp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class FramesTest {

    @org.junit.jupiter.api.Test
    public void testTotalPointsForFrame(){

        Frames fr = new Frames(5, 5, 5, false);

        int result = fr.totalPointsForFrame();

        assertEquals(15,result);

    }

}