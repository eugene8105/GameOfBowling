package com.ebobalo.U2.ParkingApp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalcClassTest {

//    @Test
//    public void testRendNumGenerator(){
//        CalcClass cl = new CalcClass();
//        int points = cl.rendNumGenerator(5);
//        assertThat(10,points,0);
//    }
private CalcClass cl;

    @Before
    public void setUpObj(){
        cl = new CalcClass();
    }

    @org.junit.jupiter.api.Test
    void rendNumGenerator() {
        int points = cl.rendNumGenerator(10);

        assertEquals(10,points,3);
    }

}