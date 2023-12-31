using System;

namespace _043_Оператор_if_else
{ // Определить, является ли числовое значение положительным или отрицательным
    class PosNeg
    {
        static void Main()
        {
            int i;
            for (i = -5; i <= 5; i++)
            {
                Console.Write("Проверка " + i + ": ");

                if (i < 0) Console.WriteLine("отрицательное число");
                else Console.WriteLine("положительное число");
            }
        }
    }
}