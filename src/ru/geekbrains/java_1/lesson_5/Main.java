package ru.geekbrains.java_1.lesson_5;

public class Main {

    public static void main(String[] args) {

        Horse h = new Horse("Bucephalus", 1500, 3, 100);
        Dog d = new Dog("Rex", 500, 0.5, 10);
        Cat c = new Cat("Tom", 200, 2);
        Bird b = new Bird("Goga", 5, 0.2);

        h.run(1200);
        h.jump(4);
        h.swim(85);
        d.run(550);
        d.jump(0.3);
        d.swim(15);
        c.run(300);
        c.jump(1.5);
        b.run(5);
        b.jump(0.5);

//        Animal[] zoo = {h, d, c, b};
//
//        for (int i = 0; i < zoo.length; i++) {
//            zoo[i].run(500);
//            zoo[i].jump(5);
//
//            if (zoo[i] instanceof Dog){
//               ((Dog) zoo[i]).swim(10);
//            }
//            if (zoo[i] instanceof Horse) {
//                ((Horse) zoo[i]).swim(80);
//            }
//        }
    }
}

