package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;
        for (int i = n; i <= n; n++){
            if (n <= 0) {
                result = 1;
            } else if (n >= 1 && n <= 5) {
                    result = result * n;
            }
        }
        return result;
    }
}
