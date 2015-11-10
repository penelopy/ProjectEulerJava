package com.company;

import java.util.Arrays;

public class Anagram {

    String string1;
    String string2;


    public Anagram(String s1, String s2) {
        string1 = s1;
        string2 = s2;
    }

    public boolean areInputLengthsEqual() {
        return string1.length() == string2.length();
    }

    public String replaceWhiteSpace(String aString) {
        return aString.replaceAll("\\s", "");
    }

    public boolean areAnagrams() {
        if (areInputLengthsEqual() == true) {

            String copyOfs1 = replaceWhiteSpace(string1);
            String copyOfs2 = replaceWhiteSpace(string2);

            char[] s1Array = copyOfs1.toLowerCase().toCharArray();

            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal
            boolean status = Arrays.equals(s1Array, s2Array);
            return status;
        }
        else {
            return false;
        }
    }

}



