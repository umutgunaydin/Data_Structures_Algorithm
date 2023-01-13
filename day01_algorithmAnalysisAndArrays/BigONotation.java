package day01_algorithmAnalysisAndArrays;

public class BigONotation {
    public static void main(String[] args) {

        long numberOfOperations = 0;
        long n = 1000;
        long m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);

        //Task-1 Single Loop
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task-2 Nested Loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations with nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        //Task-3 three nested loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations with three nested loops: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        //Task-4 n and m nested loops O(n*m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations with nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        //Task-4.5 n and m consecutive loops O(n+m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        for (int j = 0; j < m; j++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations with consecutive loop: " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        //Task-5 Logarithmic Complexity
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i *= 2) {
            numberOfOperations += 1;

        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations with logarithmic : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

    }
}
