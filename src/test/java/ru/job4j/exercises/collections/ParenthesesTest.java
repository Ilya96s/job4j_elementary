package ru.job4j.exercises.collections;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ParenthesesTest extends TestCase {

    @Test
    public void whenValidInner() {
        assertThat(
                Parentheses.valid(new char[] {'(', '(', ')', ')'}),
                is(true)
        );
    }

    @Test
    public void whenValidSeq() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '(', ')'}),
                is(true)
        );
    }

    @Test
    public void whenInvalidInner() {
        assertThat(
                Parentheses.valid(new char[] {')', ')', '(', '('}),
                is(false)
        );
    }

    @Test
    public void whenInvalidSeq1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '(', '('}),
                is(false)
        );
    }

    @Test
    public void whenInvalidSeq2() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', ')', '('}),
                is(false)
        );
    }

    @Test
    public void whenOnlyInner() {
        assertThat(
                Parentheses.valid(new char[] {'('}),
                is(false)
        );
    }

    @Test
    public void whenOnlySeq() {
        assertThat(
                Parentheses.valid(new char[] {')'}),
                is(false)
        );
    }

    @Test
    public void whenSeqLack1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', '('}),
                is(false)
        );
    }

    @Test
    public void whenInnerLack1() {
        assertThat(
                Parentheses.valid(new char[] {'(', ')', ')'}),
                is(false)
        );
    }

    @Test
    public void whenSeqLack2() {
        assertThat(
                Parentheses.valid(new char[] {'(', '(', ')'}),
                is(false)
        );
    }

}