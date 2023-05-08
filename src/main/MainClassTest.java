package main;

import org.junit.Test;
import test.MainClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainClassTest {

    int expectedValueLocal = 14;
    int expectedValueClass = 45;
    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber(){
        assertEquals(expectedValueLocal,mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber(){
        assertTrue(String.format("Ожидаем, что %s больше, чем %s", mainClass.getClassNumber(), expectedValueClass),
                mainClass.getClassNumber() >= expectedValueClass);
    }
}
