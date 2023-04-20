import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class MainClassTest {
    @Before
    public void startTest(){
        System.out.println("Запускаем тесты");
    }
    @After
    public void finishTest(){
        System.out.println("Конец теста");
    }
    @Test
    public void testGetLocalNumber(){
       int actual = new MainClass().local_number;
       final int expected = 14;

       Assert.assertTrue("Число local_number != 14", actual==expected);
        System.out.println("Тест№1 прошел");
    }

    @Test
    public void testGetClassNumber(){
        int class_number = new MainClass().getClassNumber();
        final int greater_number = 45;

        Assert.assertTrue("Число class_number <= 45", class_number>greater_number);
        System.out.println("Тест№2 прошел");
    }
    @Test
    public void testGetClassString(){
        String actual = "hello";
        String expected = new MainClass().getClassString();
        Assert.assertTrue("Строка expected не содержит в себе строку actual",expected.toLowerCase().contains(actual));
    }



}
