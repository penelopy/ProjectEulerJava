package com.company;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;


public class AnagramTest {

    @Test
    public void testIsAnagram() {
        Anagram a = new Anagram("stop", "pots");
        Anagram b = new Anagram("stop", "spot");
        Anagram c = new Anagram("stop", "monkey");
        Anagram d = new Anagram("stop", "junk");

        assertTrue(a.areAnagrams());
        assertTrue(b.areAnagrams());
        assertFalse(c.areAnagrams());
        assertFalse(d.areAnagrams());

    }

    @Test
    public void testLengthIsEqual() {
        Anagram a = new Anagram("stop", "pots");
        Anagram b = new Anagram("stop", "spot");
        Anagram c = new Anagram("stop", "monkey");

        assertTrue(a.areInputLengthsEqual());
        assertTrue(b.areInputLengthsEqual());
        assertFalse(c.areInputLengthsEqual());
    }

    @Test
    public void testReplacementOfWhiteSpace() {
        Anagram a = new Anagram("s top", "po ts");
        assertThat(a.replaceWhiteSpace("s top"), equalTo("stop"));
        assertThat(a.replaceWhiteSpace("p u s h"), equalTo("push"));

    }
}