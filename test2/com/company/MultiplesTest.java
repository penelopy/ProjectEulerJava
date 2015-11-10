package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MultiplesTest {

    @Test
    public void testIsMultOf3()  {
        Multiples mult = new Multiples();
        assertThat(mult.isMultOf3(9), equalTo(9));
        assertThat(mult.isMultOf3(27), equalTo(27));
        assertThat(mult.isMultOf3(50), equalTo(0));
    }

    @Test
    public void testIsMultOf5() {
        Multiples mult = new Multiples();
        assertThat(mult.isMultOf5(10), equalTo(10));
        assertThat(mult.isMultOf5(55), equalTo(55));
        assertThat(mult.isMultOf5(51), equalTo(0));
    }

    @Test
    public void testSumMulitples() {
        Multiples mult = new Multiples();
        assertThat(mult.sumMulitples(), equalTo(267333));
    }


}