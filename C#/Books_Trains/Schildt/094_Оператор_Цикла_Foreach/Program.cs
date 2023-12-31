using System;

namespace _094_Оператор_Цикла_Foreach
{ // Использовать оператор цикла foreach
    class ForeachDemo
    {
        static void Main()
        {
            int sum = 0;
            int[] nums = new int[10];

            // Задать первоначальные значения элементов массиваnums
            for (int i = 0; i < 10; i++)
                nums[i] = i;

            // Использовать цикл foreach для вывода значений эл-в массива и подсчета их суммы
            foreach (int x in nums)
            {
                Console.WriteLine("Значение элемента равно:" + x);
                sum += x;
            }
            Console.WriteLine("Сумма равна: " + sum);
        }
    }
}
