package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result *= i;
            if (n ==0 || n==1){
                return 1;
            }
        }
        return result;
    }
}