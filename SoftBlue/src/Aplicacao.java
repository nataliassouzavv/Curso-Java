import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Aplicacao {
    public static void main(String[] args) {

        int op = 0;

        String[][] array = new String[3][3];
//        array[0][0] = "1";
//        array[0][1] = "2";
//        array[0][2] = "3";
//        array[1][0] = "4";
//        array[1][1] = "5";
//        array[1][2] = "6";
//        array[2][0] = "7";
//        array[2][1] = "8";
//        array[2][2] = "9";
        for (int a = 0; a < array.length; a++) { //linhas
            for (int b = 0; b < array[0].length; b++) //colunas
                System.out.print(array[a][b] + " ");
            System.out.println(); //esta defindo que fique :
        }                                                    // 0 1 2
        Set<String> l = new LinkedHashSet<>();
        l.add("1");                                         // 1 1 2
        // 2 1 2
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Em qual posição quer jogar? De acordo com a posição do tabuleiro.");

        System.out.println("Linha 0 coluna 0?");
        array[0][0] = sc.next();
        System.out.print(array[0][0] + " ");
        System.out.println();
        sc.close();
    }

}

