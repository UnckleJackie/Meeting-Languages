using System;

namespace _065_Оператор_Continue
{ // Применить оператор continue 
    class ContDemo
    {
        static void Main()
        {
            // Вывести четные числа от 0 до 100
            for (int i = 0; i <= 100; i++)
            {
                if ((i % 2) != 0) continue; // перейти к следующему шагу итерации
                Console.Write(i + " ");
            }
        }
    }
}
