package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter calcSum = new Counter();
        int result = calcSum.add (1, 10);
        assertThat(result, is(30));
    }
    @Test
    public void whenSumEvenNumbersFromTenToFifteenThenTwentysix() {
        Counter calcSum = new Counter();
        int result = calcSum.add (10, 15);
        assertThat(result, is(26));
    }

    @Test
    public void whenSumEvenNumbersFromTwentyToFortyThenThirty() {
        Counter calcSum = new Counter();
        int result = calcSum.add (20, 40);
        assertThat(result, is(330));
    }
}
