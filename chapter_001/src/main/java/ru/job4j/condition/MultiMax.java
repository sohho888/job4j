package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        int max = first > second ? first : second;
        int max = second > third ? second : third;
        int max = third > first ? third : first;
        return result;
    }
}
