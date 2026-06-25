package com.mabud;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTest {
    @Test
    public void testAssertions(){
        //assert equals
        assertEquals(9,(4+5));

        //assert true
        assertTrue(5>4);

        //assert false
        assertFalse(4>5);

        //assert null
        assertNull(null);

        //assert not null
        assertNotNull(new Object());


    }
}