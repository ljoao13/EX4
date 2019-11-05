package com.unama;

import java.util.Scanner;

public class QT03 {
    public static int[]  preencheVetor(int[] vetor){
        for (int i=0; i<vetor.length; i++){
            vetor[i] = i*i;
        }
        return vetor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[30];
        int[] resultado = preencheVetor(vetor);
        for (int numero:resultado){
            System.out.println(numero);
        }
    }
}
