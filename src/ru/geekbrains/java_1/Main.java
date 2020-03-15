package ru.geekbrains.java_1;

public class Main {

    public static void main(String[] args) {

// Создание объекта с использованием конструктора Staffer.
        Staffer employee = new Staffer("Ivanov", 900, 35, "engineer");

// 4.	Вывести при помощи методов из пункта 3 ФИО и должность;
        System.out.println(employee.getSurname() + ": " + employee.getPosition());

// 5.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Staffer[] arrStaffer = new Staffer[5];
        arrStaffer[0] = new Staffer("Volodin", 125000, 45, "engineer");
        arrStaffer[1] = new Staffer("Belov", 185000, 55, "director");
        arrStaffer[2] = new Staffer("Voronin", 55300, 60, "security ");
        arrStaffer[3] = new Staffer("Zubova", 73000, 37, "secretary");
        arrStaffer[4] = new Staffer("Ubuntova", 95000, 30, "administrator");

        for (int i = 0; i < arrStaffer.length; i++) {
            if (arrStaffer[i].getAge() > 40) {
                arrStaffer[i].getFullPrintInfo();
            }
        }

        for (int i = 0; i < arrStaffer.length; i++) {
            if (arrStaffer[i].getAge() > 45) {
                int a = arrStaffer[i].getSalary();
                Staffer.addsSalary(a);

            }
        }





    }
}


