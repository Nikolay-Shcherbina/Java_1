package ru.geekbrains.java_1.lesson_5;

public class Animal {
    protected String name;
    protected int running_length; // длина бега в метрах
    protected double jumping_height; // высота пряжка в метрах

    public Animal(String name, int running_length, double jumping_height) {
        this.name = name;
        this.running_length = running_length;
        this.jumping_height = jumping_height;
    }

    // беги
    protected void run(int running_lengt){


        //System.out.println(running_lengt);

    }

    // плыви
    protected void swim(int swimming_length){


    }

    // прыгни
    protected void jump(double jumping_height){


    }
}
