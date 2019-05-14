package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        for (int i = 0; i >= n; i++) {
            if (n == 0 || n == 1){
                return 1;
            }
            else  result *= i;
        }
        return result;
    }
}