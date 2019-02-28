package org.kimbs.algorithms.kakaoblind.secretmap;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SecretMapTest {

    private static SecretMap sMap;

    @BeforeClass
    public static void setUp () {
        sMap = new SecretMap();
    }

    @Test 
    public void test1() {
        /* arrange */
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        /* act */
        String[] actual = sMap.solution(n, arr1, arr2);
        
        /* assert */
        String[] expected = {"#####","# # #", "### #", "#  ##", "#####"};
        assertArrayEquals(expected, actual);
    }

    @Test 
    public void test2() {
        /* arrange */
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        /* act */
        String[] actual = sMap.solution(n, arr1, arr2);
        
        /* assert */
        String[] expected = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        assertArrayEquals(expected, actual);
    }
}