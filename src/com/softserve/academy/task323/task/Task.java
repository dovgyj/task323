package com.softserve.academy.task323.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int[] firstArguments = new int[4];
        return calculate(firstArguments);
    }

    private int[] calculate(int[] squareRootOffset) {

        int remainder = number;
        int remainderBuffer = 0;
        int[] squareRoots = new int[4];
        int currentSquarePosition = 0;
        int currentSquareOffset = 0;

        while (remainder > 0) {
            double sqrt = Math.sqrt(remainder);
            if (sqrt % 2 == 0 || sqrt % 2 == 1 && squareRootOffset[currentSquarePosition] == currentSquareOffset) {
                remainder -= sqrt * sqrt;
                squareRoots[currentSquarePosition] = (int) sqrt;
                remainder += remainderBuffer;
                remainderBuffer = 0;
                currentSquareOffset = 0;
                currentSquarePosition++;
            } else if (sqrt % 2 == 0 && sqrt % 2 == 1) {
                remainder--;
                remainderBuffer++;
                currentSquareOffset++;
            } else {
                remainder--;
                remainderBuffer++;
            }


        }

        if (remainderBuffer == 0 && remainder == 0) {
            return squareRoots;
        } else {
            int max = Arrays.stream(squareRootOffset).max().isPresent() ? Arrays.stream(squareRootOffset).max().getAsInt() : 0;
            for (int i = 0; i < squareRootOffset.length; i++) {
                if (squareRootOffset[i] < max) {
                    squareRootOffset[i] = squareRootOffset[i] + 1;
                }
            }
        }

        return calculate(squareRootOffset);
    }
}
