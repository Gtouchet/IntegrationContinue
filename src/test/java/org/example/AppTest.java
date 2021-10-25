package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void add_2Plus2()
    {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void add_3Plus3()
    {
        assertNotEquals(4, Calculator.add(3, 3));
    }
}
