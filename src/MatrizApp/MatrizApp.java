package MatrizApp;

import java.util.Random;
import java.util.Scanner;

public class MatrizApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); 
        int matriz[][] = new int[5][5];
        int rango = 101;
        int filaEncontrada = 0; 
        int columnaEncontrada = 0;
        
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
        
        System.out.println("¿Qué número quieres buscar?");
        int numero = scan.nextInt();
        
        boolean encontrado = false;  
        

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero && (encontrado == false)) {
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    encontrado = true; 
                }
            }
        }
        
        if (encontrado == true) {
            System.out.println("Se ha encontrado el número en la fila: " + (filaEncontrada+1) + " y la columna: " + (columnaEncontrada+1));
        } else {
            System.out.println("Número no encontrado.");
        }
    }
}