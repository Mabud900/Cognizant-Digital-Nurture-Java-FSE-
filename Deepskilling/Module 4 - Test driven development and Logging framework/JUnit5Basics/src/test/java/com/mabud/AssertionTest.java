package com.mabud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {

    @Test
    public void assertionTest() {

        assertTrue(3 > 2 );
        assertFalse(2 > 10);
        assertEquals(3, 2+1);
        assertNotEquals(7, 9 - 1);
        assertNull(null);
        assertNotNull(new Object());
    }

}