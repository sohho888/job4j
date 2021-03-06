package ru.job4j.calculate;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test AddOnePlusOne.
     */

    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculate calc = new Calculate();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneSubtractOneThenZero()  {
        Calculate calc = new Calculate();
        double result = calc.subtract(1D, 1D);
        double expected = 0D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneDivOneThenOne()  {
        Calculate calc = new Calculate();
        double result = calc.div(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneMultipleOneThenOne()  {
        Calculate calc = new Calculate();
        double result = calc.multiple(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

}