/**
 * Класс заполняет массив 8 на 8 первыми буквами цветов шахматной доски
 * W - белый    B - чёрный
 */
public class ChessTable {

    public static void main(String[] args) {
        String[][] table = new String[8][8];

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                if(i%2==0){ //четные строки начинаем заполнять белого
                    table[i][j] = j%2==0 ? "W" : "B";
                }
                else{ //нечетные начинаем с черного
                    table[i][j] = j%2!=0 ? "W" : "B";
                }
            }
        }

        //выводим на экран
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
