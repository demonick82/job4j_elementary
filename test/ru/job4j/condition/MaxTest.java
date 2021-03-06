package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To3To10Then10() {
        int result = Max.max(1, 3, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax1To3To10To20Then10() {
        int result = Max.max(1, 3, 10, 20);
        assertThat(result, is(20));
    }
}