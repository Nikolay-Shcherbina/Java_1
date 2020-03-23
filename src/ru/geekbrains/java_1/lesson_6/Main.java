package ru.geekbrains.java_1.lesson_6;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            PrintStream psFile1 = new PrintStream(new FileOutputStream("file1.txt"));
            psFile1.print("Hellooooo0123456789AaBbCcDdEeFfGgHhIiGgKkLlMmNnOpPpQqRrSsTtUuVvWwXxYyZz");
            psFile1.close();

            PrintStream psFile2 = new PrintStream(new FileOutputStream("file2.txt"));
            psFile2.println("HelloABCDEFGHIGKLMNOPQRSTUVWXYZ");
            psFile2.close();



            Scanner sc = new Scanner(new FileInputStream("file2.txt"));
            System.out.println(sc.next());
            sc.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


//            try {
//                FileInputStream fis = new FileInputStream("file1.txt");
//                int b;
//                while ((b = fis.read()) != -1)
//                    System.out.print((char) b);
//
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }






    }

}

