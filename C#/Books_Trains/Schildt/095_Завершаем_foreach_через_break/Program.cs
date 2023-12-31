using System;

namespace _095_Завершаем_foreach_через_break
{ // Использовать оператор break для преждевременного завершения цикла foreach
    class ForeachDemo
    {
        static void Main()
        {
            int sum = 0;
            int[] nums = new int[10];

            // Задать первоначальные значения элементов массива nums
            for (int i = 0; i < 10; i++)
                nums[i] = i;
            // Использовать foreach для вывода зн-й эл-в массива и подсчета их суммы
            foreach (int x in nums)
            {
                Console.WriteLine("" + x);
                sum += x;
                if (x == 4) break; // прервать цикл, как только индекс массива достигнет 4
            }
            Console.WriteLine("Сумма первых 5 элементов: " + sum);
        }
    }
}
