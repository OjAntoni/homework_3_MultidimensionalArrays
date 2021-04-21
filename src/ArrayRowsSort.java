import java.util.Arrays;
import java.util.Random;

/**
 * Класс сортирует каждую строку массива по возрастанию
 */
public class ArrayRowsSort {
    public static void main(String[] args) {

        Random r = new Random();
        int[][] array = new int[r.nextInt(10)][r.nextInt(10)];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(100);
            }

        }

        System.out.println("Before");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }

        System.out.println("After");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
