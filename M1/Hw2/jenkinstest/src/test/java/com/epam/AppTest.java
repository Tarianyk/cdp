package com.epam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    private static final String EXPECTED = "test";
    private App app;

    @Before
    public void init() {
        app = new App();
    }

    @Test
    public void testReturnValueIsTrue() {
        assertEquals(EXPECTED, app.getMessage("test"));
    }
}