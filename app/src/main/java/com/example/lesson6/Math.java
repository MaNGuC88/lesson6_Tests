package com.example.lesson6;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public String reverse(String words) {
        StringBuilder result = new StringBuilder();
        if (words.contains("  ")) {
            String[] splitWords = words.split("  ");
            for (int i = splitWords.length - 1; 0 <= i; i--) {
                result.append(splitWords[i]).append(" ");
            }
        } else if (words.contains(" ")) {
            String[] splitWords = words.split(" ");
            for (int i = splitWords.length - 1; 0 <= i; i--) {
                result.append(splitWords[i]).append(" ");
            }
        } else if (words.contains(",")) {
            String[] splitWords = words.split(",");
            for (int i = splitWords.length - 1; 0 <= i; i--) {
                result.append(splitWords[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
