package MatrizApp;

import java.util.Random;
import java.util.Scanner;

public class MatrizApp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); 
        int matriz[][] = new int[5][5];
        int rango = 101;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(rango);
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
}
}