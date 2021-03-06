import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("Метод getLocalNumber вернул значение отличное от 14",getLocalNumber()==14);
    }

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("Метод getClass_number вернул значение меньше 45",getClassNumber() > 45);
    }

    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("Метод getClassString не вернул строку содержащую \"hello\" или \"hello\"",
                            getClassString().contains("hello")||getClassString().contains("Hello"));
    }
}
