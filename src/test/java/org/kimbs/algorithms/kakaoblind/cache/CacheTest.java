package org.kimbs.algorithms.kakaoblind.cache;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CacheTest {

    private static Cache c;
	
	@BeforeClass
	public static void setup() {
		c = new Cache();
    }
    
    @Test
    public void tc1CacheTest() {
        // arrange
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(50, actual);
    }

    @Test
    public void tc2CacheTest() {
        // arrange
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(21, actual);
    }

    @Test
    public void tc3CacheTest() {
        // arrange
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(60, actual);
    }

    @Test
    public void tc4CacheTest() {
        // arrange
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(52, actual);
    }

    @Test
    public void tc5CacheTest() {
        // arrange
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(16, actual);
    }

    @Test
    public void tc6CacheTest() {
        // arrange
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        // act
        int actual = c.solution(cacheSize, cities);

        // assert
        assertEquals(25, actual);
    }
}