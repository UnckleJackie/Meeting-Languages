using System;

namespace _4_3_Инициализация_Одномерного_Массива
{
    internal class IntArrayDemo
    {
        static void Main()
        { // Создание и инициализация массивов
            int[] nums = { 1, 3, 5, 7, 6, 5, 4 };
            char[] symbs = new char[] { 'A', 'Z', 'Z', 'B', 'Y' };
            string[] txts = new string[3] { "one", "two", "three" };

            Console.WriteLine("Array nums: "); // Отображение содержимого массивов
            for (int k = 0; k < nums.Length; k++)
            {
                Console.Write(nums[k] + " ");
            }

            Console.WriteLine("\nArray symbs: ");
            for (int k = 0; k < symbs.Length; k++)
            {
                Console.Write(symbs[k] + " ");
            }

            Console.WriteLine("\nArray txts: ");
            for (int k = 0; k < txts.Length; k++)
            {
                Console.Write(txts[k] + " ");
            }
            Console.WriteLine();
        }
    }
}
