using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Определение_Числа_3_4
{
    class AnotherNestedIfDemo
    {
        static void Main()
        {
            int number; // Переменная для запоминания введенного числа
            Console.Write("Введите целое число: "); // Отображение сообщения
            number = Int32.Parse(Console.ReadLine()); // Считывание числа

            if (number == 1) Console.WriteLine("Ты ввел единицу!");
            else if (number == 2) Console.WriteLine("Ты ввел двойку!");
            else if (number == 3) Console.WriteLine("Ты ввел тройку!");
            else if (number == 4) Console.WriteLine("Ты ввел четыре!");
            else Console.WriteLine("А вот это непонятно че ты навводил!.."); // Все прочие случаи
        }
    }
}
