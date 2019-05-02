package ru.job4j.calculator;

public class Calculator {
    /**
     * Программа расчета идеального веса.
     */
    public class Fit {
        /**
         * Идеальный вес для мужщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        public double manWeight(double height) {
            return height * 100;
        }

        /**
         * Идеальный вес для женщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        public double womanWeight(double height) {
            return height * 110;
        }
    }

}
