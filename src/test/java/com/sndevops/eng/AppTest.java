package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {

    private String INPUT = "1    2 3 4 1";
    @Test 
    public void testLength() { 
        Assert.assertEquals(INPUT,"1               r 6  1");
 
    }
}
