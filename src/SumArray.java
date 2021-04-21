/**
 * Класс суммирует все элементы массива и выводит сумму на экран
 */
public class SumArray {
    public static void main(String[] args) {

        int[][] numbers = {{2,3,4,45,-67,543},{12,543,-567,3,-78},{0,345,-843}};

        int sum = 0;
        for(int i = 0; i< numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                sum+=numbers[i][j];
            }
        }

        System.out.println("The sum is " + sum);
    }
}
