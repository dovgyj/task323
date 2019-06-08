package com.softserve.academy.task323.task;

public class Task {

    private int number;

    public int[] run(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Number " + number + " is negetive");
        }

        this.number = number;

        return calculate();
    }

    private int[] calculate() {

        int remainder = number;
        int remainderBuffer = 0;
        int[] squareRoots = new int[4];
        int currentSquarePosition = 0;

        while (remainder > 0) {
            double sqrt = Math.sqrt(remainder);
            if (sqrt % 2 == 0 || sqrt % 2 == 1) {
                remainder -= sqrt * sqrt;
                squareRoots[currentSquarePosition] = (int) sqrt;
                remainder += remainderBuffer;
                remainderBuffer = 0;
                currentSquarePosition++;
            } else {
                remainder--;
                remainderBuffer++;
            }


        }

        return squareRoots;
    }
}
