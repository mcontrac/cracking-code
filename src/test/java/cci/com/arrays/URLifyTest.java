package cci.com.arrays;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class URLifyTest {

    URLify urLify = new URLify();

    @Test
    @DisplayName("Test the URLify Char array")
    public void URLifyTest1()
    {
        char[] str = "Mr John Smith    ".toCharArray();
        Assert.assertArrayEquals("Mr%20John%20Smith".toCharArray(),
        urLify.urlify(str,13));
    }
}