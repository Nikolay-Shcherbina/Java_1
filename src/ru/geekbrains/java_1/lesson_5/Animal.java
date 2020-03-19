package ru.geekbrains.java_1.lesson_5;

public abstract class Animal extends Object {
    protected String name;
    protected int running_length; // длина бега в метрах
    protected double jumping_height; // высота пряжка в метрах


    public Animal(String name, int running_length, double jumping_height) {
        this.name = name;
        this.running_length = running_length;
        this.jumping_height = jumping_height;
    }

    // беги
    protected void run(int distance){
        if (distance <= running_length) {
            System.out.println(name + " Пробежал " + distance);
        } else {
            System.out.println(name + " Не может пробежать " + distance);
        }
    }

    // прыгни
    protected void jump(double distance){
        if (distance <= jumping_height) {
            System.out.println(name + " Прыгнул " + distance);
        } else {
            System.out.println(name + " Не может прыгнуть " + distance);
        }

    }




}
