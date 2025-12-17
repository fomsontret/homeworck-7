import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] matrix = new int[SIZE][SIZE];
        int[][] rotatedMatrix = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Дана следующая матрица");
        viewMatrix(matrix);
        System.out.println("После поворота");
        rotateMatrix(matrix, rotatedMatrix);
    }

    public static void viewMatrix(int [][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateMatrix (int [][] matrix, int [][] rotatedMatrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix [SIZE - 1 - j][i];
                System.out.format("%4d", rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
