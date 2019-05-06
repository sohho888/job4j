package ru.job4j.condition;

/**
 * @author Vyacheslav Ponomarev (sohho888@gmail.com)
 * @version $Id$
 * @since 0.2
 */


public class Max {

    public int max(int left, int right) {
        int result = left > right ? left: right;
        return result;
    }
}
