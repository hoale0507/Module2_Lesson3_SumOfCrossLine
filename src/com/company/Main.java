package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = input.nextInt();
        System.out.println("Enter the col");
        int col = input.nextInt();
        double [][] array = new double[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter the element at row %d and col %d\n",i,j);
                array[i][j] = input.nextDouble();
            }
        }
        double sumOfCrossLine = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfCrossLine += array[i][i];
        }
        System.out.println("Sum of the cross line of matrix is " + sumOfCrossLine);
    }
}
