package dev.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, dime un número y te doy la tabla de multiplicar :D");

        while (true) {
            try {
                int num = sc.nextInt();

                int[] multiplicationTable = MultiplicationTable.getMultiplicationTable(num);

                System.out.println("Tabla de multiplicar para " + num + ":");
                for (int i = 0; i < multiplicationTable.length; i++) {
                    System.out.println(num + " x " + (i + 1) + " = " + multiplicationTable[i]);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero sin decimales.");
                sc.nextLine();
            }
        }

        System.out.println("¡¡¡Fin del programa!!!");

        sc.close();
    }
}
