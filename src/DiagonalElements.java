import java.util.Random;

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random r = new Random();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                array[i][j] = r.nextInt(10);
            }
        }

        System.out.println("Array:");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal elements");
        for(int i = 0; i < 10; i++){
            System.out.print(array[i][i]+" ");
        }

    }
}
