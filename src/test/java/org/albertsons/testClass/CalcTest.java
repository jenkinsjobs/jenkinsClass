package org.albertsons.testClass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Deepak.Shankar on 2/12/2015.
 */
public class CalcTest {

    @Test
    public void addTest() {
        Calc c = new Calc();
     assertEquals(5 , c.add(3,2));
    }

}
