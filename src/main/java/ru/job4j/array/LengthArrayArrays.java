package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива равен: " + numbers[index].length);
        }
    }
}

