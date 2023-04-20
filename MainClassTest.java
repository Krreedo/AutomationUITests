import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
    @Before
    public void startTest(){
        System.out.println("Запускаем тест");
    }
    @Test
    public void testGetLocalNumber(){
       int actual = new MainClass().local_number;
       final int expected = 14;

       Assert.assertTrue("Метод не вернул нужное значение", actual==expected);
        System.out.println("Тест прошел");
    }

    @After
    public void finishTest(){
        System.out.println("Конец теста");
    }

}
