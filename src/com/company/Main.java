package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("lesson4.txt"), StandardCharsets.UTF_8))) {

            Scanner in = new Scanner(System.in);

            String line;
            while ((line = reader.readLine()) != null) {

                if(!line.matches("[0-9]")) {
                    System.out.println("В строке обнаружена цифра. Что сделать?");
                    System.out.println("=======================");
                    System.out.println("1. Продолжить работу");
                    System.out.println("2. Завершить работу");
                    System.out.println("=======================");
                    System.out.print("Введите номер варианта: ");
                    String str = in.nextLine();

                    if("1".equals(str))
                    {
                        System.out.println(line);
                    }
                    else if("2".equals(str))
                    {
                        String s = line.split("[0-9]")[0];
                        System.out.println(s);
                        System.out.println("=======================");
                    }

                }
                else {
                    System.out.println(line);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
