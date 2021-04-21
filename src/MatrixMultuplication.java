import java.util.Random;
import java.util.Scanner;

/**
 * Перемножает матрицы размером 3x3 (ввод 0 c консоли)
 * Пользователь может задать свои размеры матриц (ввод 1 с консоли)
 * Значения в матрицх генерируются автоматически в пределе от 0 до 10
 * В конце содержимое матрицей-множитителей и матрицы-произведения представлются на экране
 */
public class MatrixMultuplication {

    public static void main(String[] args) throws Exception {

        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        int m1, n1, m2, n2; //размеры матриц

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Random r = new Random();

        if (input != 0 && input != 1) throw new Exception("Only 0 and 1 are acceptable for input");
        if (input == 0) {
            m1 = 3;
            n1 = 3;
            m2 = 3;
            n2 = 3;
        } else {
            System.out.println("Enter the size of first matrix(m1xn1)");
            System.out.print("m1 = ");
            m1 = scanner.nextInt();
            System.out.print("n1 = ");
            n1 = scanner.nextInt();
            System.out.println("Enter the size of second matrix(m2xn2)");
            System.out.print("m2 = ");
            m2 = scanner.nextInt();
            System.out.print("n2 = ");
            n2 = scanner.nextInt();

            if (n1 != m2) throw new Exception("The matrix A can't be multiplicated on matrix B");
        }

        matrixA = new int[m1][n1];
        matrixB = new int[m2][n2];
        matrixC = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrixA[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrixB[i][j] = r.nextInt(10);
            }
        }

        for (int row = 0; row < m1; row++) {
            for (int col = 0; col < n2; col++) {

                for (int i = 0; i < n1; i++) {
                    matrixC[row][col] += matrixA[row][i] * matrixB[i][col];
                }

            }
        }

        System.out.println("MatrixA:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("MatrixB:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print(matrixB[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("MatrixC:");
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print(matrixC[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
