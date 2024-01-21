package dev.loops;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola dime un número y te doy la tabla de multiplicar :D");

        int num = sc.nextInt();

        int[] multiplicationTable = MultiplicationTable.getMultiplicationTable(num);

        System.out.println("Tabla de multiplicar para " + num + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + multiplicationTable[i]);
        }

        System.out.println("¡¡¡Fin del programa!!!");

        sc.close();
    }

}

