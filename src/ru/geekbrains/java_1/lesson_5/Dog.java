package ru.geekbrains.java_1.lesson_5;

public class Dog extends Animal {
    public final int swimming_length; // длина плавания в метрах

    public Dog(String name, int running_length, double jumping_height, int swimming_length){
        super(name, running_length, jumping_height);
        this.swimming_length = swimming_length;
    }

    // плыви
    protected void swim(int distance) {
        if (distance <= swimming_length) {
            System.out.println(name + " Проплыл " + distance);
        } else {
            System.out.println(name + " Не может проплыть " + distance);
        }
    }
}
