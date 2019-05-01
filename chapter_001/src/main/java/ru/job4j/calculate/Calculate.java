package ru.job4j.calculate;

/**
 * Package for calculate task.
 * @author Vycheslav Ponomarev (sohho888@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculate {

    /**
     * Конструктор, вывод строки в консоль.
     */
    public double add(double first, double second) {
        return first + second;
    }
    public double subtract(double first, double second) {
        return first - second;
    }
    public double div (double first, double second) {
        return first / second;
    }
    public double multiple (double first, double second) {
        return first * second;
    }
}