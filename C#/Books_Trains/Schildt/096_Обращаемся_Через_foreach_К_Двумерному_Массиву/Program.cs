using System;

namespace _096_Обращаемся_Через_foreach_К_Двумерному_Массиву
{ // Использовать оператор цикла foreach для обращения к двумерному массиву
    class ForeachDemo2
    {
        static void Main()
        {
            int sum = 0;
            int[,] nums = new int[3, 5];

            // Задать первоначальные значения элементов массива nums
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 5; j++)
                    nums[i, j] = (i + 1) * (j + 1);
            // Использовать цикл foreаch для вывода значений элементов массива и подсчета их суммы
            foreach (int x in nums)
                {
                Console.WriteLine("Значение элемента равно: " + x);
                sum += x;
            }
            Console.WriteLine("Сумма равна: " + sum);
        }
    }
}
