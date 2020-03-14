package ru.geekbrains.java_1;



// 6.	* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
// 7.	* Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5;
// 8.	*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
//          присваивался личный уникальный идентификационный порядковый номер.


import java.sql.SQLOutput;

public class Staffer {

// 1.	Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
    String surname;
    int salary;
    int age;
    String position;

// 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    Staffer(String surname, int salary, int age, String position) {
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }

// 3.	Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getSurname() {
        return this.surname;
    }
    public String getPosition() {
        return this.position;
    }

    public int getAge() {
        return this.age;
    }
    public int getSalary() {
        return this.salary;
    }
    void getFullPrintInfo() {
        System.out.println("surname: " + surname + " salary: "  + salary + " age: " + age + " position: " + position);
    }



}
