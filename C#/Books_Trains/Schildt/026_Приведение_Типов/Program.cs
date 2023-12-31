﻿using System;

namespace _026_Приведение_Типов
{
     class CastDemo
    { // Продемонстрировать приведение типов
        static void Main()
        {
            double x, y;
            byte b;
            int i;
            char ch;
            uint u;
            short s;
            long l;

            x = 10.0;
            y = 3.0;

            // Приведение типа double к типу int, дробная часть числа теряется 
            i = (int)(x / y);
            Console.WriteLine("Целочисленный результат деления x / y: " + i);
            Console.WriteLine();

            // Приведение типа int к типу byte без потери данных
            i = 255;
            b = (byte)i;
            Console.WriteLine("b после присваивания 255: " + b + " -- без потери данных ");
            Console.WriteLine();

            // Приведение типа int к типу byte с потерей данных
            i = 257;
            b = (byte)i;
            Console.WriteLine("b после присваивания 257: " + b + " -- с потерей данных ");
            Console.WriteLine();

            // Приведение типа uint к типу short без потери данных
            u = 32000;
            s = (short)u;
            Console.WriteLine("s после присваивания 32000: " + s + " -- без потери данных ");

            // Приведение типа uint к типу short с потерей данных
            u = 64000;
            s = (short)u;
            Console.WriteLine("s после присваивания 64000: " + s + " -- с потерей данных");
            Console.WriteLine();

            // Приведение типа long к типу uint без потери данных
            l = 64000;
            u = (uint)l;
            Console.WriteLine("u после присваивания 64000: " + u + " -- без потери данных");

            // Приведение типа long к типу uint с потерей данных
            l = -12;
            u = (uint)l;
            Console.WriteLine("u после присваивания -12: " + u + " -- с потерей данных ");
            Console.WriteLine();

            // Приведение типа int к типу char
            b = 88; // код ASCII символа X
            ch = (char)b;
            Console.WriteLine("ch после присваивания 88: " + ch);

            // Пример неожиданного результата продвижения типов!
            byte k;
            k = 10;
            k = (byte)(k * k); // Необходимо приведение типов
            Console.WriteLine("Пример неожиданного продвижения типов:");
            Console.WriteLine("b: " + b);

            // Пример приведения типов в выражениях
            Console.WriteLine();
            Console.WriteLine("Пример приведения типов в выражениях");
            double n;

            for (n = 1.0; n <= 10; n++)
            {
                Console.WriteLine("Квадратный корень из {0} равен {1}", n, Math.Sqrt(n));
                Console.WriteLine("Целая часть числа: {0}", (int) Math.Sqrt(n));
                Console.WriteLine("Дробная часть числа: {0}", Math.Sqrt(n) - (int)Math.Sqrt(n));
                Console.WriteLine();
            }
        }
    }
}
