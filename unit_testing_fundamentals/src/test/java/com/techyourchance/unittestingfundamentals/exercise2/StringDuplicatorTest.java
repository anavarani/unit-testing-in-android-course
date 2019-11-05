package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup() {
        SUT = new StringDuplicator();
    }

    // empty string is entered - empty is returned
    @Test
    public void duplicate_emptyChar_emptyReturned() {
        String result = SUT.duplicate("");
        assertThat(result, is(""));
    }

    // space is entered - 2 spaces are returned
    @Test
    public void duplicate_spaceChar_spaceSpaceReturned() {
        String result = SUT.duplicate(" ");
        assertThat(result, is("  "));
    }

    // string is entered - string is returned
    @Test
    public void duplicate_string_stringStringReturned() {
        String result = SUT.duplicate("string");
        assertThat(result, is("stringstring"));
    }

}