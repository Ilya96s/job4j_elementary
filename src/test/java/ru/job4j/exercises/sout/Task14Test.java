package ru.job4j.exercises.sout;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task14Test extends TestCase {

    @Test
    public void whenDelimiterIsPastedBetweenLettersOfString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        assertThat(out.toString(), is("H-e-l-l-o-,-f-r-i-e-n-d!"));
    }

}