package com.integer.converter;

import com.integer.converter.BritishEnglish;
import com.integer.converter.exception.IntegerOutOfRangeException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BritishEnglishTest {

    private BritishEnglish britishEnglish = new BritishEnglish();

    @Test(expected = IntegerOutOfRangeException.class)
    public void test_max_val() throws IntegerOutOfRangeException {
        britishEnglish.getWordsByInt(Integer.MAX_VALUE);
    }
    
    
    @Test(expected = IntegerOutOfRangeException.class)
    public void test_min_val() throws IntegerOutOfRangeException{
        britishEnglish.getWordsByInt(-999999999);
    }
    
    @Test
    public void test_zero() throws IntegerOutOfRangeException{
        assertEquals(britishEnglish.getWordsByInt(0),"zero");
    }
    
    @Test(expected = IntegerOutOfRangeException.class)
    public void test_minus() throws IntegerOutOfRangeException {
        britishEnglish.getWordsByInt(-1);
        britishEnglish.getWordsByInt(-105);
        britishEnglish.getWordsByInt(-123);
        britishEnglish.getWordsByInt(-1005);
        britishEnglish.getWordsByInt(-1042);
    }
    
    @Test
    public void test_numbers_less_than_hundred() throws IntegerOutOfRangeException{
        assertEquals("twenty one",britishEnglish.getWordsByInt(21));
        assertEquals("fifty five",britishEnglish.getWordsByInt(55));
        assertEquals("sixty six",britishEnglish.getWordsByInt(66));
        assertEquals("seventy three",britishEnglish.getWordsByInt(73));
        assertEquals("ninety nine",britishEnglish.getWordsByInt(99));
    }
    
    @Test
    public void test_unit_hundreds() throws IntegerOutOfRangeException {
      assertEquals("one hundred",britishEnglish.getWordsByInt(100));
      assertEquals("one hundred and five",britishEnglish.getWordsByInt(105));
      assertEquals("one hundred and twenty three",britishEnglish.getWordsByInt(123));
      assertEquals("five hundred and ninety nine",britishEnglish.getWordsByInt(599));
      assertEquals("six hundred and sixty nine",britishEnglish.getWordsByInt(669));
      assertEquals("nine hundred and eighty three",britishEnglish.getWordsByInt(983));
        
    }
    
    @Test
    public void test_unit_thousands() throws IntegerOutOfRangeException {
      assertEquals("one thousand",britishEnglish.getWordsByInt(1000));
      assertEquals("one thousand and five",britishEnglish.getWordsByInt(1005));
      assertEquals("one thousand and forty two",britishEnglish.getWordsByInt(1042));
      assertEquals("one thousand one hundred and five",britishEnglish.getWordsByInt(1105));
      assertEquals("two thousand nine hundred and ninety nine",britishEnglish.getWordsByInt(2999));
      assertEquals("five thousand and one",britishEnglish.getWordsByInt(5001));
      assertEquals("seven thousand six hundred and thirty one",britishEnglish.getWordsByInt(7631));
    }
    
    @Test
    public void test_unit_millions() throws IntegerOutOfRangeException {
       assertEquals("one million",britishEnglish.getWordsByInt(1000000));
       assertEquals("three million",britishEnglish.getWordsByInt(3000000));
       assertEquals("sixty six million and three",britishEnglish.getWordsByInt(66000003));
       assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",britishEnglish.getWordsByInt(56945781));
       assertEquals("ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",britishEnglish.getWordsByInt(99999999));
       assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",britishEnglish.getWordsByInt(999999999));
    }
    
    @Test
    public void test_cardinal_numbers() throws IntegerOutOfRangeException {
        assertEquals("one",britishEnglish.getWordsByInt(1));
        assertEquals("two",britishEnglish.getWordsByInt(2),"two");
        assertEquals("three",britishEnglish.getWordsByInt(3));
        assertEquals("four",britishEnglish.getWordsByInt(4));
        assertEquals("five",britishEnglish.getWordsByInt(5));
        assertEquals("six",britishEnglish.getWordsByInt(6));
        assertEquals("seven",britishEnglish.getWordsByInt(7));
        assertEquals("eight",britishEnglish.getWordsByInt(8));
        assertEquals("nine",britishEnglish.getWordsByInt(9));
        assertEquals("ten",britishEnglish.getWordsByInt(10));
        assertEquals("eleven",britishEnglish.getWordsByInt(11));
        assertEquals("twelve",britishEnglish.getWordsByInt(12));
        assertEquals("thirteen",britishEnglish.getWordsByInt(13));
        assertEquals("fourteen",britishEnglish.getWordsByInt(14));
        assertEquals("fifteen",britishEnglish.getWordsByInt(15));
        assertEquals("sixteen",britishEnglish.getWordsByInt(16));
        assertEquals("seventeen",britishEnglish.getWordsByInt(17));
        assertEquals("eighteen",britishEnglish.getWordsByInt(18));
        assertEquals("nineteen",britishEnglish.getWordsByInt(19));
    }
    
    @Test
    public void test_number_tens() throws IntegerOutOfRangeException {
        assertEquals("twenty",britishEnglish.getWordsByInt(20));
        assertEquals("thirty",britishEnglish.getWordsByInt(30));
        assertEquals("forty",britishEnglish.getWordsByInt(40));
        assertEquals("fifty",britishEnglish.getWordsByInt(50));
        assertEquals("sixty",britishEnglish.getWordsByInt(60));
        assertEquals("seventy",britishEnglish.getWordsByInt(70));
        assertEquals("eighty",britishEnglish.getWordsByInt(80));
        assertEquals("ninety",britishEnglish.getWordsByInt(90));


    }
    
}
