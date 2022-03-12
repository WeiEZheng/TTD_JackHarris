import org.junit.Assert;
import org.junit.Test;


public class TTD_JackHarrisTest {
    //Given array of numbers as strings, ie. {"1", "5", "15", "9", "4"}
    //sort without converting to integer
    @Test
    public  void stringSortTest(){
        //Given
        String[] str = {"1","5","15","9","4"};
        String[] expected = {"1","4","5","9","15"};

        //When
        String[] actual = TTD_JackHarris.stringSort(str);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void firstNumBiggerTest1(){
        //Given
        String first = "10";
        String second = "15";
        //When
        boolean actual = TTD_JackHarris.firstNumberIsBigger(first, second);
        //Then
        Assert.assertFalse(actual);
    }    @Test
    public void firstNumBiggerTest(){
        //Given
        String first = "15";
        String second = "10";
        //When
        boolean actual = TTD_JackHarris.firstNumberIsBigger(first, second);
        //Then
        Assert.assertTrue(actual);
    }
    public  void firstNumBiggerNegativeTest(){
        //Given
        String first = "-12";
        String second = "10";
        //When
        boolean actual = TTD_JackHarris.firstNumberIsBigger(first, second);
        //Then
        Assert.assertFalse(actual);
    }
    public  void firstNumBiggerNegativeTest1(){
        //Given
        String first = "10";
        String second = "-8";
        //When
        boolean actual = TTD_JackHarris.firstNumberIsBigger(first, second);
        //Then
        Assert.assertTrue(actual);
    }
}
