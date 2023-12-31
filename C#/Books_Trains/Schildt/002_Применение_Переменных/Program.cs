using System;

namespace _002_Применение_Переменных
{
    internal class Program
    { // Данная программа демонстрирует применение переменных
        static void Main()
        {
            int x; // Здесь объявляется переменная
            int y; // Здесь объявляется еще одна переменная

            x = 100; // Здесь переменной х присваивается значение 100

            Console.WriteLine("х содержит " + x);

            y = x / 2;

            Console.Write("y содержит х / 2: ");
            Console.WriteLine(y);
        }
    }
}
