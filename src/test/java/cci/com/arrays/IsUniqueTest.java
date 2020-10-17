package cci.com.arrays;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    IsUnique uniqueTest = new IsUnique();

    @Test
    @DisplayName("Test Unique Srting")
    public void isUniqueCharTest1(){
        Assert.assertEquals(true,
            uniqueTest.isUniqueChars("abcdefg"));
    }

    @Test
    @DisplayName("Test non Unique String")
    public void isUniqueCharTest2(){
        Assert.assertEquals(false,
                uniqueTest.isUniqueChars("abcdeabd"));
    }

}