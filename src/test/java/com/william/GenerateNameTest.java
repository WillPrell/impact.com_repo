package com.william;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateNameTest {
    @Test
    public void testGenerateName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));


        new GenerateName().run();
        System.setOut(originalOut);
        assertEquals("impact.com", out.toString().strip());
    }
}
