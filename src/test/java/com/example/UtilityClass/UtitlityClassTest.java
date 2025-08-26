package com.example.UtilityClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtitlityClassTest {

	    @Test
	    public void testAdd() {
	        assertEquals(10, UtilityClass.add(7, 3));
	        assertEquals(-1, UtilityClass.add(-5, 4));
	    }

	    @Test
	    public void testSub() {
	        assertEquals(4, UtilityClass.sub(7, 3));
	        assertEquals(-9, UtilityClass.sub(-5, 4));
	    }

	    @Test
	    public void testMul() {
	        assertEquals(21, UtilityClass.mul(7, 3));
	        assertEquals(-20, UtilityClass.mul(-5, 4));
	    }

	    @Test
	    public void testDiv() {
	        assertEquals(2, UtilityClass.div(6, 3));
	        assertEquals(-2, UtilityClass.div(-8, 4));
	    }
	}


