package atividades02;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terão os vetores? ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];
        
        // Lendo vetor X
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        
        // Lendo vetor Y
        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }
        
        // Criando vetor Z com união sem repetição
        ArrayList<Integer> Z = new ArrayList<>();
        
        // Adiciona todos os elementos de X
        for (int i = 0; i < n; i++) {
            if (!Z.contains(X[i])) {
                Z.add(X[i]);
            }
        }
        
        // Adiciona elementos de Y que ainda não estão em Z
        for (int i = 0; i < n; i++) {
            if (!Z.contains(Y[i])) {
                Z.add(Y[i]);
            }
        }
        
        // Mostrando vetor Z
        System.out.print("Vetor Z (união de X e Y sem repetição): ");
        for (int num : Z) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}