package com.chris.test.com.chris.interview.question1;

import com.chris.interview.question1.Circular1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ye830 on 7/8/2018.
 */



public class Circular1Test {

    double radius;

    @Before
    public void setUp(){
        radius = 1;
    }

    @Test
    public void areaTest(){
        Assert.assertEquals(3.14, new Circular1(radius).area(), 0D);
    }
}
