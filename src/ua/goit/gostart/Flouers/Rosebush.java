package ua.goit.gostart.Flouers;

public class Rosebush {

    Rose rose;

    Rosebush(){
        Rose rose = new Rose();
        System.out.println("Создан экземпляр класса Rosebush");
        System.out.println("Создан экземпляр класса Rose");
        System.out.println("Создано отношение композиция классов Rosebush(контейнер) и Rose(содержимое)");

    }

}
