package ru.geekbrains.java_1.lesson_6;
/*
* 1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
* 2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
* 3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
* 4.	** Написать метод, проверяющий, есть ли указанное слово в папке
*/

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("file1.txt", true));
            ps.println("HelloWorld");
            ps.close();

            Scanner sc = new Scanner(new FileInputStream("file1.txt"));
            System.out.println(sc.next());
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


