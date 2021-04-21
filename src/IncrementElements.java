import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Этот класс увеличивает каждый элемент трехмерного массива
 * на заданное пользователем число
 */
public class IncrementElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int increment = scanner.nextInt();
        //делаем трехмерный массив рандомных размеров массив
        Random r = new Random();
        int[][][] array = new int[r.nextInt(10)][r.nextInt(10)][r.nextInt(10)]; //bound - верхняя граница
        //заполняем рандомными числами
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = r.nextInt(50);
                }
            }
        }
        System.out.println("Before");
        System.out.println(Arrays.deepToString(array));
        System.out.println("After");

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k]+=increment;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
