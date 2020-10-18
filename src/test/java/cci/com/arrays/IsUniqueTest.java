package cci.com.arrays;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    IsUnique uniqueTest = new IsUnique();

    @Test
    @DisplayName("Test Unique String")
    public void isUniqueCharTest1(){
        Assert.assertEquals(true,
            uniqueTest.isUniqueChars("abcdefgA"));
    }

    @Test
    @DisplayName("Test non Unique String")
    public void isUniqueCharTest2(){
        Assert.assertEquals(false,
                uniqueTest.isUniqueChars("abcdeabd"));
    }

    @Test
    @DisplayName("Test Unique String with optimization")
    public void isUniqueCharOptimizationTest1(){
        Assert.assertEquals(true,
                uniqueTest.isUniqueCharsOptimize("abcdefg"));
    }

    @Test
    @DisplayName("Test non Unique String with optimization")
    public void isUniqueCharOptimizationTest2(){
        Assert.assertEquals(false,
                uniqueTest.isUniqueCharsOptimize("abcdeabd"));
    }

}