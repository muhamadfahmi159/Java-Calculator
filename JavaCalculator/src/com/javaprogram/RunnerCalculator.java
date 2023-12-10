package com.javaprogram;

import java.util.Scanner;

public class RunnerCalculator {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = inputUser.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator;
        do {
            operator = inputUser.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
                System.out.println("Operator tidak sesuai!");
                System.out.print("Masukkan operator (+, -, *, /, %): ");
            }
        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%');

        System.out.print("Masukkan angka kedua: ");
        double angka2 = inputUser.nextDouble();

        Calculator calculator = new Calculator(angka1, angka2, operator);
        double hasil = calculator.hitung();

        System.out.println("Hasil: " + hasil);

        inputUser.close();
    }
}
