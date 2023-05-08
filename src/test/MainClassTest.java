package test;

import main.MainClass;
import org.junit.Test;

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

    @Test
    public void testGetClassString(){
        String actualString = mainClass.getClassString();
        boolean gotTheString = false;
        if (actualString.contains("Hello") || actualString.contains("hello")){
            gotTheString = true;
        }

        assertTrue(String.format("Ожидаем, наличие %s или %s в строке %s", "Hello", "hello", actualString), gotTheString);
    }
}
