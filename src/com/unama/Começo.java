package com.unama;

import java.util.Scanner;

//Questão 01
public class Começo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu numero inteiro.");
        int n = 10;
        int[] nro = new int[10];
        int i;

        for (i=0; i<n; i++){
            System.out.println("Insira um numero " +i);
            nro[i] = sc.nextInt();
        }

        for (i=0; i<n; i++){
            System.out.println(nro[i]);
        }

}}
