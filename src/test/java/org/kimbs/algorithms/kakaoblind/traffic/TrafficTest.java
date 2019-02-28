package org.kimbs.algorithms.kakaoblind.traffic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrafficTest {

    @Test
    public void test() {
        /* arrange */
        Traffic traffic = new Traffic();
        String[] lines =  {
            "2016-09-15 20:59:57.421 0.351s",
            "2016-09-15 20:59:58.233 1.181s",
            "2016-09-15 20:59:58.299 0.8s",
            "2016-09-15 20:59:58.688 1.041s",
            "2016-09-15 20:59:59.591 1.412s",
            "2016-09-15 21:00:00.464 1.466s",
            "2016-09-15 21:00:00.741 1.581s",
            "2016-09-15 21:00:00.748 2.31s",
            "2016-09-15 21:00:00.966 0.381s",
            "2016-09-15 21:00:02.066 2.62s"
        };

        /* act */
        int actual = traffic.solution(lines);

        /* assert */
        assertEquals(7, actual);
    }
}