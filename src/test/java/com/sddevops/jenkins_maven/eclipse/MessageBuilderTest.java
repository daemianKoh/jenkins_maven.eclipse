package com.sddevops.jenkins_maven.eclipse;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageBuilderTest {

    @Test
    public void testNameKeyon() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello keyon", obj.getMessage("keyon"));

    }
    /*
     After adding the new unit test have to run 'mvn clean' before 'mvn test'
     * 
     * */
    
    @Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }

}