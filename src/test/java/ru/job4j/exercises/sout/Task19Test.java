package ru.job4j.exercises.sout;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task19Test extends TestCase {

    @Test
    public void shouldOutputStringPlusNumber() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.main(null);
        String expected = "Значение x равно 9" + System.lineSeparator() + "Значение x^2 равно 81" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }

}