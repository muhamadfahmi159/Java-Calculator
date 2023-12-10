package com.javaprogram;

public class Calculator {
        //Panggilnya di Runner
        //adanya OOP
        // input Nilai
        // bisa input operatornya (+ - * / %)
        // ada kondisi operator tidak sesuai silahkan ulangi hingga input operator yang sesuai
        private double angka1;
        private double angka2;
        private char operator;
        public Calculator(double angka1, double angka2, char operator) {
            this.angka1 = angka1;
            this.angka2 = angka2;
            this.operator = operator;
        }
        public double hitung() {
            double hasil = 0;
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                    }
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Operator tidak sesuai!");
            }
            return hasil;
        }
    }
