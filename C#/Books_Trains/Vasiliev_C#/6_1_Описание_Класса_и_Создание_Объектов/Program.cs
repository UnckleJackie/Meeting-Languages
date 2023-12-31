using System;

namespace _6_1_Описание_Класса_и_Создание_Объектов
{
    class MyClass
    { // Описание класса
        public int number; // Целочисленное поле
        public char symbol; // Символьное поле
        public void show()
        { // Метод: Отображение значения целочисленного и символьного полей
            Console.WriteLine("Целочисленное поле: " + number);
            Console.WriteLine("Символьное поле: " + symbol);
        }
    }
    class UsingObjsDemo
    { // Класс с главным методом
        static void Main()
        { // Главный метод
            MyClass A = new MyClass(); // Первый объект
            MyClass B; // Второй объект
            B = new MyClass(); // Присваивание значений полям первого объекта
            A.number = 123;
            A.symbol = 'A';
            B.number = 321; // Присваивание значений полям второго объекта
            B.symbol = 'B';
            Console.WriteLine("Первый объект");
            A.show();
            Console.WriteLine("Второй объект");
            B.show();
        }
    }
}
