
package atividades02;

import java.util.Scanner;
public class Atividades02  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        int[] X = new int[n];

        // Lendo todos os elementos de uma vez
        System.out.println("Digite os elementos do vetor separados por espaço:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        // Mostrando o vetor invertido
        System.out.print("Vetor invertido: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(X[i] + " ");
        }
    }
}
        