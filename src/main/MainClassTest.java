package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static test.MainClass.getLocalNumber;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        assertEquals(14,getLocalNumber());
    }
}
