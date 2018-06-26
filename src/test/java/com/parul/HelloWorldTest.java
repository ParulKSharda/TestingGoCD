package com.parul;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {


    @Test
    public void name() {
    assertEquals("Hello World", HelloWorld.printMessage());
    }
}