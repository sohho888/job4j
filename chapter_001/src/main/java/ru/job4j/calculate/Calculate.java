package ru.job4j.calculate;

/**
 * Package for calculate task.
 * @author Vycheslav Ponomarev (sohho888@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculate {

    /**
     * Суммируем два вещественных числа.
     * @param два вещественных числа.
     * @return сумма.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Вычитаем два вещественных числа.
     * @param два вещественных числа.
     * @return разница.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Делим два вещественных числа.
     * @param два вещественных числа.
     * @return Частное.
     */
    public double div (double first, double second) {
        return first / second;
    }

    /**
     * Умножение двух вещественных числа.
     * @param два вещественных числа.
     * @return Произведение.
     */
    public double multiple (double first, double second) {
        return first * second;
    }
}