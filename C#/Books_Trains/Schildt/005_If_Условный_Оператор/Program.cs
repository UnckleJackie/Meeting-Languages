using System;

namespace _005_If_Условный_Оператор
{
    internal class IfDemo
    { // Продемонстрировать применение условного оператора if
        static void Main()
        {
            int a, b, c;

            a = 2; b = 3;

            if (a < b) Console.WriteLine("a меньше b");

            // Не подлежит выводу
            if (a == b) Console.WriteLine("Этого никто не увидит");
            Console.WriteLine();

            c = a - b; // c содержит -1
            Console.WriteLine("c содержит -1");
            if (c >= 0) Console.WriteLine("Значение с неотрицательно");
            if (c < 0) Console.WriteLine("Значение с отрицательно");

            Console.WriteLine();

            c = b - a; // теперь содержит 1
            Console.WriteLine("с содержит 1");
            if (c >= 0) Console.WriteLine("Значение с неотрицательно");
            if (c < 0) Console.WriteLine("Значение с отрицательно");
        }
    }
}
