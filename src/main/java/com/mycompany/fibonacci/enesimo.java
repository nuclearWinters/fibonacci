/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class enesimo {
    public static void main(String[] args) {
        System.out.println("Introduce el enésimo número: ");
        Scanner enesimo = new Scanner(System.in);
        int enesimoNumero = enesimo.nextInt();
        int arregloFibonacci[] = new int [enesimoNumero];
        if (enesimoNumero >= 1) {
            arregloFibonacci[0] = 0;
        }
        if (enesimoNumero >= 2) {
            arregloFibonacci[1] = 1;
        }
        if (enesimoNumero > 2) {
            for (int inicio = 2; inicio<enesimoNumero; inicio++) {
                arregloFibonacci[inicio] = arregloFibonacci[inicio-1] + arregloFibonacci[inicio-2];
            }
        }
        System.out.println("Index\t\tValor");
        for (int inicio = 0;inicio<=arregloFibonacci.length-1;inicio++) {
            System.out.println(inicio + "\t\t" + arregloFibonacci[inicio]);
        }
    }
}
