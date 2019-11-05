package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    // if negative number - return true
    @Test
    public void isNegative_negativeNumber_trueReturned() {
        boolean result = SUT.isNegative(-1);
        assertThat(result, is(true));
    }

    // if positive number - return false
    @Test
    public void isNegative_positiveNumber_falseReturned() {
        boolean result = SUT.isNegative(1);
        assertThat(result, is(false));
    }

    // if zero - return false
    @Test
    public void isNegative_zero_falseReturned() {
        boolean result = SUT.isNegative(0);
        assertThat(result, is(false));
    }

}