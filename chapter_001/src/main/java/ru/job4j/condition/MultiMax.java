package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        int max = third > second ? third : second;
        int result = max > first ? max : first;
        return result;
    }
}
