using System;

namespace _044_if_else_Проверяем_Числа
{
    class PosNegZero
    { // Определить, является ли числовое значение положительным, отрицательным или нулевым
        static void Main()
        {
            int i;

            for (i = -5; i <= 5; i++)
            {
                Console.Write("Проверка " + i + ": ");
                if (i < 0) Console.WriteLine("отрицательное число");
                else if (i == 0) Console.WriteLine("число без знака");
                else Console.WriteLine("положительное число");
            }
        }
    }
}
