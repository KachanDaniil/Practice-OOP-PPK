/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kachanlab2;

/**
 *
 * @author admin
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Вычисление и отображение результатов. Содержит реализацию статического метода
 * main().
 *
 * @author xone
 * @version 1.0
 * @see Main#main
 */
public class Main {

    /**
     * Объект класса {@linkplain Calc}.<br>Решает задачу инд. задания.
     */
    private Calc calc = new Calc();
    Scanner reader = new Scanner(System.in);

    /**
     * Отображает меню.
     */
    private void menu() {
        String s = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            do {
                System.out.println("Enter command...");
                System.out.print("'q'uit, 'v'iew, 'e'nter, 's'ave, 'r'estore: ");
                try {
                    s = in.readLine();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
            } while (s.length() != 1);
            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    System.out.println("View current.");
                    calc.show();
                    break;
                case 'e':
                    System.out.println("Enter integer number.");
                    calc.init(reader.nextInt());
                    calc.show();
                    break;
                case 's':
                    System.out.println("Save current.");
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                case 'r':
                    System.out.println("Restore last saved.");
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.print("Wrong command. ");
            }
        } while (s.charAt(0) != 'q');
    }

    /**
     * Выполняется при запуске программы. Вычисляется значение функции для
     * различных аргументов. Результаты вычислений выводятся на экран.
     *
     * @param args - параметры запуска программы.
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
