package br.com.calculator.main;

import br.com.calculator.calcs.Calcs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String options = """
                *****************
                Choose One Option
                *****************
                1- Sum
                2- Subtraction
                3- Division
                4- Multiplication
                5- Exit
                """;
        System.out.println(options);
        Scanner reading = new Scanner(System.in);

        while (true) {
            double opt = reading.nextDouble();

            if (opt == 5) {
                System.out.println("Thanks for using our calculator");
                break;
            } else if (opt >= 1 && opt <= 4) {
                System.out.println("Text the first number: ");
                double num1 = reading.nextDouble();

                System.out.println("Text the second number: ");
                double num2 = reading.nextDouble();

                Calcs calc = new Calcs(num1, num2);

                switch ((int) opt) {
                    case 1:
                        System.out.println(calc.sum());
                        break;
                    case 2:
                        System.out.println(calc.subtraction());
                        break;
                    case 3:
                        System.out.println(calc.division());
                        break;
                    case 4:
                        System.out.println(calc.multiplication());
                        break;
                }
            } else {
                System.out.println("Incorrect option");
            }

            System.out.println(options);
        }
    }
}
