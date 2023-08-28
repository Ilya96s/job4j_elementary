package ru.job4j.exercises.sout;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task17Test extends TestCase {

    @Test
    public void shouldOutputSqrAndCubeOf6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.main(null);
        String expected = "6" + System.lineSeparator() + "36" + System.lineSeparator() + "216" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }

}