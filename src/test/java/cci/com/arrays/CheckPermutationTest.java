package cci.com.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    CheckPermutation checkPermutation = new CheckPermutation();

    @Test
    @DisplayName("Test Positive Scenario")
    public void PermutationTest1()
    {
        Assert.assertEquals(true,
        checkPermutation.permutation("god", "dog"));
    }

    @Test
    @DisplayName("Test Negative Scenario")
    public void PermutationTest2()
    {
        Assert.assertEquals(false,
                checkPermutation.permutation("HDFC", "HSBC"));
    }

    @Test
    @DisplayName("Test Positive scenario with Opitimum solution")
    public void PermutationWithOptimizationTest1(){
        Assert.assertEquals(true,
                checkPermutation.permutationOptimized("god", "dog"));
    }

    @Test
    @DisplayName("Test Negative scenario with Opitimum solution")
    public void PermutationWithOptimizationTest2(){
        Assert.assertEquals(false,
                checkPermutation.permutationOptimized("HDFC", "HSBC"));
    }
}