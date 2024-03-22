package com.board;

public class Solution {
    public int solution(String s) {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(words[i], digits[i]);
        }

        return Integer.parseInt(s);
    }
}
