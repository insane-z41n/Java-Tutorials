package com.tutorials.HelloWorld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTests {

    @Test
    public void getGreeting_shouldReturn_HelloWorld() {
        String actual = HelloWorld.getGreeting();
        System.out.println(actual);
        assertEquals("Hello World", actual);
    }

    @Test
    public void getGreeting_shouldFail() {
        String actual = HelloWorld.getGreeting();
        System.out.println(actual);
        assertEquals("Hello boo", actual);
    }

    
}
